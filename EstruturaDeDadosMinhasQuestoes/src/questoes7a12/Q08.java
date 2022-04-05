package questoes7a12;

import java.util.Scanner;

public class Q08 {

	// Calcular o imc de uma pessoa. Produza uma alerta em caso de divisão por 0
	// imc = peso / (altura)^2
	
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main (String args[]) {
		
		System.out.println("Digite o valor do seu peso: ");
		float peso = scanner.nextFloat();
		
		System.out.println("Digite a sua altura: ");
		float altura = scanner.nextFloat();
		
	
		double alturaQuadra = Math.pow(altura,2);
		
		
		// avisando com try cath
		try {
			double imc = (peso / alturaQuadra);
			System.out.println("Seu imc é: " + imc);
		} catch (ArithmeticException e) {
				System.out.println("Ops! Divisao por zero");
			}
		
		// avisando com if
		if (alturaQuadra == 0) {
			double imc = (peso / alturaQuadra);
			System.out.println("Seu imc é: " + imc);
			System.out.println("Ops! Divisao por zero");
		}
		
		System.out.println("Saiba sua classificação");
		System.out.println("MC	CLASSIFICAÇÃO	OBESIDADE (GRAU)\r\n"
				+ "MENOR QUE 18,5	        MAGREZA	    0\r\n"
				+ "ENTRE 18,5 E 24,9	NORMAL	    0\r\n"
				+ "ENTRE 25,0 E 29,9	SOBREPESO	I\r\n"
				+ "ENTRE 30,0 E 39,9	OBESIDADE	II\r\n"
				+ "MAIOR QUE 40,0	    OBESIDADE   GRAVE	III");
	}
}
