package questoes19a24;

import java.util.Scanner;

public class Q22 {

	//Construa um programa que calcule o fatorial de um numero. Use uma estrutura de repetição.Fatorial: n!=n(n-1)!
	// Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
	System.out.println("Digite o numero para descobrir o seu fatorial: ");	
	int numero = scanner.nextInt();  // recebe numero
	int numeroDigitado = numero;   // passa numero para outra variavel
	int fatorial = numero;  // Será o resultado temporário da multiplicação
	

	                  	                                     
	while (numero > 1){ // numero menor que 1 para
		fatorial = fatorial *(numero-1);  // calculo fatorial    x = 3 *(3-1) => 6 ==> 6 = 3*(2-1)  =>>> 6 
		numero--;  
		}

	System.out.println("O fatorial de " + numeroDigitado  +" é: " + fatorial);
	

	}
}
