package com.desafio.quality.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.quality.model.Cidade;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long> {
	@Query("SELECT c FROM Cidade c WHERE c.uf = :uf")
	public Cidade buscaPorCodigoUf( @Param("uf") String uf);
}
