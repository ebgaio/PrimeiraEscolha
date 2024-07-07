package com.valdonet.primeiraescolha.itenspedido.service;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTO;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTOPedido;
import com.valdonet.primeiraescolha.itenspedido.repository.ItensPedidoRepository;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItensPedidoService {

    private final ItensPedidoRepository repository;
    private final PedidoRepository pedidoRepository;

    public ItensPedidoDTOPedido getItensPedido(Long id) {

        Optional<ItensPedidoDTOPedido> itensPedido = repository.findAllItensOedidoById(id);

        if (!itensPedido.isPresent()) {
            return null;
        }

        return itensPedido.get();
    }

    public List<ItensPedidoDTOPedido> listAllItensPedidos() {

        List<ItensPedidoDTOPedido> itensPedido = repository.findAllItensOedido();
        return itensPedido;
    }

    public ItensPedido save(ItensPedidoDTO itensPedidoDto) {

        ItensPedido itensPedido  = new ItensPedido ();

        itensPedido.setQuantidade (itensPedidoDto.getQuantidade ());
        itensPedido = repository.save(itensPedido);

        return itensPedido;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeItensPedido(ItensPedidoDTO itensPedidoDto) {

    }

    public ItensPedido listItensPedido(Long id) {
        return repository.findById(id).orElse(null);
    }
}
