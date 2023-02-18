package arraycollection.exercicios.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> lista = new LinkedList<>();
		
		int nums = 0;
		
		while (true) {
			System.out.println("Informe um numero: ");
			nums = input.nextInt();
			if (nums < 0) {
				break;
			}
			lista.add(nums);
			System.out.println(lista);
		}
		
		System.out.println("Lista: de numeros: " + lista);
		System.out.println("Somatorio de todos os valores pares: " + totalPares(lista));
		System.out.println("Somatorio do numeros: " + maiorValor(lista));
		System.out.println();
		input.close();
		
		
				
	}
	
/*
 totalPares: a função recebe como parâmetro 
 um array de inteiros e retorna um  número inteiro indicando 
 o total de números pares existentes no array. 
 */
	public static int totalPares(List<Integer> lista) {
		int total = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				total += lista.get(i);
			}
		}
		return total;
	}
/*
maiorValor: a função recebe como parâmetro 
um array de inteiros e retorna o  maior 
número existente no array.  
*/
	public static int maiorValor(List<Integer> lista){
		int mValor = 0;
		for (Integer i : lista) {
			if (i > mValor) {
				mValor = i;
			}
		}
		return mValor;
	}
	

}
