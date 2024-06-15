package com.valdonet.primeiraescolha.estoque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFornecedorPK {

    private Long fornecedor;

    private Long produto;

}
