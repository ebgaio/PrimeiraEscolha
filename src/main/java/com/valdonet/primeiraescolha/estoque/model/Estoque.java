package com.valdonet.primeiraescolha.estoque.model;

import com.valdonet.primeiraescolha.fornecedor.model.Fornecedor;
import com.valdonet.primeiraescolha.produto.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "estoque")
@IdClass(ProdutoFornecedorPK.class)
public class Estoque {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Estoque estoque = (Estoque) o;
        return Objects.equals (fornecedor, estoque.fornecedor) && Objects.equals (produto, estoque.produto);
    }

    @Override
    public int hashCode () {
        return Objects.hash (super.hashCode (), fornecedor, produto);
    }
}
