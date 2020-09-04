package com.desafio.quality.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.quality.model.Titulo;

@Repository
public interface TituloRepository  extends CrudRepository<Titulo, Long> {
	@Query("SELECT c FROM Titulo c WHERE c.dataCompetencia BETWEEN :inicio AND :fim")
	public Titulo buscaPorNome( @Param("inicio") Date inicio, @Param("fim") Date fim);
	
	@Query("select u from Titulo u inner join u.usuario us where us.nome = :nome")
	public List<Titulo> buscaPorUsuario( @Param("nome") String nome);
}
