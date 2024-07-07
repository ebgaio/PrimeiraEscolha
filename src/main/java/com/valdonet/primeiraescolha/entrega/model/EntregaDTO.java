package com.valdonet.primeiraescolha.entrega.model;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EntregaDTO {

    private Long id;

    private LocalDateTime dataEntrega;

    private StatusEntrega statusEntrega;

    private Pedido pedido;

    public EntregaDTO (Long id, LocalDateTime dataEntrega, StatusEntrega statusEntrega, Pedido pedido) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.statusEntrega = statusEntrega;
        this.pedido = pedido;
    }
}
