package com.valdonet.primeiraescolha.itenspedido.controller;

import com.valdonet.primeiraescolha.itenspedido.model.ItensPedido;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTO;
import com.valdonet.primeiraescolha.itenspedido.model.ItensPedidoDTOPedido;
import com.valdonet.primeiraescolha.itenspedido.service.ItensPedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class ItensPedidoController {

    private final ItensPedidoService service;

    @GetMapping("/itenspedido/{id}")
    public ResponseEntity<ItensPedidoDTOPedido> getItensPedido(@PathVariable("id") Long id) {

        ItensPedidoDTOPedido itensPedido = service.getItensPedido(id);

        return ResponseEntity.status(HttpStatus.OK).body(itensPedido);
    }

    @GetMapping("/itenspedido")
    public ResponseEntity<List<ItensPedidoDTOPedido>> listAllItensPedidos() {

        List<ItensPedidoDTOPedido> itensPedido = service.listAllItensPedidos ();

        return ResponseEntity.status(HttpStatus.OK).body(itensPedido);
    }

    @PostMapping("/itenspedido")
    public ResponseEntity<ItensPedido> saveItensPedido(@RequestBody ItensPedidoDTO itensPedidoDto) {

        ItensPedido itensPedidoSave = service.save(itensPedidoDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(itensPedidoSave);
    }

    @PatchMapping("/itenspedido")
    public void changeItemPedido(@PathVariable ItensPedidoDTO itensPedido) {
        service.changeItensPedido(itensPedido);
    }

    @DeleteMapping("/itenspedido/{id}")
    public void deleteItensPedido(@PathVariable Long id) {
        service.deleteById(id);
    }
}
