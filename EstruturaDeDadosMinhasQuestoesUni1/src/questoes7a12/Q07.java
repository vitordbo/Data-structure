package questoes7a12;

import java.util.Scanner;

public class Q07 {

	// calcular uma divis�o entre dois numeros reais. Produza uma alerta em caso de divis�o por 0
	
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main (String args[]) {
		
		System.out.println("Digite o primeiro valor real: ");
		float a = scanner.nextFloat();
		
		System.out.println("Digite o segundo valor real: ");
		float b = scanner.nextFloat();
		
		// usnsando if para alerta
		if (b == 0) {
			float divisao = a / b;
			System.out.println("Valor da divis�o: " + divisao);
			System.out.println("Ops! Divisao por zero");
		}
		
		
		// usando try catch
		try { // try cath para dividir por 0 => tenta dividir => se n�o dividir � pq o b � 0
			float divisao = a / b;
			System.out.println("Valor da divis�o: " + divisao);
		} catch (ArithmeticException e) {  // exception aritmetica 
			System.out.println("Ops! Divisao por zero");
		}
	
	}
}
