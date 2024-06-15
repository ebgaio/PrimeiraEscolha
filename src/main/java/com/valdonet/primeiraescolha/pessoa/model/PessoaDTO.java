package com.valdonet.primeiraescolha.pessoa.model;

import lombok.Data;

@Data
public class PessoaDTO {

    private String nome;

    private String sobreNome;

    private String telefone;

    private TipoPessoa tipoPessoa;

}
