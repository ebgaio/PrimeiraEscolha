package com.valdonet.primeiraescolha.cliente.model;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClienteDTO {

    private String cpf;

    private Pessoa pessoa;

}
