package com.valdonet.primeiraescolha.pedido.model;

import com.valdonet.primeiraescolha.cliente.model.Cliente;
import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PedidoDTO {

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

    List<ItemPedido> itemPedidos;
}
