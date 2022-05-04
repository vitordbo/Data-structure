package questoes19a24;

import java.util.Scanner;

public class Q20 {
	// construa um problema que identifique se um numero é primo 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		// recebendo n => primo = divisivel por 1 e ele mesmo
		System.out.println("Digite o numero para descobrir se é primo: ");	
		int n = scanner.nextInt();
		int contador = 0;
		int divisores = 0;
		
		for (int i=1; i <= n; i++) { // if para fazer as divisões ate o valor digitado
			if((n%i) == 0 ) {
				 contador++;  // se for divisivel somente por 1 e ele mesmo => contador vai ser dois => se tiver mais que isso no contador
				 divisores = i; // quer dizer que foi dividivo com resto 0 mais vezez, ou seja, não é primo
				 System.out.println("Esses são os divisores = " + divisores);  // divisores vai receber o valor que é o divisor dentro do if
			}
		}

		if (contador > 2) { // contador maior que dois => mais de dois divisores
			System.out.println(n +" não é divisivel somente por 1 e ele mesmo, ou seja, não é primo ");	
		}
		if (contador <= 2) {  // contador menor que dois => menos de dois ou dois divisores
			System.out.println(n +" é divisivel somente por 1 e ele mesmo, ou seja, é primo ");	
		}
	}
}
