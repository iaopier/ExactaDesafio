/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.WebAPP.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.*;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.GastoApiApi;
import io.swagger.client.model.Gasto;
/**
 *
 * @author Piercarlo
 */
@Controller
public class AppController {
    
    @RequestMapping("/")
    public String index(){
        System.out.println("Application->Index()");
        return "index";
    }  
    
    @PostMapping("/cadastrar")
    public String cadastrarGastos(@RequestParam String nomePessoa,
    		@RequestParam String descricaoGasto,
    		@RequestParam String dataHora,
    		@RequestParam String valorGasto,
    		@RequestParam String tagsGasto
    		) throws ApiException{
        System.out.println("Application->cadastrarGastos()");
    	Gasto gasto = new Gasto();
    	gasto.setNomePessoa(nomePessoa);
    	gasto.setDescricao(descricaoGasto);
    	String input = "2018-07-22T14:00:00-03:00";
    	OffsetDateTime offsetDateTime = OffsetDateTime.parse(input,DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    	gasto.setDataHora(offsetDateTime);
    	gasto.setValor(Double.parseDouble(valorGasto));
    	gasto.setTags(tagsGasto);
    	ApiClient client = new ApiClient();
    	GastoApiApi api = new GastoApiApi(client);
    	client.setBasePath("http://localhost:8080");
    	api.createUsingPOST(gasto);
        return "cadastro";
    }
    
    @GetMapping("/cadastrar")
    public String formGastos(){
        System.out.println("Application->formularioGastos()");
        return "cadastro";
    }
    
    @GetMapping("/gastos")
    public ModelAndView gastos() throws ApiException {
    	System.out.println("Application->Gastos()");
    	ApiClient client = new ApiClient();
    	GastoApiApi api = new GastoApiApi(client);
    	client.setBasePath("http://localhost:8080");
       	ModelAndView model = new ModelAndView("gastos");
       	List<Gasto> list = api.findAllUsingGET();
       	model.addObject("lists", list);		
		return model;
    }
    
    @GetMapping("/gasto/{id}")
    public ModelAndView gastoId(@PathVariable("id") int id) throws ApiException{
        System.out.println("Application->gastoId()");
        System.out.println("Application->Gastos()");
    	ApiClient client = new ApiClient();
    	GastoApiApi api = new GastoApiApi(client);
    	client.setBasePath("http://localhost:8080");
       	ModelAndView model = new ModelAndView("gastoDetalhado");
       	Gasto gasto = api.findByIdUsingGET((long) id);
       	model.addObject("gasto", gasto);		
		return model;
    }
}
