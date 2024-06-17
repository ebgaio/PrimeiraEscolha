package com.valdonet.primeiraescolha.itenspedido.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.valdonet.primeiraescolha.produto.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "itens_pedido")
public class ItensPedido {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;

    @Getter
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, nullable = false)
    private Produto produto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItensPedido that = (ItensPedido) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
