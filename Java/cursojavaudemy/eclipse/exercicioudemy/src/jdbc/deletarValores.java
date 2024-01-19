package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deletarValores {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conn = StaticConnection.getConn();

        while (true){
            System.out.println("Informe o valor que deseja deletar");
            var nome = input.next();
            if (nome.equals("0")) {
                break;
            }
            String sql = "DELETE FROM produtos WHERE nome = '" + nome + "'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
        }

        conn.close();
        input.close();
    }
}
