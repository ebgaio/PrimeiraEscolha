package com.valdonet.primeiraescolha.itempedido.service;

import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import com.valdonet.primeiraescolha.itempedido.model.ItemPedidoDTO;
import com.valdonet.primeiraescolha.itempedido.repository.ItemPedidoRepository;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemPedidoService {

    private final ItemPedidoRepository repository;
    private final PedidoRepository clienteRepository;

    public ItemPedido getItemPedido(Long id) {

        Optional<ItemPedido> itemPedido = repository.findById(id);

        if (!itemPedido.isPresent()) {
            return null;
        }

        return itemPedido.get();
    }

    public ItemPedido save(ItemPedidoDTO itemPedidoDto) {

        ItemPedido itemPedido  = new ItemPedido();

        itemPedido.setQuantidade (itemPedidoDto.getQuantidade ());
        itemPedido.setPrecoUnitario (itemPedidoDto.getPrecoUnitario ());
        itemPedido = repository.save(itemPedido);

        return itemPedido;
    }

    public List<ItemPedido> listAllItemPedidos() {

        List<ItemPedido> itemPedidos = repository.findAll();
        return itemPedidos;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeItemPedido(ItemPedidoDTO itemPedidoDto) {

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

    public ItemPedido listItemPedido(Long id) {
        return repository.findById(id).orElse(null);
    }
}
