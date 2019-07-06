/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.WebAPP.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.GastoApiApi;
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
    
    @RequestMapping("/gastos")
    public String gastos(Model model) throws ApiException {
    	System.out.println("Application->Gastos()");
    	ApiClient client = new ApiClient();
    	GastoApiApi api = new GastoApiApi(client);
    	client.setBasePath("http://localhost:8080");
    	System.out.println(client.getBasePath());
    	System.out.println(api.findAllUsingGET());
       	model.addAttribute("msg", "Gasto");
    	return "gastos";
    }
}
