package questoes1a6;

import java.util.Scanner;

public class Q04 {

	// calcular e exibir a media aritm�tica de tres numeros inteiros 
	
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main(String[] args) {
			
		System.out.println("Digite o primeiro valor: ");
		    int a = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		    int b = scanner.nextInt();
			
	    System.out.println("Digite o terceiro valor: ");
		    int c = scanner.nextInt();
			
			int media;
			
			media = ((a+b+c) / 3);
			System.out.println("A media aritm�tica dos tr�s n�meros interios � : " + media);

	}

}
