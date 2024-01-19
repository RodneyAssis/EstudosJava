package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class inserirValores {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conn = StaticConnection.getConn();

        while (true) {
            UUID ID = UUID.randomUUID();

            System.out.println("Nome: ");
            String nome = input.next();
            if (nome.equals("0")){
                break;
            }

            System.out.println("Preco: ");
            float preco = input.nextFloat();

            System.out.println("Quantidade: ");
            int qtd = input.nextInt();

            String sql = "INSERT INTO produtos (ID, nome, preco, quantidade) values " +
                    "('" + ID + "', '" + nome + "', '" + preco + "', '" + qtd + "')";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();

        }

        conn.close();
        input.close();
    }
}
