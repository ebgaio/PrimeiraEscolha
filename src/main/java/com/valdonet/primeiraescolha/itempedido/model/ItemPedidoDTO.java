package com.valdonet.primeiraescolha.itempedido.model;

import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemPedidoDTO {

    private Long quantidade;

    private BigDecimal precoUnitario;

    private Produto produto;

}
