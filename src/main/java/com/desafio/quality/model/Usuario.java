package com.desafio.quality.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.desafio.quality.enuns.TipoDocumentoEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6376255629993039919L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String documento;
	
	private TipoDocumentoEnum documentoEnum;

	private Integer codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	 @JsonBackReference
	private List<Titulo> titulos; 

	public Usuario() {
		super();
	}

	public Usuario(String nome, String documento, TipoDocumentoEnum documentoEnum,
			Integer codigo, Date data, Long id) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.documentoEnum = documentoEnum;
		this.codigo = codigo;
		this.data = data;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public TipoDocumentoEnum getDocumentoEnum() {
		return documentoEnum;
	}

	public void setDocumentoEnum(TipoDocumentoEnum documentoEnum) {
		this.documentoEnum = documentoEnum;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(List<Titulo> titulos) {
		this.titulos = titulos;
	}
}
