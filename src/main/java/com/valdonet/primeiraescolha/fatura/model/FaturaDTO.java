package com.valdonet.primeiraescolha.fatura.model;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class FaturaDTO {

    private LocalDateTime dataFatura;

    private BigDecimal valorTotal;

    private Pedido pedido;
}
