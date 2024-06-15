package com.valdonet.primeiraescolha.funcionario.service;

import com.valdonet.primeiraescolha.funcionario.model.Funcionario;
import com.valdonet.primeiraescolha.funcionario.model.FuncionarioDTO;
import com.valdonet.primeiraescolha.funcionario.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public Funcionario getFuncionario(Long id) {

        Optional<Funcionario> funcionario = repository.findById(id);

        if (!funcionario.isPresent()) {
            return null;
        }

        return funcionario.get();
    }

    public Funcionario save(FuncionarioDTO funcionarioDto) {

        Funcionario funcionario  = new Funcionario();

        funcionario.setCpf(funcionarioDto.getCpf());
        funcionario = repository.save(funcionario);

        return funcionario;
    }

    public List<Funcionario> listAllFuncionarios() {

        List<Funcionario> funcionarios = repository.findAll();
        return funcionarios;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
