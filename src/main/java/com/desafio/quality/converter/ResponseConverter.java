package com.desafio.quality.converter;

import java.util.ArrayList;
import java.util.List;

import com.desafio.quality.dto.ResponseDTO;
import com.desafio.quality.model.Titulo;

public class ResponseConverter {
	
	private Titulo titulo;
	
	private ResponseDTO dto;
	
	
	public static ResponseDTO converter(Titulo titulo) {
		return new ResponseDTO(titulo.getBanco().getNome(), titulo.getUsuario().getNome(), titulo.getValorCobranca().toString(),
				titulo.getCancelado(),titulo.getQtdParcelas().toString(), titulo.getUsuario().getId().toString());
	}
	
	
	public static List<ResponseDTO> converter(List<Titulo> titulos){
		List<ResponseDTO> dtos = new ArrayList<>();
		for (Titulo titulo : titulos) {
			dtos.add(ResponseConverter.converter(titulo));
		}
		
		return dtos;
	}
	
	
	public ResponseConverter() {
		super();
	}

	public ResponseConverter(Titulo titulo, ResponseDTO dto) {
		super();
		this.titulo = titulo;
		this.dto = dto;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public ResponseDTO getDto() {
		return dto;
	}

	public void setDto(ResponseDTO dto) {
		this.dto = dto;
	}

}
