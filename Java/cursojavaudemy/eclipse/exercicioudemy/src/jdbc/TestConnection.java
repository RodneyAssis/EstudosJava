package jdbc;

import java.sql.*;
public class TestConnection {
    public static void main(String[] args) throws SQLException {
        String stringConexao = "jdbc:postgresql://tuffi.db.elephantsql.com:5432/jmnvvzjk";
        String usuarioConn = "jmnvvzjk";
        String senhaConn = "EboCvzoUceCCuqwzfDJCKsioKYAofkXQ";

        Connection conn = DriverManager
                .getConnection(stringConexao, usuarioConn, senhaConn);

        conn.close();
    }
}
