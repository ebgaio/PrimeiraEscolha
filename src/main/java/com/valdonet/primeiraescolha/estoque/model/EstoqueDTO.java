package com.valdonet.primeiraescolha.estoque.model;

import com.valdonet.primeiraescolha.fornecedor.model.Fornecedor;
import com.valdonet.primeiraescolha.produto.model.Produto;
import lombok.Data;

@Data
public class EstoqueDTO {

    private Fornecedor fornecedor;

    private Produto produto;

}
