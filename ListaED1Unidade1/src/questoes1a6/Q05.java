package questoes1a6;

import java.util.Scanner;

public class Q05 {
	
	// calcular e exibir a media aritmética de tres numeros reais 
	
		private static Scanner scanner = new Scanner( System.in ); 
		
		public static void main(String[] args) {
				
			System.out.println("Digite o primeiro valor: ");
			    float a = scanner.nextFloat();
			
			System.out.println("Digite o segundo valor: ");
			    float b = scanner.nextFloat();
				
		    System.out.println("Digite o terceiro valor: ");
			    float c = scanner.nextFloat();
				
				float media;
				
				media = ((a+b+c) / 3);
				System.out.printf("A media aritmética dos três números interios é : = %.3f \n", media); 
				// % 3f => numerod e casas depois da virgula
				
		}

	}

