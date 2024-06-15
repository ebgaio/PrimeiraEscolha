package com.valdonet.primeiraescolha.estoque.controller;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import com.valdonet.primeiraescolha.estoque.model.EstoqueDTO;
import com.valdonet.primeiraescolha.estoque.service.EstoqueService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class EstoqueController {

    private final EstoqueService service;

    @GetMapping("/estoque/{id}")
    public ResponseEntity getEstoque(@PathVariable("id") Long id) {

        Estoque estoque = service.getEstoque(id);

        return ResponseEntity.status(HttpStatus.OK).body(estoque);
    }

    @GetMapping("/estoque")
    public ResponseEntity<List<Estoque>> listAllEstoques() {

        List<Estoque> estoque = service.listAllEstoques();

        return ResponseEntity.status(HttpStatus.OK).body(estoque);
    }

    @GetMapping("/estoque/cliente/{cliente}")
    public ResponseEntity<Estoque> listAllEstoques(@PathVariable Long id) {

        Estoque estoque = service.listEstoque(id);

        return ResponseEntity.status(HttpStatus.OK).body(estoque);
    }

    @PostMapping("/estoque")
    public ResponseEntity<Estoque> savePedido(@RequestBody EstoqueDTO estoqueDto) {

        Estoque estoqueSave = service.save(estoqueDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(estoqueSave);
    }

    @PatchMapping("/estoque")
    public void changeEstoque(@PathVariable EstoqueDTO estoque) {
        service.changeEstoque(estoque);
    }

    @DeleteMapping("/estoque/{id}")
    public void deleteEstoque(@PathVariable Long id) {
        service.deleteById(id);
    }
}
