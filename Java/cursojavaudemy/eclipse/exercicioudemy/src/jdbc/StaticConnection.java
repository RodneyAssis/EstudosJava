package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticConnection {
    public static Connection getConn() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return DriverManager.getConnection("jdbc:postgresql://tuffi.db.elephantsql.com:5432/bmbwgtvl",
                "bmbwgtvl", "00tOiYFuxNjF2LLlWd3TsvXroNHKdMuj");
    }
}
