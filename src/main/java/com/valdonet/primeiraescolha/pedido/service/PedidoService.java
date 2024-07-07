package com.valdonet.primeiraescolha.pedido.service;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pedido.model.PedidoDTO;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;

    public Pedido getPedido(Long id) {

        Optional<Pedido> pedido = repository.findPedidoById(id);

        return pedido.orElse(null);
    }

    public Pedido save(PedidoDTO pedidoDto) {

        Pedido pedido  = new Pedido();

        pedido.setStatusPedido(pedidoDto.getStatusPedido());
        pedido.setDataPedido(pedidoDto.getDataPedido());
        pedido = repository.save(pedido);

        return pedido;
    }

    public List<Pedido> listAllPedidos() {

        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changePedido(PedidoDTO pedidoDto) {
    }

}
