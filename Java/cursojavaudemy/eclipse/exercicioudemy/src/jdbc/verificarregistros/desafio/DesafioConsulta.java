package jdbc.verificarregistros.desafio;

import jdbc.StaticConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioConsulta {

    public static void main(String[] args) throws SQLException {
        Connection conn = StaticConnection.getConn();
        Scanner input = new Scanner(System.in);

        System.out.println("Inserir nome: ");
        var nome = input.next();

        String sql = "SELECT * FROM Produtos WHERE nome LIKE ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome + "%");

        var res = stmt.executeQuery();

        System.out.println("\nProdutos apartir do nome: " +  nome);
        while (res.next()){
            System.out.println("Nome: " + res.getString("nome") +
                    " Preco: " + res.getDouble("preco") +
                    " Quantidade: " + res.getInt("quantidade"));
        }


        stmt.close();
        input.close();
        conn.close();

    }
}
