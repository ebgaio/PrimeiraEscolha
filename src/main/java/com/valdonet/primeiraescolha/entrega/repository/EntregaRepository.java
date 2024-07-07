package com.valdonet.primeiraescolha.entrega.repository;

import com.valdonet.primeiraescolha.entrega.model.Entrega;
import com.valdonet.primeiraescolha.entrega.model.EntregaDTO;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface EntregaRepository extends JpaRepository<Entrega, Long> {

    @Query("SELECT new com.valdonet.primeiraescolha.entrega.model.EntregaDTO(entrega.dataEntrega, entrega.statusEntrega, entrega.pedido)" +
           "FROM Entrega entrega " +
           "JOIN Pedido pedido " +
           "ON entrega.pedido.id = pedido.id " +
           "JOIN ItensPedido itensPedido " +
           "ON pedido.id = itensPedido.id")
    List<EntregaDTO> findAllEntrega();

    @Query("SELECT new com.valdonet.primeiraescolha.entrega.model.EntregaDTO(entrega.dataEntrega, entrega.statusEntrega, entrega.pedido)" +
            "FROM Entrega entrega " +
            "JOIN Pedido pedido " +
            "ON entrega.pedido.id = pedido.id " +
            "WHERE entrega.id = :idEntrega")
    EntregaDTO findEntregaByIdEntrega(@Param("idEntrega") Long idEntrega);

    @Query("SELECT new com.valdonet.primeiraescolha.entrega.model.EntregaDTO(entrega.dataEntrega, entrega.statusEntrega, entrega.pedido)" +
            "FROM Entrega entrega " +
            "JOIN Pedido pedido " +
            "ON entrega.pedido.id = pedido.id " +
            "WHERE pedido.id = :idPedido")
    EntregaDTO findEntregaByIdPedido(@Param("idPedido") Long idPedido);

}
