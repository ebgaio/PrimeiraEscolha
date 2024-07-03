package com.valdonet.primeiraescolha.estoque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFornecedorPK {

    private Long pessoa;
    private Long produto;

    // getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoFornecedorPK that = (ProdutoFornecedorPK) o;
        return Objects.equals(pessoa, that.pessoa) &&
                Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pessoa, produto);
    }

}
