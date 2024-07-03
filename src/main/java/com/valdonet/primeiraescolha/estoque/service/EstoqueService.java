package com.valdonet.primeiraescolha.estoque.service;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import com.valdonet.primeiraescolha.estoque.model.EstoqueDTO;
import com.valdonet.primeiraescolha.estoque.repository.EstoqueRepository;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.repository.PessoaRepository;
import com.valdonet.primeiraescolha.produto.model.Produto;
import com.valdonet.primeiraescolha.produto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EstoqueService {

    private final EstoqueRepository repository;
    private final ProdutoRepository produtoRepository;
    private final PessoaRepository pessoaRepository;

    public List<Produto> getEstoqueProduto(Long idProduto) {

        List<Produto> produto = repository.findByEstoqueProduto(idProduto);

        if (produto.isEmpty()) {
            return null;
        }
        return produto;
    }

    public List<Pessoa> getEstoquePessoa(Long idPessoa) {

        List<Pessoa> pessoa = repository.findByEstoquePessoa(idPessoa);

        if (pessoa.isEmpty()) {
            return null;
        }
        return pessoa;
    }

    public Estoque save(EstoqueDTO estoqueDto) {

        Estoque estoque  = new Estoque();

        return estoque;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeEstoque(EstoqueDTO Estoqueto) {

    }

    public Estoque listEstoque(Long id) {
        return repository.findById(id).orElse(null);
    }
}
