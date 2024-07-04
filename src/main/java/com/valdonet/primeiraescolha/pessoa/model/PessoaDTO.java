package com.valdonet.primeiraescolha.pessoa.model;

import com.valdonet.primeiraescolha.pessoa.Endereco;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class PessoaDTO {

    private String nome;

    private String sobrenome;

    private String telefone;

    private TipoPessoa tipoPessoa;

    private List<Endereco> enderecos;

    public PessoaDTO (String nome, String sobrenome, String telefone, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.tipoPessoa = tipoPessoa;
    }
}
