package questoes13a18;

import java.util.Scanner;

public class Q15 {
	
	// Construa um programa que leia um numero inteiro digitado pelo usuario. Caso o numero pertença ao intervalo de 1 a 5,
	// exiba o numero por extenso. Caso o numero não pertença a esse intervalo, exiba a mensagem "valor invalido"
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		// switch funciona melhor aqui 
		
		System.out.println("Digite seu numero inteiro: ");
		int n = scanner.nextInt();
		
		switch ( n ) {
		
		case 1: System.out.println("Um");
				break;
		case 2: System.out.println("Dois");
				break;
		
		case 3: System.out.println("Tres");
				break;
				
		case 4: System.out.println("Quatro");
				break;
		
		case 5: System.out.println("Cinco");
				break;
		
		default: System.out.println("Valor invalido");
				break;
		}
		
				
	
	
	
	
	
	}

	
}
	
	
	

