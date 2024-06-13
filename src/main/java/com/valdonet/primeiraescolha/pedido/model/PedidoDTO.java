package com.valdonet.primeiraescolha.pedido.model;

import com.valdonet.primeiraescolha.pessoa.cliente.model.Cliente;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PedidoDTO {

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

    private Cliente cliente;

}
