package com.valdonet.primeiraescolha.pedido.model;

import com.valdonet.primeiraescolha.entrega.model.Entrega;
import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import com.valdonet.primeiraescolha.produto.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataPedido")
    private LocalDateTime dataPedido;

    @Column(name = "statusPedido")
    private StatusPedido statusPedido;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<ItemPedido> itemPedidos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, nullable = false)
    private Entrega entrega;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido that = (Pedido) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
