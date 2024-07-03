package com.valdonet.primeiraescolha.pessoa.model;

import com.valdonet.primeiraescolha.pessoa.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PessoaDTO {

    private String nome;

    private String sobreNome;

    private String telefone;

    private TipoPessoa tipoPessoa;

//    private Long endereco;

}
