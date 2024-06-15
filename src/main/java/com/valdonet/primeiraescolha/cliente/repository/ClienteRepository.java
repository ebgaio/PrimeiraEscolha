package com.valdonet.primeiraescolha.cliente.repository;

import com.valdonet.primeiraescolha.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findClienteByNome(final String nome);
}
