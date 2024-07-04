package com.valdonet.primeiraescolha.pedido.model;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PedidoDTO {

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

}
