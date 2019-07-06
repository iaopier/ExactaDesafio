/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.ExactaDesafio.repositories;

import com.apirest.ExactaDesafio.models.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Piercarlo
 */
public interface GastoRepository extends JpaRepository<Gasto, Long>{
    
}
