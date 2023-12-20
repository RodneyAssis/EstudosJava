package br.com.teste.exerciciosTeste.models.repositorios;

import br.com.teste.exerciciosTeste.models.entidades.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Optional;

public interface ProdutoRepositorio
        extends CrudRepository<Produto, Integer> {

    Iterable<Produto> findByNomeContaining(String nome);

    Iterable<Produto> findByDesconto(int desconto);

    //Tesde consulta de preços abaixo do valor selecionado
    @Query("SELECT d FROM Produto d WHERE d.precoComDesconto <= :valor")
    Iterable<Produto> consultarPorPrecosAbaixoDe5(@Param("valor") float valor);
}

