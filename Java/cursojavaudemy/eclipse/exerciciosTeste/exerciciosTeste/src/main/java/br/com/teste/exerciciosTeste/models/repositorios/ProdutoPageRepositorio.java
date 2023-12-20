package br.com.teste.exerciciosTeste.models.repositorios;

import br.com.teste.exerciciosTeste.models.entidades.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoPageRepositorio
        extends PagingAndSortingRepository<Produto, Integer> {
}
