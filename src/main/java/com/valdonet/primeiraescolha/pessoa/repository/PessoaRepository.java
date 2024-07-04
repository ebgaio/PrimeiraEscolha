package com.valdonet.primeiraescolha.pessoa.repository;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.model.PessoaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT new com.valdonet.primeiraescolha.pessoa.model.PessoaDTO(" +
            "pessoa.nome, pessoa.sobrenome, pessoa.telefone," +
            " pessoa.tipoPessoa, pessoa.enderecos) " +
            "FROM Pessoa pessoa " +
            "WHERE pessoa.id = :id")
    Optional<PessoaDTO> findPessoaById(@Param("id") Long id);

    @Query("SELECT pessoa FROM Pessoa pessoa")
    List<Pessoa> findAllPessoas();
}
