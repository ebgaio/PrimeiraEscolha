package com.valdonet.primeiraescolha.itempedido.repository;

import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
