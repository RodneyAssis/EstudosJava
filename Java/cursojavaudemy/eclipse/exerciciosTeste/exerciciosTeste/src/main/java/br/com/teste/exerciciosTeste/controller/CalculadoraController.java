package br.com.teste.exerciciosTeste.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {


//  /soma/2/4 == 6
    @RequestMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable int a,@PathVariable int b) {
        return a+b;
    }

    @RequestMapping(path = "/subtrair/{a}/{b}")
    public int subtrair(@PathVariable int a,@PathVariable int b) {
        return a-b;
    }



//  /soma?a=4&b=2
    @RequestMapping(path = "/somar")
    public int somarm(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a+b;
    }

    @RequestMapping(path = "/subtrair")
    public int subtrairm(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a-b;
    }
}
