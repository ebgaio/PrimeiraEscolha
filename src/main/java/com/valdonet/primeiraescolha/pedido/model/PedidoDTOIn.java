package com.valdonet.primeiraescolha.pedido.model;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTO;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class PedidoDTOIn {

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

    private Long idPessoa;

    private List<ItensPedidoDTO> itensPedidos;

}
