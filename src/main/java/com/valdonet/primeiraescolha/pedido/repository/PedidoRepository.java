package com.valdonet.primeiraescolha.pedido.repository;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query("SELECT pedido FROM Pedido pedido " +
           "WHERE pedido.id = :idPedido")
    Optional<Pedido> findPedidoById(@Param("idPedido") Long idPedido);

    @Query("SELECT pessoa FROM Pessoa pessoa " +
           "WHERE pessoa.id = :idPessoa")
    Pessoa findPessoaById(@Param("idPessoa") Long idPessoa);
}
