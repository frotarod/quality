package com.desafio.quality.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Titulo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -951425946115209603L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCompetencia;
	
	private BigDecimal valorCobranca;
	
	private Integer qtdParcelas;
	
	private Boolean cancelado;
	
	private String textoJustificativaCancelado;
	
	private Date cancelamento;
	
	@ManyToOne
	private Banco banco;

	
    
    
	public Titulo(Long id, Usuario usuario, Date dataCompetencia, BigDecimal valorCobranca, Integer qtdParcelas,
			Boolean cancelado, String textoJustificativaCancelado, Date cancelamento, Banco banco) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.dataCompetencia = dataCompetencia;
		this.valorCobranca = valorCobranca;
		this.qtdParcelas = qtdParcelas;
		this.cancelado = cancelado;
		this.textoJustificativaCancelado = textoJustificativaCancelado;
		this.cancelamento = cancelamento;
		this.banco = banco;
	}
	
	public Titulo(Usuario usuario, Date dataCompetencia, BigDecimal valorCobranca, Integer qtdParcelas,
			Boolean cancelado, String textoJustificativaCancelado, Date cancelamento, Banco banco) {
		super();
		this.usuario = usuario;
		this.dataCompetencia = dataCompetencia;
		this.valorCobranca = valorCobranca;
		this.qtdParcelas = qtdParcelas;
		this.cancelado = cancelado;
		this.textoJustificativaCancelado = textoJustificativaCancelado;
		this.cancelamento = cancelamento;
		this.banco = banco;
	}
	
	public Titulo() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataCompetencia() {
		return dataCompetencia;
	}

	public void setDataCompetencia(Date dataCompetencia) {
		this.dataCompetencia = dataCompetencia;
	}

	public BigDecimal getValorCobranca() {
		return valorCobranca;
	}

	public void setValorCobranca(BigDecimal valorCobranca) {
		this.valorCobranca = valorCobranca;
	}

	public Integer getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(Integer qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public Boolean getCancelado() {
		return cancelado;
	}

	public void setCancelado(Boolean cancelado) {
		this.cancelado = cancelado;
	}

	public String getTextoJustificativaCancelado() {
		return textoJustificativaCancelado;
	}

	public void setTextoJustificativaCancelado(String textoJustificativaCancelado) {
		this.textoJustificativaCancelado = textoJustificativaCancelado;
	}

	public Date getCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(Date cancelamento) {
		this.cancelamento = cancelamento;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	

}
