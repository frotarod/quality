package com.desafio.quality.service;

import java.util.List;

import com.desafio.quality.model.Titulo;

public interface TituloService {
	List<Titulo> buscaTodos();
	List<Titulo> buscaPorUsuario(String nome);
}
