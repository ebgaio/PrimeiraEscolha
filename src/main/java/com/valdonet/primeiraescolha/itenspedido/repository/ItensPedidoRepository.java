package com.valdonet.primeiraescolha.itenspedido.repository;

import com.valdonet.primeiraescolha.entrega.model.EntregaDTO;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTOPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ItensPedidoRepository extends JpaRepository<ItensPedido, Long> {

    @Query("SELECT new com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTOPedido(itensPedido.id, itensPedido.quantidade, " +
           "pedido.id, pedido.dataPedido, pedido.statusPedido,  produto.id, produto.nome, produto.descricao, produto.preco)" +
           "FROM ItensPedido itensPedido " +
           "JOIN Pedido pedido " +
           "ON itensPedido.pedido.id = pedido.id " +
           "JOIN Produto produto " +
           "ON itensPedido.produto.id = produto.id ")
    List<ItensPedidoDTOPedido> findAllItensOedido();

    @Query("SELECT new com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTOPedido(itensPedido.id, itensPedido.quantidade, " +
            "pedido.id, pedido.dataPedido, pedido.statusPedido,  produto.id, produto.nome, produto.descricao, produto.preco)" +
            "FROM ItensPedido itensPedido " +
            "JOIN Pedido pedido " +
            "ON itensPedido.pedido.id = pedido.id " +
            "JOIN Produto produto " +
            "ON itensPedido.produto.id = produto.id " +
            "WHERE itensPedido.id = :idItensPedido")
    Optional<ItensPedidoDTOPedido> findAllItensOedidoById(@Param("idItensPedido") Long idItensPedido);
}
