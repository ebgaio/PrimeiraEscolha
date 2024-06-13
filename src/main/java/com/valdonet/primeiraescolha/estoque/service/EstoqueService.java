package com.valdonet.primeiraescolha.estoque.service;

import com.valdonet.primeiraescolha.estoque.model.Estoque;
import com.valdonet.primeiraescolha.estoque.model.EstoqueDTO;
import com.valdonet.primeiraescolha.estoque.repository.EstoqueRepository;
import com.valdonet.primeiraescolha.pessoa.fornecedor.repository.FornecedorRepository;
import com.valdonet.primeiraescolha.produto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EstoqueService {

    private final EstoqueRepository repository;
    private final FornecedorRepository fornecedorRepository;
    private final ProdutoRepository produtoRepository;

    public Estoque getEstoque(Long id) {

        Optional<Estoque> estoque = repository.findById(id);

        if (!estoque.isPresent()) {
            return null;
        }

        return estoque.get();
    }

    public Estoque save(EstoqueDTO estoqueDto) {

        Estoque estoque  = new Estoque();

//        estoque.setStatusEstoque(pedidoDto.getStatusPedido());
//        estoque.setDataPedido(pedidoDto.getDataPedido());
//        estoque = repository.save(pedido);

        return estoque;
    }

    public List<Estoque> listAllEstoques() {

        List<Estoque> estoques = repository.findAll();
        return estoques;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changeEstoque(EstoqueDTO Estoqueto) {



//        Optional<Cliente> cliente = repository.findClienteByNome(pedidoDto.getCliente().getNome());
//        if (cliente.isEmpty()) {
//            System.out.println("Cliente não encontrado");
//        }
//
//        Optional<Pedido> pedido = repository.findById(cliente.get().getId());
//        if (pedido.isEmpty()) {
//            System.out.println("Pedido não encontrado.");
//        }
//
//        pedido.get().setStatusPedido(pedidoDto.getStatusPedido());
//        pedido.get().setDataPedido(pedidoDto.getDataPedido());
//        repository.save(pedido.get());
    }

    public Estoque listEstoque(Long id) {
        return repository.findById(id).orElse(null);
    }
}
