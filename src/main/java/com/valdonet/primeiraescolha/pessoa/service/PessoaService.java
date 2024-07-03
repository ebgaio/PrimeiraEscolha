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

    public PessoaDTO getPessoa(Long id) {

        Optional<PessoaDTO> pessoaDTO = repository.findPessoaById(id);

        return pessoaDTO.orElse(null);

    }

    public Pessoa save(PessoaDTO pessoaDto) {

        Pessoa pessoa  = new Pessoa ();

        pessoa.setNome (pessoaDto.getNome ());
        pessoa.setSobrenome (pessoaDto.getSobreNome ());
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
