package jdbc.atualizarregistro;

import jdbc.StaticConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarProduto {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conn = StaticConnection.getConn();


        System.out.println("Nome Atual");
        String nomeAlterar = input.nextLine();
        System.out.println("Novo nome");
        String nomeUpdate = input.nextLine();


        String sql = "UPDATE produtos set nome = ? where nome = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nomeUpdate);
        stmt.setString(1, nomeAlterar);


        System.out.println("Nome Alterado com sucesso");
        conn.close();
        input.close();

    }
}
