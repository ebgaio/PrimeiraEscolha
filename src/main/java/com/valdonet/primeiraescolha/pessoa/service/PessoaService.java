package com.valdonet.primeiraescolha.pessoa.service;

import com.valdonet.primeiraescolha.cliente.model.Cliente;
import com.valdonet.primeiraescolha.cliente.repository.ClienteRepository;
import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.pessoa.model.PessoaDTO;
import com.valdonet.primeiraescolha.pessoa.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;
    private final ClienteRepository clienteRepository;

    public PessoaDTO getPessoa(Long id) {

        Optional<PessoaDTO> pessoaDTO = repository.findPessoaPorId(id);

        if (!pessoaDTO.isPresent()) {
            return null;
        }

        return pessoaDTO.get();
    }

    public Pessoa save(PessoaDTO pessoaDto) {

        Pessoa pessoa  = new Pessoa ();

        pessoa.setNome (pessoaDto.getNome ());
        pessoa.setSobrenome (pessoaDto.getSobreNome ());
        pessoa.setTipoPessoa (pessoaDto.getTipoPessoa ());
        pessoa.setTelefone (pessoaDto.getTelefone ());
        pessoa = repository.save(pessoa);

        return pessoa;
    }

    public List<Pessoa> listAllPessoas() {

        List<Pessoa> pessoas = repository.findAll();
        return pessoas;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void changePessoa(PessoaDTO pessoaDto) {

//        Optional<Cliente> cliente = clienteRepository.findClienteByNome(pedidoDto.getCliente().getNome());
//        if (cliente.isEmpty()) {
//            System.out.println("Cliente não encontrado");
//        }
//
//        Optional<Pessoa> pedido = repository.findById(cliente.get().getId());
//        if (pedido.isEmpty()) {
//            System.out.println("Pedido não encontrado.");
//        }
//
//        pedido.get().setStatusPedido(pedidoDto.getStatusPedido());
//        pedido.get().setDataPedido(pedidoDto.getDataPedido());
//        repository.save(pedido.get());
    }

    public Pessoa listPessoa(Long id) {
        return repository.findById(id).orElse(null);
    }
}
