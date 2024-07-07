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

    public List<EntregaDTO> listAllEntregas() {

        List<EntregaDTO> entregas = repository.findAllEntrega();
        return entregas;
    }

    public EntregaDTO listEntregaByEntrega(Long idEntrega) {

        EntregaDTO entrega = repository.findEntregaByIdEntrega(idEntrega);
        return entrega;
    }

    public EntregaDTO listEntregaByPedido(Long idPedido) {

        EntregaDTO entrega = repository.findEntregaByIdPedido(idPedido);
        return entrega;
    }

    public Entrega save(EntregaDTO entregaDto) {

        Entrega entrega  = new Entrega();

        entrega.setDataEntrega (entregaDto.getDataEntrega ());
        entrega.setStatusEntrega (entregaDto.getStatusEntrega ());
        entrega = repository.save(entrega);

        return entrega;
    }

    public void changeEntrega(EntregaDTO entregaDto) {

    }
}
