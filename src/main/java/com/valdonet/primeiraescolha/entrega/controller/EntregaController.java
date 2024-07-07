package com.valdonet.primeiraescolha.entrega.controller;

import com.valdonet.primeiraescolha.entrega.model.Entrega;
import com.valdonet.primeiraescolha.entrega.model.EntregaDTO;
import com.valdonet.primeiraescolha.entrega.service.EntregaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class EntregaController {

    private final EntregaService service;

    @GetMapping("/entrega")
    public ResponseEntity<List<EntregaDTO>> listAllIEntregas() {

        List<EntregaDTO> entrega = service.listAllEntregas();

        return ResponseEntity.status(HttpStatus.OK).body(entrega);
    }

    @GetMapping("/entrega/{idEntrega}")
    public ResponseEntity<EntregaDTO> listEntregas(@PathVariable("idEntrega") Long idEntrega) {

        EntregaDTO entrega = service.listEntregaByEntrega(idEntrega);

        return ResponseEntity.status(HttpStatus.OK).body(entrega);
    }

    @GetMapping("/entrega/pedido/{idPedido}")
    public ResponseEntity<EntregaDTO> listAllEntregas(@PathVariable("idPedido") Long idPedido) {

        EntregaDTO entrega = service.listEntregaByPedido(idPedido);

        return ResponseEntity.status(HttpStatus.OK).body(entrega);
    }

    @PostMapping("/entrega")
    public ResponseEntity<Entrega> saveEntrega(@RequestBody EntregaDTO entregaDto) {

        Entrega entregaSave = service.save(entregaDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(entregaSave);
    }

    @PatchMapping("/entrega")
    public void changeEntrega(@PathVariable EntregaDTO entrega) {
        service.changeEntrega(entrega);
    }

}
