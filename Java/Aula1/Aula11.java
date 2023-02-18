import java.util.Scanner;

public class Aula11  {
	public static void main(String[] args) {
        Scanner galao = new Scanner(System.in);

        System.out.println("Digite o numero de galões que deseja converter:");
        int user = galao.nextInt();

        double litros = 3.7854;

        System.out.println(user + " galão em litros é " + (litros*user)
                + " lts");
        galao.close();
    }
}

