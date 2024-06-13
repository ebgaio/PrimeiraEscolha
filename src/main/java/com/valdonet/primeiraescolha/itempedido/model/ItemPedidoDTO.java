package com.valdonet.primeiraescolha.itempedido.model;

import com.valdonet.primeiraescolha.pedido.model.StatusPedido;
import com.valdonet.primeiraescolha.pessoa.cliente.model.Cliente;
import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ItemPedidoDTO {

    private Long quantidade;

    private BigDecimal precoUnitario;

    private Produto produto;

}
