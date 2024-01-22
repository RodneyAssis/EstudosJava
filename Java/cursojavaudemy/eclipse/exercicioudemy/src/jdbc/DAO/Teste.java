package jdbc.DAO;

import jdbc.verificarregistros.Clientes;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class Teste {
    public static void main(String[] args) throws SQLException {
//        Clientes clientes = new Clientes(UUID.randomUUID(), "Cloves", "06139290554");
//        ClienteDAO cdao = new ClienteDAO();
//        cdao.inserirCliente(clientes);

        ClienteDAO cdao = new ClienteDAO();
        List<Clientes> listarr = cdao.listar();
        for (Clientes cliente : listarr ){
            System.out.println(cliente);
        }

    }
}
