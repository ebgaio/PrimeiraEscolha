package com.valdonet.primeiraescolha.pedido.controller;

import com.valdonet.primeiraescolha.pedido.model.Pedido;
import com.valdonet.primeiraescolha.pedido.model.PedidoDTOIn;
import com.valdonet.primeiraescolha.pedido.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @GetMapping("/pedido/{id}")
    public ResponseEntity getPedido(@PathVariable("id") Long id) {

        Pedido pedido = service.getPedido(id);

        return ResponseEntity.status(HttpStatus.OK).body(pedido);
    }

    @GetMapping("/pedido")
    public ResponseEntity<List<Pedido>> listAllPedidos() {

        List<Pedido> pedido = service.listAllPedidos();

        return ResponseEntity.status(HttpStatus.OK).body(pedido);
    }

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> savePedido(@RequestBody PedidoDTOIn pedidoDtoIn) {

        Pedido pedidoSave = service.save(pedidoDtoIn);

        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSave);
    }

    @PatchMapping("/pedido")
    public void changePedido(@PathVariable PedidoDTOIn pedido) {
        service.changePedido(pedido);
    }

    @DeleteMapping("/pedido/{id}")
    public void deletePedido(@PathVariable Long id) {
        service.deleteById(id);
    }
}
