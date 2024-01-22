package jdbc.DAO;

import jdbc.verificarregistros.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProdutosDAO {
    Connection conn;

    public ProdutosDAO() {
        this.conn = StaticConnectionDAO.getconn();
    }

    public List<Produtos> listar() throws SQLException {
        String sql = "SELECT * FROM produtos";
        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet res = stmt.executeQuery();

        List<Produtos> listar = new ArrayList<>();
        Produtos p = new Produtos();
        while (res.next()) {
            p.setID(UUID.fromString(res.getString("ID")));
            p.setNome(res.getString("nome"));
            p.setPreco(res.getDouble("preco"));
            p.setQtd(res.getInt("quantidade"));
            listar.add(p);
        }
        return listar;
    }

    public boolean inserir(Produtos p) throws SQLException {
        String sql = "INSERT INTO produtos (id, nome, preco, quantidade) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setObject(1, p.getID());
        stmt.setString(2, p.getNome());
        stmt.setDouble(3, p.getPreco());
        stmt.setInt(4, p.getQtd());
        stmt.executeUpdate();

        if (stmt.executeUpdate() == 0){
            return true;
        }
        return false;
    }

    public boolean atualizar(Produtos p) throws SQLException{
        String sql = "UPDATE produtos SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, p.getNome());
        stmt.setDouble(2, p.getPreco());
        stmt.setInt(3, p.getQtd());
        stmt.setObject(4, p.getID());
        stmt.executeUpdate();

        if (stmt.executeUpdate() < 1){
            return true;
        }
        return false;
    }

    public boolean remover(Produtos p) throws SQLException {
        String sql = "DELETE FROM produtos WHERE nome = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        var eUP = stmt.executeUpdate();

        if (1 > eUP) {

            return true;
        }

        return false;
    }
}
