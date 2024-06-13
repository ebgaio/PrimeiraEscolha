package com.valdonet.primeiraescolha.produto.model;

import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import com.valdonet.primeiraescolha.pessoa.Pessoa;
import com.valdonet.primeiraescolha.pessoa.fornecedor.model.Fornecedor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name= "produto")
public class Produto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quantiadade")
    private Long quantidade;

    @Column(name = "preco")
    private BigDecimal preco;

    @ManyToMany(mappedBy = "produtos")
    private Set<Fornecedor> fornecedores = new HashSet<> ();

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private ItemPedido intemProduto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
