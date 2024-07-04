package com.valdonet.primeiraescolha.pessoa.repository;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT pessoa FROM Pessoa pessoa " +
            "INNER JOIN Endereco endereco " +
            "ON pessoa.id = endereco.pessoa.id " +
            "WHERE pessoa.id = :id")
    Optional<Pessoa> findPessoaById(@Param("id") Long id);

    @Query("SELECT pessoa FROM Pessoa pessoa")
    List<Pessoa> findAllPessoas();
}
