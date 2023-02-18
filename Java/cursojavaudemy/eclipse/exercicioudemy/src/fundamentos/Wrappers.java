package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		// byte
		Byte b = 1;
		Short s = 100;
		Integer i = Integer.parseInt(input.next()); // int
		Long l = 100000L;
		
		
		System.out.println(i);
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		input.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
	}
}
