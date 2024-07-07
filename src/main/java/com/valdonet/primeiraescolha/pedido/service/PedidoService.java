package com.valdonet.primeiraescolha.pedido.service;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTO;
import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pedido.model.PedidoDTOIn;
import com.valdonet.primeiraescolha.pedido.repository.PedidoRepository;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.produto.model.Produto;
import com.valdonet.primeiraescolha.produto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ProdutoRepository produtoRepository;

    public Pedido getPedido(Long id) {

        Optional<Pedido> pedido = repository.findPedidoById(id);

//        Pessoa pessoa = new Pessoa();
//        Optional<Pessoa> pessoaSaved = repository.findPessoaById(pedido.get().getPessoa().getId());

        return pedido.orElse(null);
    }

    public Pedido save(PedidoDTOIn pedidoDtoIn) {

        Pedido pedido  = new Pedido();
        Pessoa pessoaSaved = repository.findPessoaById(pedidoDtoIn.getIdPessoa());

        pedido.setPessoa(pessoaSaved);
        pedido.setStatusPedido(pedidoDtoIn.getStatusPedido());
        pedido.setDataPedido(pedidoDtoIn.getDataPedido());
//        pedido.setItensPedido(pedidoDtoIn.getItensPedidos());

        List<ItensPedido> itensPedidos= new ArrayList<>();
        for(ItensPedidoDTO itemPedidoDto : pedidoDtoIn.getItensPedidos()){
            Optional<Produto> optionalProduto = produtoRepository.findProdutoById(itemPedidoDto.getIdProduto());
            if(!optionalProduto.isPresent()){
                throw new RuntimeException("Produto not found with ID: " + itemPedidoDto.getIdProduto());
            }

            ItensPedido itensPedido = new ItensPedido();
            itensPedido.setProduto(optionalProduto.get());
            itensPedido.setQuantidade(itemPedidoDto.getQuantidade());

            itensPedidos.add(itensPedido);
        }
        pedido.setItensPedido(itensPedidos);

        pedido = repository.save(pedido);

        return pedido;
    }

    public List<Pedido> listAllPedidos() {

        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changePedido(PedidoDTOIn pedidoDtoIn) {
    }

}
