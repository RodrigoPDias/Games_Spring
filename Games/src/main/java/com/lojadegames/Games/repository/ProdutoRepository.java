package com.lojadegames.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lojadegames.Games.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByConsoleContainingIgnoreCase (String console);
}
