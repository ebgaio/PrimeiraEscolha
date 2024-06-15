package com.valdonet.primeiraescolha.fornecedor.model;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import lombok.Data;

@Data
public class FornecedorDTO {

    private String cnpj;

    private Pessoa pessoa;

}
