package com.valdonet.primeiraescolha.produto.repository;

import com.valdonet.primeiraescolha.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
