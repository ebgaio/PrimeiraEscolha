package com.valdonet.primeiraescolha.pedido.service;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pedido.model.PedidoDTOIn;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
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

    public Pedido save(PedidoDTOIn pedidoDtoIn) {

        Pedido pedido  = new Pedido();
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pedidoDtoIn.getPessoa().getId());
        ItensPedido itensPedido = new ItensPedido();

//        itensPedido.setQuantidade(pedidoDtoIn.getItensPedidos().);

        pedido.setPessoa(pessoa);
        pedido.setStatusPedido(pedidoDtoIn.getStatusPedido());
        pedido.setDataPedido(pedidoDtoIn.getDataPedido());
        pedido.setItensPedido(pedidoDtoIn.getItensPedidos());
        pedido = repository.save(pedido);

        return pedido;
    }

    public List<Pedido> listAllPedidos() {

        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changePedido(PedidoDTOIn pedidoDtoIn) {
    }

}
