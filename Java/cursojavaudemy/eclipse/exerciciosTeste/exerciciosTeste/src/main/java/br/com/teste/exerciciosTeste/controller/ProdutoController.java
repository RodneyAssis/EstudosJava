package br.com.teste.exerciciosTeste.controller;

import br.com.teste.exerciciosTeste.models.entidades.Produto;
import br.com.teste.exerciciosTeste.models.repositorios.ProdutoPageRepositorio;
import br.com.teste.exerciciosTeste.models.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    ProdutoRepositorio produtoRepositorio;
    @Autowired
    ProdutoPageRepositorio produtoPageRepositorio;


//    Verificar consulta por paginas
    @GetMapping(path = "/pagina/{page}")
    public Iterable<Produto> consultaPorPagina(@PathVariable int page){
        return produtoPageRepositorio.findAll(PageRequest.of(page, 5));
    }

//    Consulta por nome
    @GetMapping("/nome/{nome}")
    public Iterable<Produto> consultaPorNome(@PathVariable String nome){
        return produtoRepositorio.findByNomeContaining(nome);
    }

//   Consulta por desconto
    @GetMapping("/desconto/{desconto}")
    public Iterable<Produto> consultaPordesconto(@PathVariable int desconto){
        return produtoRepositorio.findByDesconto(desconto);
    }

    //    Consulta de precos abaixo de valor selecionado
    @GetMapping("/descontoAlto/{valor}")
    public Iterable<Produto> produtosPrecoBaixo(@PathVariable float valor){
        return produtoRepositorio.consultarPorPrecosAbaixoDe5(valor);
    }

//   Verificação de consulta dos produtos registrados
    @GetMapping
    public Iterable<Produto> visualizarProdutos(){
        return produtoRepositorio.findAll();
    }

//   Verificação de consulta unica por ID
    @GetMapping("/consulta/{id}")
    public Optional<Produto> viewProdutoPorID(@PathVariable("id") int id){
        return produtoRepositorio.findById(id);
    }

//    @PostMapping
//    public Produto novoProduto(@RequestParam String nome, @RequestParam float preco, @RequestParam int desconto){
//        Produto produto = new Produto(nome, preco, desconto);
//        produtoRepositorio.save(produto);
//        return produto;
//    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produto.aplicarDesconto(produto.getDesconto(), produto.getPreco());
//        produtoRepositorio.save(produto);
//        return produto;
//    }

//    Utiliza metodo de POST e PUT na mesma estrutura
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Produto salvarProduto(Produto produto) {
        produto.aplicarDesconto(produto.getDesconto(), produto.getPreco());
        produtoRepositorio.save(produto);
        return produto;
    }



    // Verificação Deletar por consulta especifica
    @DeleteMapping(path = "/deletar/{id}")
    public void deletarProduto(@PathVariable int id){
        produtoRepositorio.deleteById(id);
    }

//    Necesserio dar uma pesquisava em skill delet
    @DeleteMapping(path = "/deletar")
    public void deletarProduto(){
        produtoRepositorio.deleteAll();
    }


}
