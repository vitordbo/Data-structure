package questoes25a30;

import java.util.Scanner;

public class Q29 {
	// Construa um programa que inverta a frase digitada pelo usuario. Por exemplo, se string1 for 
	// "bom dia", então String2 ser "aid mob"
	
	private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite a string que deseja inverter: ");
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append(scanner.nextLine());
		//This is because scanner.nextLine() returns a String, and sb1.append(...) accepts a variety of arguments, including Strings.
		//sb1.append => recebe String e vira String Buffer
		
		System.out.println("String normal: " + sb1);
		System.out.println("-------------------------------------------");
		System.out.println("String invertida: " + sb1.reverse());
		
	}
}
