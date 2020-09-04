package com.desafio.quality.dto;

public class ResponseDTO {
	
	private String nomeBanco;
	
	private String nomeUsuario;
	
	private String valor;
	
	private Boolean status;
	
	private String qtdParcela;
	
	private String identificadorUsuario;
	
	

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(String nomeBanco, String nomeUsuario, String valor, Boolean status, String qtdParcela
			, String identificadorUsuario) {
		super();
		this.nomeBanco = nomeBanco;
		this.nomeUsuario = nomeUsuario;
		this.valor = valor;
		this.status = status;
		this.qtdParcela = qtdParcela;
		this.identificadorUsuario = identificadorUsuario;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getQtdParcela() {
		return qtdParcela;
	}

	public void setQtdParcela(String qtdParcela) {
		this.qtdParcela = qtdParcela;
	}

	public String getIdentificadorUsuario() {
		return identificadorUsuario;
	}

	public void setIdentificadorUsuario(String identificadorUsuario) {
		this.identificadorUsuario = identificadorUsuario;
	}
}
