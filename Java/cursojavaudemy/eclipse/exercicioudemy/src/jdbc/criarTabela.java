package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class criarTabela {
    public static void main(String[] args) throws SQLException {
        Connection conn = StaticConnection.getConn();
        Statement stmt = conn.createStatement();

        String sql = "CREATE TABLE clientes(" +
                "id uuid primary key," +
                "nome varchar(200) not null," +
                "cpf varchar(11) not null)";

        stmt.execute(sql);

        conn.close();
    }


}
