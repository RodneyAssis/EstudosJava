package jdbc.DAO;

import jdbc.verificarregistros.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClienteDAO {
    Connection conn;

    public ClienteDAO() {
//        Abrir uma conexão com o banco de dados.
        Connection conn = StaticConnectionDAO.getconn();
    }

    public List<Clientes> listar() throws SQLException {
        String sql = "SELECT * FROM clientes";

        List<Clientes> list = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement(sql);
        var res = stmt.executeQuery();
        while (res.next()){
            Clientes clientes = new Clientes();

            clientes.setId(UUID.fromString(res.getString("id")));
            clientes.setNome(res.getString("nome"));
            clientes.setCpf(res.getString("cpf"));
            list.add(clientes);
        }
        stmt.close();
        return list;
    }

    public boolean inserirCliente(Clientes clientes) throws SQLException{
        String sql = "INSEERT INFO clientes(id,nome,cpf) value (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, String.valueOf(clientes.getId()));
        stmt.setString(2, clientes.getNome());
        stmt.setString(3, clientes.getCpf());
        stmt.execute();
        stmt.close();
        return true;
    }

    public boolean atualizarCliente(Clientes clientes) {
        String sql = "UPDATE clientes SET nome = ?, cpf = ? WHERE id = ?";
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, clientes.getNome());
            stmt.setString(2, clientes.getCpf());
            stmt.setString(3, String.valueOf(clientes.getId()));
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean removerCliente(Clientes clientes) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, String.valueOf(clientes.getId()));
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e){
            return false;
        }

    }

}

