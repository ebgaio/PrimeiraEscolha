package com.valdonet.primeiraescolha.funcionario.controller;

import com.valdonet.primeiraescolha.funcionario.service.FuncionarioService;
import com.valdonet.primeiraescolha.funcionario.model.Funcionario;
import com.valdonet.primeiraescolha.funcionario.model.FuncionarioDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class FuncionarioController {

    private final FuncionarioService service;

    @GetMapping("/funcionario/{id}")
    public ResponseEntity getFuncionario(@PathVariable("id") Long id) {

        Funcionario funcionario = service.getFuncionario(id);

        return ResponseEntity.status(HttpStatus.OK).body(funcionario);
    }

    @GetMapping("/funcionario")
    public ResponseEntity<List<Funcionario>> listAllFuncionarios() {

        List<Funcionario> funcionario = service.listAllFuncionarios();

        return ResponseEntity.status(HttpStatus.OK).body(funcionario);
    }

    @PostMapping("/funcionario")
    public ResponseEntity<Funcionario> saveFuncionario(@RequestBody FuncionarioDTO funcionarioDto) {

        Funcionario funcionarioSave = service.save(funcionarioDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioSave);
    }

    @DeleteMapping("/funcionario/{id}")
    public void deleteFuncionario(@PathVariable Long id) {
        service.deleteById(id);
    }
}
