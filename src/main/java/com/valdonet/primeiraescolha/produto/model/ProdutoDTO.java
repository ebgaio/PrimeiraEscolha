package com.valdonet.primeiraescolha.produto.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoDTO {

    private String nome;

    private String descricao;

    private BigDecimal preco;

}
