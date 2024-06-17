package com.valdonet.primeiraescolha.cliente.service;

import com.valdonet.primeiraescolha.cliente.model.Cliente;
import com.valdonet.primeiraescolha.cliente.model.ClienteDTO;
import com.valdonet.primeiraescolha.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente getCliente(Long id) {

        Optional<Cliente> cliente = repository.findById(id);

        if (!cliente.isPresent()) {
            return null;
        }

        return cliente.get();
    }

    public Cliente save(ClienteDTO clienteDto) {

        Cliente cliente  = new Cliente();

        cliente.setCpf(clienteDto.getCpf ());
        cliente.setPessoa(clienteDto.getPessoa ());
        cliente = repository.save(cliente);

        return cliente;
    }

    public List<Cliente> listAllClientes() {

        List<Cliente> clientes = repository.findAll();
        return clientes;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
