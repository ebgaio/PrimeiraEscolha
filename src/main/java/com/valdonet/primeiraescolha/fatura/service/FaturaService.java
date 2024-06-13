package com.valdonet.primeiraescolha.fatura.service;

import com.valdonet.primeiraescolha.fatura.model.Fatura;
import com.valdonet.primeiraescolha.fatura.model.FaturaDTO;
import com.valdonet.primeiraescolha.fatura.repository.FaturaRepository;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FaturaService {

    private final FaturaRepository repository;
    private final PedidoRepository pedidoRepository;

    public Fatura getFatura(Long id) {

        Optional<Fatura> fatura = repository.findById(id);

        if (!fatura.isPresent()) {
            return null;
        }

        return fatura.get();
    }

    public Fatura save(FaturaDTO faturaDto) {

        Fatura fatura  = new Fatura();

        fatura.setDataFatura (faturaDto.getDataFatura ());
        fatura.setPedido (faturaDto.getPedido ());
        fatura.setValorTotal (faturaDto.getValorTotal ());
        fatura = repository.save(fatura);

        return fatura;
    }

    public List<Fatura> listAllFaturas() {

        List<Fatura> fatura = repository.findAll();
        return fatura;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeFatura(FaturaDTO aturaDto) {

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

    public Fatura listFatura(Long id) {
        return repository.findById(id).orElse(null);
    }
}
