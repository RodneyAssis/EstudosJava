package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexoes {
    public static Connection getConn(){
        try {
            String stringConexao = "jdbc:postgresql://tuffi.db.elephantsql.com:5432/jmnvvzjk";
            String usuarioConn = "jmnvvzjk";
            String senhaConn = "EboCvzoUceCCuqwzfDJCKsioKYAofkXQ";

            return DriverManager.getConnection(stringConexao, usuarioConn, senhaConn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
