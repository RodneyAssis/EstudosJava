package jdbc.excluirregistro;

import jdbc.StaticConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class excluirRegistro {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conn = StaticConnection.getConn();

        System.out.println("Informe o nome do produto que deseja excluir: ");
        var nome = input.next();

        String sql = "SELECT * FROM Produtos WHERE nome LIKE ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome + "%");

        var res = stmt.executeQuery();

        while (res.next()) {
            System.out.println("Dados selecionados:" +
                    "\n" + res.getString("id") +
                    "\n" + res.getString("nome") +
                    "\n" + res.getString("preco") +
                    "\n" + res.getString("quantidade"));
            nome = res.getString("nome");
        }

        res.close();
        stmt.close();

        System.out.println("Deseja excluir esse item?");
        var opcao = input.next();
        if (opcao.equals("sim")){
            String sql2 = "DELETE FROM produtos WHERE nome = ?";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, nome);
            stmt2.executeUpdate();
        }

        conn.close();
        input.close();
    }
}
