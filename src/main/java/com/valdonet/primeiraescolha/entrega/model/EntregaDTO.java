package com.valdonet.primeiraescolha.entrega.model;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EntregaDTO {

    private LocalDateTime dataEntrega;

    private StatusEntrega statusEntrega;

    private Pedido pedido;

}
