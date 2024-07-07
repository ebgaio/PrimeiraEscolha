package com.valdonet.primeiraescolha.itenspedido.model;

import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItensPedidoDTO {

    private Long quantidade;

    private Long idProduto;

}
