package com.desafio.quality.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.desafio.quality.converter.UsuarioConverter;
import com.desafio.quality.dto.RequestUsuarioDTO;
import com.desafio.quality.enuns.TipoDocumentoEnum;
import com.desafio.quality.model.Cidade;
import com.desafio.quality.model.Usuario;
import com.desafio.quality.repository.CidadeRepository;
import com.desafio.quality.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository usuarioRepository;
	private CidadeRepository cidadeRepository;
	
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository, CidadeRepository cidadeRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
		this.cidadeRepository = cidadeRepository;
	}


	public void cria(RequestUsuarioDTO dto) {
		Cidade cidade = cidadeRepository.buscaPorCodigoUf(dto.getUf());
		Usuario usuario = UsuarioConverter.converter(dto, validaDados(dto));
		cidade.getUsuarios().add(usuario);
		usuarioRepository.save(usuario);
		cidadeRepository.save(cidade);
	}
	
	public List<Usuario> buscaTodos(){
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario salva(RequestUsuarioDTO dto) {
		Usuario usuario = UsuarioConverter.converter(dto, TipoDocumentoEnum.get(dto.getDocumento()));
		return usuarioRepository.save(usuario);
	}
	
	public TipoDocumentoEnum validaDados(RequestUsuarioDTO dto) {
		TipoDocumentoEnum documentoEnum = TipoDocumentoEnum.get(dto.getDocumento());
		return documentoEnum;
	}
	
	public void buscaPaginada() {
		Pageable paging = PageRequest.of(0, 10, Sort.by("id"));
		//repository.findAll(paging);
	}
}
