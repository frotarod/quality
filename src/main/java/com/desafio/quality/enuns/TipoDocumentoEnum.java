package com.desafio.quality.enuns;

import com.desafio.quality.utils.Util;

public enum TipoDocumentoEnum {
	CPF("cpf", 11,false), CNPJ("ncpj", 14, false);
	
	private String tipo;
	
	private Integer tamanho;
	
	private Boolean valido;

	
	
	private TipoDocumentoEnum(String tipo, Integer tamanho, Boolean valido) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.valido = valido;
	}

	public String getTipo() {
		return tipo;
	}

	public Integer getTamanho() {
		return tamanho;
	}
	
	public Boolean getValido() {
		return valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}

	public static TipoDocumentoEnum get(String documento) {
		if(documento.length() == 11) {
			CPF.setValido(Util.isValidCPF(documento));
			return CPF;
		}else if(documento.length() == 14) {
			CNPJ.setValido(Util.isValidCNPJ(documento));
			return CNPJ;
		}
		
		return null;
	}
	
	
}
