package com.valdonet.primeiraescolha.cliente.controller;

import com.valdonet.primeiraescolha.cliente.model.Cliente;
import com.valdonet.primeiraescolha.cliente.model.ClienteDTO;
import com.valdonet.primeiraescolha.cliente.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @GetMapping("/cliente/{id}")
    public ResponseEntity getCliente(@PathVariable("id") Long id) {

        Cliente cliente = service.getCliente(id);

        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> listAllClientes() {

        List<Cliente> cliente = service.listAllClientes();

        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> saveCliente(@RequestBody ClienteDTO clienteDto) {

        Cliente clienteSave = service.save(clienteDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSave);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable Long id) {
        service.deleteById(id);
    }
}
