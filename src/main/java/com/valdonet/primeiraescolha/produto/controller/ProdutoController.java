package com.valdonet.primeiraescolha.produto.controller;

import com.valdonet.primeiraescolha.produto.model.Produto;
import com.valdonet.primeiraescolha.produto.model.ProdutoDTO;
import com.valdonet.primeiraescolha.produto.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeiraescolha")
@RestController
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping("/produto/{id}")
    public ResponseEntity getProduto(@PathVariable("id") Long id) {

        Produto produto = service.getProduto(id);

        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }

    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> listAllProdutos() {

        List<Produto> produto = service.listAllProdutos();

        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }

    @PostMapping("/produto")
    public ResponseEntity<Produto> saveProduto(@RequestBody ProdutoDTO produtoDto) {

        Produto produtoSave = service.save(produtoDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSave);
    }

    @DeleteMapping("/produto/{id}")
    public void deleteProduto(@PathVariable Long id) {
        service.deleteById(id);
    }
}
