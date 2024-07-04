package com.valdonet.primeiraescolha.produto.service;

import com.valdonet.primeiraescolha.produto.model.Produto;
import com.valdonet.primeiraescolha.produto.model.ProdutoDTO;
import com.valdonet.primeiraescolha.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Produto getProduto(Long id) {

        Optional<Produto> produto = repository.findById(id);

        return produto.orElse(null);

    }

    public Produto save(ProdutoDTO produtoDto) {

        Produto produto  = new Produto();

        produto.setNome(produtoDto.getNome());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setPreco(produtoDto.getPreco());
        produto.setQuantidade(produtoDto.getQuantidade());
        produto = repository.save(produto);

        return produto;
    }

    public List<Produto> listAllProdutos() {

        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
