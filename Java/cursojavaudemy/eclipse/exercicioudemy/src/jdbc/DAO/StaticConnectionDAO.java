package jdbc.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class StaticConnectionDAO {

    //Recolhimento dos Dados fornecidos no properties
    private static Properties getconnProp() throws IOException {
        Properties prop = new Properties();
        String caminho = "/conexaoTestDAO.properties";
        prop.load(StaticConnectionDAO.class.getResourceAsStream(caminho));
        return prop;
    }

    public static Connection getconn(){
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Properties prop = getconnProp();

            return DriverManager.getConnection(prop.getProperty("banco.url"),
                    prop.getProperty("banco.usuario"), prop.getProperty("banco.senha"));
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
