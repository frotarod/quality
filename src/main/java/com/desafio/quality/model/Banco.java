package com.desafio.quality.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Banco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2631970372418095966L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String codBancario;
	
	private Integer codigo;
	
	@OneToMany(mappedBy = "banco", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Titulo> titulo;
	
	public Banco() {
		super();
	}

	public Banco(Long id, String nome, String codBancario, Integer codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.codBancario = codBancario;
		this.codigo = codigo;
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

	public String getCodBancario() {
		return codBancario;
	}

	public void setCodBancario(String codBancario) {
		this.codBancario = codBancario;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Titulo> getTitulo() {
		return titulo;
	}

	public void setTitulo(List<Titulo> titulo) {
		this.titulo = titulo;
	}
	
	
	
}
