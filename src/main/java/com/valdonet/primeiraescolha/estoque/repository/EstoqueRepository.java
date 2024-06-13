package com.valdonet.primeiraescolha.estoque.repository;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
