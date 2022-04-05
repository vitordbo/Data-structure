package questoes31a38;

import java.util.Scanner;

public class Q35 {
	//Construa e use um função para calcular o fatorial de um numero utilizando recursividade
	
	private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args) {
			
		 System.out.println("Digite o valor para descobrir seu fatorial: ");
		 int numero = scanner.nextInt();
			
		 System.out.println("Valor do fatorial usando recursividade: " + recursivaFat(numero));
		    
}

	private static int recursivaFat(int numero) {
		int fat;
		if(numero == 0) { // para não ficar infinito
			 System.out.println("-----------------------"); 
			 System.out.println("PAROU!!"); 
			 System.out.println("-----------------------"); 
			return 1; // retornar 1
		}
		else {
		 System.out.println("Empilhando... " + numero); // mostrando quantas vezes vai ser empilhada
		 fat =  numero * recursivaFat(numero -1);  // chamada da função com -1
		 
		 System.out.println("Desempilhando..." + numero); // mostrando quantas veszes vai ser desempilhada
		 System.out.println("Fatorial: " + fat); // mostrando valor faotiral 
		}
		return fat;  // retornando valor do fatorial
	}
	
	
	/*	Mais simples =>
	 * private static int recursivaFat(int numero) {
		if(numero == 0) { // para não ficar infinito
			return 1; // 
		}
		 return numero * recursivaFat(numero -1);  
		 
		}

	 */
	
}