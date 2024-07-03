package com.valdonet.primeiraescolha.pedido.service;

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

        Optional<Pedido> pedido = repository.findById(id);

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

//        Optional<Cliente> cliente = clienteRepository.findClienteByNome(pedidoDto.getCliente().getNome());
//        if (cliente.isEmpty()) {
//            System.out.println("Cliente não encontrado");
//        }
//
//        Optional<Pedido> pedido = repository.findById(cliente.get().getId());
//        if (pedido.isEmpty()) {
//            System.out.println("Pedido não encontrado.");
//        }
//
//        pedido.get().setStatusPedido(pedidoDto.getStatusPedido());
//        pedido.get().setDataPedido(pedidoDto.getDataPedido());
//        repository.save(pedido.get());
    }

}
