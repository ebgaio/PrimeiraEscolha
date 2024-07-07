package com.valdonet.primeiraescolha.pessoa.repository;

import com.valdonet.primeiraescolha.entrega.model.EntregaDTO;
import com.valdonet.primeiraescolha.pessoa.Endereco;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.model.PessoaDTO;
import com.valdonet.primeiraescolha.pessoa.model.TipoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT pessoa FROM Pessoa pessoa " +
            "JOIN Endereco endereco " +
            "ON pessoa.id = endereco.pessoa.id")
    List<Pessoa> findAllPessoas();

    @Query("SELECT endereco FROM Endereco endereco " +
           "JOIN Pessoa pessoa " +
           "ON pessoa.id = endereco.pessoa.id " +
           "WHERE pessoa.id = :idPessoa")
    Endereco findAllEnderecoByIdPessoa(@Param("idPessoa") Long idPessoa);

    @Query("SELECT pessoa FROM Pessoa pessoa " +
           "WHERE pessoa.id = :idPessoa")
    Optional<Pessoa> findPessoaById(@Param("idPessoa") Long idPessoa);
}
