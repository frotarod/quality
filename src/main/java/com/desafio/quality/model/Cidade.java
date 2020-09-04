package com.desafio.quality.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8148811721789584292L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String unidadeFederacao;
	
	private String uf;
	
	private Integer codigoUf;
  
	@OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
	private List<Usuario> usuarios;

	
	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cidade(Integer id, String unidadeFederacao, String uf) {
		super();
		this.id = id;
		this.unidadeFederacao = unidadeFederacao;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUnidadeFederacao() {
		return unidadeFederacao;
	}

	public void setUnidadeFederacao(String unidadeFederacao) {
		this.unidadeFederacao = unidadeFederacao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getCodigoUf() {
		return codigoUf;
	}

	public void setCodigoUf(Integer codigoUf) {
		this.codigoUf = codigoUf;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
