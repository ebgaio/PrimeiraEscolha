package com.valdonet.primeiraescolha.produto.service;

import com.valdonet.primeiraescolha.produto.model.Produto;
import com.valdonet.primeiraescolha.produto.model.ProdutoDTO;
import com.valdonet.primeiraescolha.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto getProduto(Long id) {

        Optional<Produto> produto = repository.findById(id);

        if (!produto.isPresent()) {
            return null;
        }

        return produto.get();
    }

    public Produto save(ProdutoDTO produtoDto) {

        Produto produto  = new Produto();

        produto.setNome(produtoDto.getNome());
        produto.setDescricao(produtoDto.getDescricao());
        produto = repository.save(produto);

        return produto;
    }

    public List<Produto> listAllProdutos() {

        List<Produto> produtos = repository.findAll();
        return produtos;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
