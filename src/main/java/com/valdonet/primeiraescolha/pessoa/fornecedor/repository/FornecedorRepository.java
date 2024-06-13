package com.valdonet.primeiraescolha.pessoa.fornecedor.repository;

import com.valdonet.primeiraescolha.pessoa.fornecedor.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
