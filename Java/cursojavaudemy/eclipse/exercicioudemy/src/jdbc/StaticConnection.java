package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StaticConnection {
    private static Properties getConnD() throws IOException {
        Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(StaticConnection.class.getResourceAsStream(caminho));
        return prop;
    }
    public static Connection getConn(){
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {

            Properties prop = getConnD();

            return DriverManager.getConnection(prop.getProperty("banco.url"),
                    prop.getProperty("banco.usuario"), prop.getProperty("banco.senha"));
        } catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }
    }

}
