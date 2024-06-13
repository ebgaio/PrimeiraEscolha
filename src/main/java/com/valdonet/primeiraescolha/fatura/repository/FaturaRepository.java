package com.valdonet.primeiraescolha.fatura.repository;

import com.valdonet.primeiraescolha.fatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

}
