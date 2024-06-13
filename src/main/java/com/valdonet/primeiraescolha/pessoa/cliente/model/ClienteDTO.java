package com.valdonet.primeiraescolha.pessoa.cliente.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClienteDTO {

    private String nome;

    private String descricao;

    private BigDecimal preco;

}
