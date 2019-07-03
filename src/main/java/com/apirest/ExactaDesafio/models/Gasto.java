/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.ExactaDesafio.models;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


/**
 *
 * @author Piercarlo
 */

@Entity
@Table(name="TB_Gasto")
public class Gasto{
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String nomePessoa;
    
    private String descricao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHora;
    
    private double valor;
    
    private String tags;

    public Gasto() {
    }
    
    public Gasto( String nomePessoa, String descricao, Date dataHora, double valor, String tags) {
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.valor = valor;
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    public String getTags() {
        return tags;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }   
}
