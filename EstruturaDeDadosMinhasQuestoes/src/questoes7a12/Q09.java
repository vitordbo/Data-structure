package questoes7a12;

import java.util.Scanner;

public class Q09 {

	//Calcular a area de um circulo, tendo como entrada o valor do raio, que deve ser positivo, use o valor constante 
	// PI vindo da biblioteca matematica
	// A = pi . r^2
	
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main (String args[]) {
		
		System.out.println("Digite o valor do raio (não pode ser negativo): ");
		double raio = scanner.nextDouble();
	
		while(raio < 0) {
			System.out.println("Ops! valor do raio está negativo, digite outro (não pode ser negativo): ");
			raio = scanner.nextDouble();
			
		}
		
		double pi = Math.PI;
		double areaCirculo = pi * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é: " + areaCirculo);

	}
}
