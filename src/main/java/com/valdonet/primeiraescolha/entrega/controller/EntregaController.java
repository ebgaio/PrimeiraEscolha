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

    @GetMapping("/entrega/{id}")
    public ResponseEntity getEntrega(@PathVariable("id") Long id) {

        Entrega entrega = service.getEntrega(id);

        return ResponseEntity.status(HttpStatus.OK).body(entrega);
    }

    @GetMapping("/entrega")
    public ResponseEntity<List<Entrega>> listAllIEntregas() {

        List<Entrega> entrega = service.listAllEntregas();

        return ResponseEntity.status(HttpStatus.OK).body(entrega);
    }

    @GetMapping("/entrega/cliente/{cliente}")
    public ResponseEntity<Entrega> listAllEntregas(@PathVariable Long id) {

        Entrega entrega = service.listEntrega(id);

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

    @DeleteMapping("/entrega/{id}")
    public void deleteEntrega(@PathVariable Long id) {
        service.deleteById(id);
    }
}
