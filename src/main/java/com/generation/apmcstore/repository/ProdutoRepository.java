package com.generation.apmcstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.apmcstore.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
    List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
    List<Produto> findAllByConsoleContainingIgnoreCase(@Param("console") String console);


}
