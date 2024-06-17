package com.valdonet.primeiraescolha.itenspedido.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItensPedidoDTO {

    private Long quantidade;

    private BigDecimal precoUnitario;

}
