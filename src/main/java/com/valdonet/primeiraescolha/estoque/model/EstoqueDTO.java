package com.valdonet.primeiraescolha.estoque.model;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.Data;

@Data
public class EstoqueDTO {

    private Pessoa pessoa;

    private Produto produto;

}
