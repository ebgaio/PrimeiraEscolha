package com.valdonet.primeiraescolha.pedido.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.valdonet.primeiraescolha.entrega.model.Entrega;
import com.valdonet.primeiraescolha.fatura.model.Fatura;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
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

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pedido")
    private StatusPedido statusPedido;

    @Getter
//    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItensPedido> itensPedido = new ArrayList<>();

    @JsonIgnore
    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Entrega entrega;

    @JsonIgnore
    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Fatura fatura;

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
