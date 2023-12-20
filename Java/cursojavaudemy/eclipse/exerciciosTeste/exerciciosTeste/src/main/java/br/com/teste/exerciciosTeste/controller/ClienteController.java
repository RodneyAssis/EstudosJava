package br.com.teste.exerciciosTeste.controller;

import br.com.teste.exerciciosTeste.models.entidades.Clientes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @RequestMapping(method = RequestMethod.GET, path = "/none")
    public Clientes obterCliente(){
        return new Clientes(28, "Pedrinho", "123.456.789-54");
    }


    @GetMapping("/{ID}")
    public Clientes obterClientePorId(@PathVariable int ID) {
        return new Clientes(ID, "Nome", "123.456.789-65");
    }

    @GetMapping
    public Clientes obterClientePorId2(
            @RequestParam(name = "ID", defaultValue = "1") int ID){
        return new Clientes(ID, "joselito", "12345678998");
    }
}
