package com.generation.lojagames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByUsuario(String usuario);
	
	List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
