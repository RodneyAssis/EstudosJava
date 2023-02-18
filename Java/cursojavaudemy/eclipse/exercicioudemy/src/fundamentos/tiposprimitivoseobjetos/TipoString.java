package fundamentos.tiposprimitivoseobjetos;

public class TipoString {
public static void main(String[] args) {
	
	System.out.println("olá mundo!".charAt(0)); //indentifica a letra na posição x
	
	String s = "boa tarde";
	s = s.toUpperCase();
	
	System.out.println(s.concat("!!"));
	System.out.println(s + "!!");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.toUpperCase().endsWith("TARDE"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));
	
	var nome = "Rodney";
	var sobrenome = "Assis";
	var idade = 24;
	var salario = 1150.20;
	
	System.out.println("Nome: " + nome.concat(sobrenome));
	//contatenado
	System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %d\nsalario: %.2f", nome, sobrenome, idade, salario);
	
	String frase = String.format("\n Nome: %s\nSobrenome: %s\nIdade: %d\nsalario: %.2f", nome, sobrenome, idade, salario);
	
	System.out.println(frase);
	
	System.out.println("frase qualquer".contains("q"));
	System.out.println("frase qualquer".indexOf("se"));
	System.out.println("frase qualquer".substring(6));
	System.out.println("frase qualquer".substring(6,8));
	}
}
