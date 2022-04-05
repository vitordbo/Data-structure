package questoes1a6;

import java.util.Scanner;

public class Q03 {
	// receba do teclado dois numeros inteiros, calcule e exiba:
	// adi��o, subtra��o, multiplica��o, quociente da divis�o e resto da divis�o 
	
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main(String args[]) {

		System.out.println("Digite o valor a: ");
		int a = scanner.nextInt();
		
		System.out.println("Digite o valor b: ");
		int b = scanner.nextInt();
		
		int soma = a + b;
		System.out.println("Valor da soma: " + soma);
		
		int sub = a - b;
		System.out.println("Valor da subtra��o: " + sub);
		
		int mult = a * b;
		System.out.println("Valor da multiplica��o: " + mult);
		
		//int divisao
		try {
			int divisao = a / b;
			System.out.println("Valor do quociente divis�o: " + divisao);
		} catch (ArithmeticException e) {
				System.out.println("Ops! Divisao por zero");
			}
	
		
		int resto = a % b;
		System.out.println("Valor do resto: " + resto);
		
	}
}
