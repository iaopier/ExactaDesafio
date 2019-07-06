/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.ExactaDesafio.services;

import com.apirest.ExactaDesafio.models.Gasto;
import com.apirest.ExactaDesafio.repositories.GastoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Piercarlo
 */
@Service
public class GastoService {
    
    @Autowired
    private final GastoRepository gastoRespository;
    
    
    public GastoService(GastoRepository gastoRespository) {
        this.gastoRespository = gastoRespository;
    }

    public List<Gasto> findAll() {
        return gastoRespository.findAll();
    }

    public Optional<Gasto> findById(Long id) {
        return gastoRespository.findById(id);
    }

    public Gasto save(Gasto stock) {
        return gastoRespository.save(stock);
    }

    public void deleteById(Long id) {
        gastoRespository.deleteById(id);
    }
    
}
