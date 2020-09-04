package com.desafio.quality.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.quality.model.Titulo;
import com.desafio.quality.repository.TituloRepository;

@Service
public class TituloServiceImpl implements TituloService {
	
	private TituloRepository repository;
	@Autowired
	public TituloServiceImpl(TituloRepository repository) {
		this.repository = repository;
	}

	public Titulo buscaPorId(Long indentificador) {
		return repository.findById(indentificador).orElse(new Titulo());
	}
	@Transactional
	public List<Titulo> buscaTodos() {
		return (List<Titulo>) repository.findAll();
	}
	
	@Transactional
	public List<Titulo> buscaPorUsuario(String nome){
		return (List<Titulo>) repository.buscaPorUsuario(nome);
	}
	
}
