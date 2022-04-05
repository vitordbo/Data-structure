package questoes7a12;

import java.util.Scanner;

public class Q10 {

	// Construa um programa que leia um numero inteiro e identifique se ele é ímpar ou par 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
	
		System.out.println("Digite um valor para saber se é ímpar ou par (0 para sair): ");
		int num = scanner.nextInt();
		
		while (num != 0) {
			int resto = num % 2;
			
			if (resto == 0) {
				System.out.println(num + " é par");	
			}
			else {
				System.out.println(num + " é ímpar");
			}
			
		  
			System.out.println("Digite um valor para saber se é ímpar ou par (0 para sair): ");
			num = scanner.nextInt();
		
		}
		
		System.out.println("Obrigado por usar!");
	}

}
