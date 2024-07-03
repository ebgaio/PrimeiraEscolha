package com.valdonet.primeiraescolha.estoque.repository;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    @Query("SELECT produto FROM Produto produto " +
            "JOIN Estoque estoque " +
            "ON estoque.produto.id = produto.id " +
            "WHERE estoque.produto.id = :idProduto")
    List<Produto> findByEstoqueProduto(@Param("idProduto") Long idProduto);

    @Query("SELECT pessoa FROM Pessoa pessoa " +
            "JOIN Estoque estoque " +
            "ON estoque.pessoa.id = pessoa.id " +
            "WHERE estoque.pessoa.id = :idPessoa")
    List<Pessoa> findByEstoquePessoa(@Param("idPessoa") Long idPessoa);

}
