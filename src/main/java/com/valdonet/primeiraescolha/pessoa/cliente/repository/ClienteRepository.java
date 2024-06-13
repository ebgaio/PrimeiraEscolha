package com.valdonet.primeiraescolha.pessoa.cliente.repository;

import com.valdonet.primeiraescolha.pessoa.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findClienteByNome(final String nome);
}
