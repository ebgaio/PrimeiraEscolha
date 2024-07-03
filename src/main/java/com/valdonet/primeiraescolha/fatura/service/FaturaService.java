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

    public Fatura getFatura(Long id) {

        Optional<Fatura> fatura = repository.findById(id);

        return fatura.orElse(null);

    }

    public Fatura save(FaturaDTO faturaDto) {

        Fatura fatura  = new Fatura();

        fatura.setDataFatura (faturaDto.getDataFatura ());
        fatura.setValorTotal (faturaDto.getValorTotal ());
        fatura = repository.save(fatura);

        return fatura;
    }

    public List<Fatura> listAllFaturas() {

        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeFatura(FaturaDTO faturaDto) {

    }

    public Fatura listFatura(Long id) {
        return repository.findById(id).orElse(null);
    }
}
