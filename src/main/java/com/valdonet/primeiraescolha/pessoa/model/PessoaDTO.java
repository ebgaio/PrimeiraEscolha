package com.valdonet.primeiraescolha.pessoa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class PessoaDTO {

    private String nome;

    private String sobreNome;

    private String telefone;

    private TipoPessoa tipoPessoa;

    private Long endereco;

    public PessoaDTO (String nome, String sobreNome, String telefone, TipoPessoa tipoPessoa, Long endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.tipoPessoa = tipoPessoa;
        this.endereco = endereco;
    }
}
