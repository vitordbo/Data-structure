package questoes19a24;

import java.util.Scanner;

public class Q19 {
		//construa um programa para exibir a tabuada de qualquer numero "n" (1 a 9), sendo "n" um numero fornecido pelo ususario
		//Utilize estrutura de repetição
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		// recebendo n
		System.out.println("Digite o numero para formar a tabuada: ");	
		int n = scanner.nextInt();
		
		for (int contador=1; contador <= 9; contador++) {
			int mult = n * contador;
			System.out.println(n + " x " + contador + " = " + mult);
		}

	}
}
