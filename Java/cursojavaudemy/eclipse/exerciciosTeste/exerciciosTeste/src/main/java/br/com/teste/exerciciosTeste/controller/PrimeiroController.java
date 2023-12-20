package br.com.teste.exerciciosTeste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//    @RequestMapping(method = RequestMethod.GET, path = "/minhapica")
    @GetMapping(path = "/yuri")
    public String Ola(){
        return "GOSTOSO";
    }

    @GetMapping(path = {"/leleco", "/kaio", "/sushicha"})
    public String Ola2(){
        return "Homusequisual";
    }
}

