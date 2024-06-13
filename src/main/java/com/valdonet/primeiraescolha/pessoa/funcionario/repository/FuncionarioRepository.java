package com.valdonet.primeiraescolha.pessoa.funcionario.repository;

import com.valdonet.primeiraescolha.pessoa.funcionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
