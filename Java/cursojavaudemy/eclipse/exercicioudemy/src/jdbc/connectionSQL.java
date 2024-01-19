package jdbc;

import java.sql.*;

public class connectionSQL {
    public static void main(String[] args) throws SQLException {
//        try {
//            Class.forName("org.postgresql.Driver");
//        }
//        catch (java.lang.ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        Connection conn = DriverManager.getConnection(
//                "jdbc:postgresql://tuffi.db.elephantsql.com:5432/bmbwgtvl",
//                "bmbwgtvl", "00tOiYFuxNjF2LLlWd3TsvXroNHKdMuj");
//        Statement stmt = conn.createStatement();
//
//
//         conn.close();

        Connection conn = StaticConnection.getConn();

        Statement stmt = conn.createStatement();

        String sql = "ALTER TABLE produtos ADD quantidade int not null";

        stmt.execute(sql);

        conn.close();
    }
}
