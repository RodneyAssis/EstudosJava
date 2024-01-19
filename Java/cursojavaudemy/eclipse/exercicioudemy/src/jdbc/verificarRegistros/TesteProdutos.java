package jdbc.verificarRegistros;

import jdbc.StaticConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TesteProdutos {
    public static void main(String[] args) throws SQLException {
        Connection conn = StaticConnection.getConn();
        String sql = "SELECT * FROM produtos";
        Statement stmt = conn.createStatement();
        var res = stmt.executeQuery(sql);

        while (res.next()){
            var ID = res.getArray(1);
            var nome = res.getArray(2);
            var preco = res.getArray(3);
            var qualidade = res.getArray(4);

            System.out.println("ID: " + ID + " Nome: " + nome + " Preco: " + preco + " Qualidade: " + qualidade);

        }



//        List<Produtos> listProdutos = new ArrayList<>();
//        while (res.next()) {
//            var ID = res.("UUID");
//            var nome = res.getString("nome");
//            var preco = res.getDouble("preco");
//            var qualidade = res.getInt("qualidade");
//            listProdutos.add(new Produtos(ID, nome));
//        }

        conn.close();
    }
}
