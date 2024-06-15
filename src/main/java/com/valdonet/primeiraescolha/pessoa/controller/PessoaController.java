package com.valdonet.primeiraescolha.pessoa.controller;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.model.PessoaDTO;
import com.valdonet.primeiraescolha.pessoa.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class PessoaController {

    private final PessoaService service;

    @GetMapping("/pessoa/{id}")
    public ResponseEntity getPessoa(@PathVariable("id") Long id) {

        Pessoa pessoa = service.getPessoa(id);

        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @GetMapping("/pessoa")
    public ResponseEntity<List<Pessoa>> listAllPessoas() {

        List<Pessoa> pessoa = service.listAllPessoas();

        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @GetMapping("/pessoa/cliente/{cliente}")
    public ResponseEntity<Pessoa> listAllPessoas(@PathVariable Long id) {

        Pessoa pessoa = service.listPessoa(id);

        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody PessoaDTO pessoaDto) {

        Pessoa pessoaSave = service.save(pessoaDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSave);
    }

    @PatchMapping("/pessoa")
    public void changePessoa(@PathVariable PessoaDTO pessoa) {
        service.changePessoa(pessoa);
    }

    @DeleteMapping("/pessoa/{id}")
    public void deletePessoa(@PathVariable Long id) {
        service.deleteById(id);
    }
}
