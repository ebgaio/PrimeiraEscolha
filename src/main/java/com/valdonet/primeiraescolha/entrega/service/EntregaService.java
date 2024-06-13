package com.valdonet.primeiraescolha.entrega.service;

import com.valdonet.primeiraescolha.entrega.model.Entrega;
import com.valdonet.primeiraescolha.entrega.model.EntregaDTO;
import com.valdonet.primeiraescolha.entrega.repository.EntregaRepository;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EntregaService {

    private final EntregaRepository repository;
    private final PedidoRepository pedidoRepository;

    public Entrega getEntrega(Long id) {

        Optional<Entrega> entrega = repository.findById(id);

        if (!entrega.isPresent()) {
            return null;
        }

        return entrega.get();
    }

    public Entrega save(EntregaDTO entregaDto) {

        Entrega entrega  = new Entrega();

        entrega.setDataEntrega (entregaDto.getDataEntrega ());
        entrega.setStatusEntrega (entregaDto.getStatusEntrega ());
        entrega.setPedido (entregaDto.getPedido ());
        entrega = repository.save(entrega);

        return entrega;
    }

    public List<Entrega> listAllEntregas() {

        List<Entrega> entrega = repository.findAll();
        return entrega;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeEntrega(EntregaDTO entregaDto) {

//        Optional<ItemPedido> itemPedido = clienteRepository.findClienteByNome(itemPedidoDto.getCliente().getNome());
//        if (itemPedido.isEmpty()) {
//            System.out.println("ItemPedido não encontrado");
//        }
//
//        Optional<ItemPedido> itemPedido = repository.findById(itemPedido.get().getId());
//        if (itemPedido.isEmpty()) {
//            System.out.println("ItemPedido não encontrado.");
//        }
//
//        itemPedido.get().setStatusPedido(itemPedidoDto.getStatusPedido());
//        itemPedido.get().setDataPedido(itemPedidoDto.getDataPedido());
//        repository.save(itemPedido.get());
    }

    public Entrega listEntrega(Long id) {
        return repository.findById(id).orElse(null);
    }
}
