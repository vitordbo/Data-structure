package questoes19a24;

import java.util.Scanner;

public class Q20 {
	// construa um problema que identifique se um numero � primo 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		// recebendo n => primo = divisivel por 1 e ele mesmo
		System.out.println("Digite o numero para descobrir se � primo: ");	
		int n = scanner.nextInt();
		int contador = 0;
		int divisores = 0;
		
		for (int i=1; i <= n; i++) { // if para fazer as divis�es ate o valor digitado
			if((n%i) == 0 ) {
				 contador++;  // se for divisivel somente por 1 e ele mesmo => contador vai ser dois => se tiver mais que isso no contador
				 divisores = i; // quer dizer que foi dividivo com resto 0 mais vezez, ou seja, n�o � primo
				 System.out.println("Esses s�o os divisores = " + divisores);  // divisores vai receber o valor que � o divisor dentro do if
			}
		}

		if (contador > 2) { // contador maior que dois => mais de dois divisores
			System.out.println(n +" n�o � divisivel somente por 1 e ele mesmo, ou seja, n�o � primo ");	
		}
		if (contador <= 2) {  // contador menor que dois => menos de dois ou dois divisores
			System.out.println(n +" � divisivel somente por 1 e ele mesmo, ou seja, � primo ");	
		}
	}
}
