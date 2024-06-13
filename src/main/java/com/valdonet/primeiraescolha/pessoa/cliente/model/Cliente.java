package com.valdonet.primeiraescolha.pessoa.cliente.model;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf")
    private String cpf;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private Pessoa pessoa;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<> ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
