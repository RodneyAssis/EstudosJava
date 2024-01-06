package jdbc;

import java.sql.*;

public class CriandoBanco {
    public static void main(String[] args) throws SQLException {
//        String stringConexao = "jdbc:postgresql://tuffi.db.elephantsql.com:5432/jmnvvzjk";
//        String usuarioConn = "jmnvvzjk";
//        String senhaConn = "EboCvzoUceCCuqwzfDJCKsioKYAofkXQ";
//
//        Connection conn = DriverManager
//                .getConnection(stringConexao, usuarioConn, senhaConn);

        var conn = Conexoes.getConn();

        Statement stmt = conn.createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM diretores");

        while (query.next()) {
            System.out.print(query.getArray(1) + " ");
            System.out.println(query.getArray(2));
        }

        conn.close();
    }
}
