package com.valdonet.primeiraescolha.pedido.repository;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query("SELECT pedido FROM Pedido pedido")
    List<ItensPedido> findAllItensPedido();
}
