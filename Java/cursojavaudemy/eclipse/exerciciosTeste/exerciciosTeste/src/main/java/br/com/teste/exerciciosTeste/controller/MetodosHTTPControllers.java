package br.com.teste.exerciciosTeste.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHTTPControllers {

    @GetMapping
    public String get(){
        return "Requisição GET";
    }
    @PostMapping
    public String post(){
        return "Requisição POST";
    }

    @PutMapping
    public String put(){
        return "Requisição PUT";
    }

    @DeleteMapping
    public String delete(){
        return "Requisição DELETE";
    }

    public String option(){
        return "Requisição OPTION";
    }

    public String trace(){
        return "Requisição TRACE";
    }

    public String head(){
        return "Requisição HEAD";
    }
}
