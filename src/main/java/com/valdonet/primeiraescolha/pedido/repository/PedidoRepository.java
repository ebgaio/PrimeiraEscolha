package com.valdonet.primeiraescolha.pedido.repository;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
