package com.valdonet.primeiraescolha.fornecedor.repository;

import com.valdonet.primeiraescolha.fornecedor.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
