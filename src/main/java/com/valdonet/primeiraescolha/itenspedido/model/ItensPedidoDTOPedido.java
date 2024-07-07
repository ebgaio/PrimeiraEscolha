package com.valdonet.primeiraescolha.itenspedido.model;

import com.valdonet.primeiraescolha.pedido.model.StatusPedido;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ItensPedidoDTOPedido {

    private Long idItensPedido;

    private Long quantidade;

    private Long idPedido;

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

    private Long idProduto;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    public ItensPedidoDTOPedido (Long idItensPedido, Long quantidade, Long idPedido, LocalDateTime dataPedido,
                                 StatusPedido statusPedido, Long idProduto, String nome, String descricao, BigDecimal preco) {
        this.idItensPedido= idItensPedido;
        this.quantidade = quantidade;
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
