package com.valdonet.primeiraescolha.fatura.controller;

import com.valdonet.primeiraescolha.fatura.model.Fatura;
import com.valdonet.primeiraescolha.fatura.model.FaturaDTO;
import com.valdonet.primeiraescolha.fatura.service.FaturaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/primeira-escolha")
@RestController
@AllArgsConstructor
public class FaturaController {

    private final FaturaService service;

    @GetMapping("/fatura/{id}")
    public ResponseEntity getFatura(@PathVariable("id") Long id) {

        Fatura fatura = service.getFatura(id);

        return ResponseEntity.status(HttpStatus.OK).body(fatura);
    }

    @GetMapping("/fatura")
    public ResponseEntity<List<Fatura>> listAllIFaturas() {

        List<Fatura> fatura = service.listAllFaturas();

        return ResponseEntity.status(HttpStatus.OK).body(fatura);
    }

    @GetMapping("/fatura/cliente/{cliente}")
    public ResponseEntity<Fatura> listAllFaturas(@PathVariable Long id) {

        Fatura fatura = service.listFatura(id);

        return ResponseEntity.status(HttpStatus.OK).body(fatura);
    }

    @PostMapping("/fatura")
    public ResponseEntity<Fatura> saveFatura(@RequestBody FaturaDTO faturaDto) {

        Fatura faturaSave = service.save(faturaDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(faturaSave);
    }

    @PatchMapping("/fatura")
    public void changeFatura(@PathVariable FaturaDTO fatura) {
        service.changeFatura(fatura);
    }

    @DeleteMapping("/fatura/{id}")
    public void deleteEntrega(@PathVariable Long id) {
        service.deleteById(id);
    }
}
