package com.valdonet.primeiraescolha.funcionario.repository;

import com.valdonet.primeiraescolha.funcionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
