package com.desafio.quality.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.quality.model.Banco;

@Repository
public interface BancoRepository extends CrudRepository<Banco, Long> {
	@Query("SELECT c FROM Banco c WHERE c.nome = :nome")
	public Banco buscaPorNome( @Param("nome") String nome);
}
