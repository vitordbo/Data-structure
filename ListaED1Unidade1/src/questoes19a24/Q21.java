package questoes19a24;

import java.util.Scanner;

public class Q21 {
	// construa um programa que calcule o somatorio dos numeros inteiros de um intervalo , definido por um numero inicial e um 
	// numero final. Ex: Caso as entras fossem 4 e 9 o resultado seria 39 => 4+5+6+7+8+9 = 39
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
	System.out.println("Digite o primeiro numero para descobrir o intervalo: ");	
	int numero1 = scanner.nextInt();
	
	System.out.println("Digite o segundo numero para descobrir o intervalo: ");	
	int numero2 = scanner.nextInt();
	
	int soma = 0;
	
	for(int contador = numero1; contador <= numero2; contador++)
	{
		soma += contador;
	}
	
	
	System.out.println("A soma é: " + soma);
	}
}
