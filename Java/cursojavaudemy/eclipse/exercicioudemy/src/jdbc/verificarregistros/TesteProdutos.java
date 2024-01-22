package jdbc.verificarregistros;

import jdbc.StaticConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TesteProdutos {
    public static void main(String[] args) throws SQLException {
        Connection conn = StaticConnection.getConn();
        String sql = "SELECT * FROM produtos";
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery(sql);
//
//        while (res.next()){
//            var ID = res.getArray(1);
//            var nome = res.getArray(2);
//            var preco = res.getArray(3);
//            var qualidade = res.getArray(4);
//
//            System.out.println("ID: " + ID + " Nome: " + nome + " Preco: " + preco + " Qualidade: " + qualidade);
//
//        }

        List<Produtos> listProdutos = new ArrayList<>();
        while (res.next()) {
            var id = UUID.fromString(res.getString("id"));
            var nome = res.getString("nome");
            var preco = res.getDouble("preco");
            var quantidade = res.getInt("quantidade");
            listProdutos.add(new Produtos(id, nome, preco, quantidade));
        }

        for (Produtos p : listProdutos){
            System.out.println("\nID: " + p.getID()
                    + "\nNome:" + p.getNome());
        }

        conn.close();
    }
}
