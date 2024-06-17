package com.valdonet.primeiraescolha.itenspedido.service;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTO;
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

    public ItensPedido getItensPedido(Long id) {

        Optional<ItensPedido> itensPedido = repository.findById(id);

        if (!itensPedido.isPresent()) {
            return null;
        }

        return itensPedido.get();
    }

    public ItensPedido save(ItensPedidoDTO itensPedidoDto) {

        ItensPedido itensPedido  = new ItensPedido ();

        itensPedido.setQuantidade (itensPedidoDto.getQuantidade ());
        itensPedido.setPrecoUnitario (itensPedidoDto.getPrecoUnitario ());
        itensPedido = repository.save(itensPedido);

        return itensPedido;
    }

    public List<ItensPedido> listAllItensPedidos() {

        List<ItensPedido> itensPedido = repository.findAll();
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
