package com.desafio.quality.service;

import java.util.List;

import com.desafio.quality.dto.RequestUsuarioDTO;
import com.desafio.quality.model.Usuario;

public interface UsuarioService {
	
	void cria(RequestUsuarioDTO dto);
	
	List<Usuario> buscaTodos();
	
	Usuario salva(RequestUsuarioDTO dto);

}
