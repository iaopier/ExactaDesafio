/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.ExactaDesafio.controllers;


import com.apirest.ExactaDesafio.models.Gasto;
import com.apirest.ExactaDesafio.services.GastoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Piercarlo
 */
@RestController
@RequestMapping("/api/v1/gastos")
public class GastoAPI {
    
    @Autowired
    private final GastoService gastoService;

   
    public GastoAPI(GastoService gastoService) {
        this.gastoService = gastoService;
    }

    @GetMapping(produces="application/json")
    public ResponseEntity<List<Gasto>> findAll() {
        return ResponseEntity.ok(gastoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gasto> findById(@PathVariable Long id) {
        Optional<Gasto> gasto = gastoService.findById(id);

        return ResponseEntity.ok(gastoService.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Gasto> create(@RequestBody Gasto gasto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(gastoService.save(gasto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gasto> update(@PathVariable Long id, @RequestBody Gasto gasto) {
        return ResponseEntity.accepted().body(gastoService.save(gasto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
       gastoService.deleteById(id);
       return ResponseEntity.accepted().build();
    }
}
