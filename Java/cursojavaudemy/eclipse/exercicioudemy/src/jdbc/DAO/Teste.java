package jdbc.DAO;

import jdbc.verificarregistros.Clientes;
import jdbc.verificarregistros.Produtos;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class Teste {
    public static void main(String[] args) throws SQLException {
//        ClienteDAO cdao = new ClienteDAO();
////        Verificar
////        Clientes clientes = new Clientes(UUID.randomUUID(), "Cloves", "06139290554");
////        ClienteDAO cdao = new ClienteDAO();
////        cdao.inserirCliente(clientes);
//
////        List<Clientes> listarr = cdao.listar();
////        for (Clientes c : listarr ){
////            System.out.println(c.getId());
////        }
//
//        Clientes clientes = new Clientes(UUID.fromString("dc1f9206-3cc6-43d8-a9fd-c3764291b69e"),
//                "Claudio", "77147197372");
//        cdao.atualizarCliente(clientes);


        Produtos produtos = new Produtos(UUID.fromString("d2e32759-0187-47f6-8842-a72ebcef823f"), "José Claudio", 9999.00,1);

        ProdutosDAO pdao = new ProdutosDAO();

        pdao.atualizar(produtos);
    }
}
