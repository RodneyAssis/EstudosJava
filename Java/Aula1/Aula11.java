import java.util.Scanner;

public class Aula11  {
	public static void main(String[] args) {
        Scanner galao = new Scanner(System.in);

        System.out.println("Digite o numero de gal�es que deseja converter:");
        int user = galao.nextInt();

        double litros = 3.7854;

        System.out.println(user + " gal�o em litros � " + (litros*user)
                + " lts");
        galao.close();
    }
}

