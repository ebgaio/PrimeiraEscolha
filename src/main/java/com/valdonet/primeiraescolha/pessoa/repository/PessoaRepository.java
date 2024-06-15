package com.valdonet.primeiraescolha.pessoa.repository;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
