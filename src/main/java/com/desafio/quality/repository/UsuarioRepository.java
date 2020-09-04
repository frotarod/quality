package com.desafio.quality.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.quality.model.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Long>, PagingAndSortingRepository<Usuario, Long> {
	@Query("SELECT c FROM Usuario c WHERE c.nome = :nome")
	public Usuario buscaPorNome( @Param("nome") String nome);
}
