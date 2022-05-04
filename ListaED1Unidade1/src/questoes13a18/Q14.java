package questoes13a18;

import java.util.Scanner;

public class Q14 {

	// construa um programa que calcule uma equação do segundo grau
	// crie uma função com retorno para calcular o delta
	// crie uma função sem retorno para calcular as raizes
	
	// delta =  b^2 - 4 . a . c
	// x = (-b +- delta) / 2a 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		System.out.println("Digite o valor de a: ");
		float a = scanner.nextFloat(); 
		
		System.out.println("Digite o valor de b: ");
		float b = scanner.nextFloat(); 
		
		System.out.println("Digite o valor de c: ");
		float c = scanner.nextFloat();
		
		double delta = returnDelta(a,b,c); // recebe os valore para calular o delta
		System.out.println("O valor de delta é: " + delta);
		
		calcRaizes(delta,a,b,c); // recebe delta e valores para poder calcular a raiz
		
	}
	
	public static double returnDelta (float aFunc,float bFunc, float cFunc)
	{
		double deltaFunc = Math.pow(bFunc, 2) - 4 * aFunc * cFunc; // formula delta 
		return deltaFunc;
	}
	
	public static void calcRaizes(double delta, float aFunc,float bFunc, float cFunc) {
		double x1 = (-bFunc + Math.sqrt(delta)) / (2 * aFunc);  //formula raizes
		double x2 = (-bFunc - Math.sqrt(delta)) / (2 * aFunc);
		
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}

}
