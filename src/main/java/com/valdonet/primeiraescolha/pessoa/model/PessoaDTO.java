package com.valdonet.primeiraescolha.pessoa.model;

import com.valdonet.primeiraescolha.pessoa.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
public class PessoaDTO {

    private String nome;

    private String sobrenome;

    private String telefone;

    private TipoPessoa tipoPessoa;

    private List<Endereco> enderecos;
}
