package com.valdonet.primeiraescolha.itempedido.controller;

import com.valdonet.primeiraescolha.itempedido.model.ItemPedido;
import com.valdonet.primeiraescolha.itempedido.model.ItemPedidoDTO;
import com.valdonet.primeiraescolha.itempedido.service.ItemPedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeiraescolha")
@RestController
@AllArgsConstructor
public class ItemPedidoController {

    private final ItemPedidoService service;

    @GetMapping("/itempedido/{id}")
    public ResponseEntity getItemPedido(@PathVariable("id") Long id) {

        ItemPedido itemPedido = service.getItemPedido(id);

        return ResponseEntity.status(HttpStatus.OK).body(itemPedido);
    }

    @GetMapping("/itempedido")
    public ResponseEntity<List<ItemPedido>> listAllItemPedidos() {

        List<ItemPedido> itemPedido = service.listAllItemPedidos();

        return ResponseEntity.status(HttpStatus.OK).body(itemPedido);
    }

    @GetMapping("/itempedido/cliente/{cliente}")
    public ResponseEntity<ItemPedido> listAllPedidos(@PathVariable Long id) {

        ItemPedido itemPedido = service.listItemPedido(id);

        return ResponseEntity.status(HttpStatus.OK).body(itemPedido);
    }

    @PostMapping("/itempedido")
    public ResponseEntity<ItemPedido> savePedido(@RequestBody ItemPedidoDTO itemPedidoDto) {

        ItemPedido itemPedidoSave = service.save(itemPedidoDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(itemPedidoSave);
    }

    @PatchMapping("/itempedido")
    public void changeItemPedido(@PathVariable ItemPedidoDTO itemPedido) {
        service.changeItemPedido(itemPedido);
    }

    @DeleteMapping("/itempedido/{id}")
    public void deleteItemPedido(@PathVariable Long id) {
        service.deleteById(id);
    }
}
