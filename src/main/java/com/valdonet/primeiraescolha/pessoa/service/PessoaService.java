package com.valdonet.primeiraescolha.pessoa.service;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.model.PessoaDTO;
import com.valdonet.primeiraescolha.pessoa.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    public Pessoa getPessoa(Long id) {

        Optional<Pessoa> pessoa = repository.findPessoaById(id);

        return pessoa.orElse(null);

    }

    public Pessoa save(PessoaDTO pessoaDto) {

        Pessoa pessoa  = new Pessoa ();

        pessoa.setNome (pessoaDto.getNome ());
        pessoa.setSobrenome (pessoaDto.getSobrenome ());
        pessoa.setTipoPessoa (pessoaDto.getTipoPessoa ());
        pessoa.setTelefone (pessoaDto.getTelefone ());
        pessoa = repository.save(pessoa);

        return pessoa;
    }

    public List<Pessoa> listAllPessoas() {

        return repository.findAllPessoas();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changePessoa(PessoaDTO pessoaDto) {

    }

    public Pessoa listPessoa(Long id) {
        return repository.findById(id).orElse(null);
    }
}
