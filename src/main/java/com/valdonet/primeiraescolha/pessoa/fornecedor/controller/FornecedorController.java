package com.valdonet.primeiraescolha.pessoa.fornecedor.controller;

import com.valdonet.primeiraescolha.pessoa.fornecedor.model.Fornecedor;
import com.valdonet.primeiraescolha.pessoa.fornecedor.model.FornecedorDTO;
import com.valdonet.primeiraescolha.pessoa.fornecedor.service.FornecedorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeiraescolha")
@RestController
@AllArgsConstructor
public class FornecedorController {

    private final FornecedorService service;

    @GetMapping("/fornecedor/{id}")
    public ResponseEntity getFornecedor(@PathVariable("id") Long id) {

        Fornecedor fornecedor = service.getFornecedor(id);

        return ResponseEntity.status(HttpStatus.OK).body(fornecedor);
    }

    @GetMapping("/fornecedor")
    public ResponseEntity<List<Fornecedor>> listAllFornecedors() {

        List<Fornecedor> fornecedor = service.listAllFornecedors();

        return ResponseEntity.status(HttpStatus.OK).body(fornecedor);
    }

    @PostMapping("/fornecedor")
    public ResponseEntity<Fornecedor> saveFornecedor(@RequestBody FornecedorDTO fornecedorDto) {

        Fornecedor fornecedorSave = service.save(fornecedorDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorSave);
    }

    @DeleteMapping("/fornecedor/{id}")
    public void deleteFornecedor(@PathVariable Long id) {
        service.deleteById(id);
    }
}
