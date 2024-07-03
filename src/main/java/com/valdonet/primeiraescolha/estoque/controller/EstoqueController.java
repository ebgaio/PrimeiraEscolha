package com.valdonet.primeiraescolha.estoque.controller;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import com.valdonet.primeiraescolha.estoque.model.EstoqueDTO;
import com.valdonet.primeiraescolha.estoque.service.EstoqueService;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.produto.model.Produto;
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

    @GetMapping("/estoque/produto/{id}")
    public ResponseEntity<List<Produto>> getEstoqueProduto(@PathVariable("id") Long idProduto) {

        List<Produto> produto = service.getEstoqueProduto(idProduto);

        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }

    @GetMapping("/estoque/fornecedor/{id}")
    public ResponseEntity<List<Pessoa>> getEstoquePessoa(@PathVariable("id") Long idPessoa) {

        List<Pessoa> pessoa = service.getEstoquePessoa(idPessoa);

        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @GetMapping("/estoque/{id}")
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
    public void changeEstoque(@RequestBody EstoqueDTO estoque) {
        service.changeEstoque(estoque);
    }

    @DeleteMapping("/estoque/{id}")
    public void deleteEstoque(@PathVariable Long id) {
        service.deleteById(id);
    }
}
