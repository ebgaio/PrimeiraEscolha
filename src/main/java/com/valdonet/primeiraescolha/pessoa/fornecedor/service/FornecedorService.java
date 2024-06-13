package com.valdonet.primeiraescolha.pessoa.fornecedor.service;

import com.valdonet.primeiraescolha.pessoa.fornecedor.model.Fornecedor;
import com.valdonet.primeiraescolha.pessoa.fornecedor.model.FornecedorDTO;
import com.valdonet.primeiraescolha.pessoa.fornecedor.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor getFornecedor(Long id) {

        Optional<Fornecedor> fornecedor = repository.findById(id);

        if (!fornecedor.isPresent()) {
            return null;
        }

        return fornecedor.get();
    }

    public Fornecedor save(FornecedorDTO fornecedorDto) {

        Fornecedor fornecedor  = new Fornecedor();

        fornecedor.setNome(fornecedorDto.getNome());
        fornecedor.setCnpj(fornecedorDto.getCnpj());
        fornecedor = repository.save(fornecedor);

        return fornecedor;
    }

    public List<Fornecedor> listAllFornecedors() {

        List<Fornecedor> fornecedors = repository.findAll();
        return fornecedors;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
