package com.desafio.quality.converter;

import java.util.Date;

import com.desafio.quality.dto.RequestUsuarioDTO;
import com.desafio.quality.enuns.TipoDocumentoEnum;
import com.desafio.quality.model.Usuario;

public class UsuarioConverter {
	private Usuario usuario;
	
	private RequestUsuarioDTO dto;
	
	public static Usuario converter(RequestUsuarioDTO dto, TipoDocumentoEnum documentoEnum) {
		return new Usuario(dto.getNome(), dto.getDocumento(), documentoEnum, dto.getCodigo(), new Date(), dto.getIdUsuario());
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public RequestUsuarioDTO getDto() {
		return dto;
	}
	public void setDto(RequestUsuarioDTO dto) {
		this.dto = dto;
	}

}
