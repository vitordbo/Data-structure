package questoes19a24;

import java.util.Scanner;

public class Q24 {
	// construa um programa para ler e exibir um vetor de inteiros
	// em tempo de execução, o usuario pode definir o tamanho do vetor 
	
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		System.out.println("Qual o tamanho do vetor? ");
		int size = scanner.nextInt();
		
		int vetor[] = new int[size];
	
		for (int i = 0; i < size; i++) {  // for para ler os valores => enquanto o valor de size for maior vai rodar o for
			System.out.println("Digite o numero " + i); 
			int n = scanner.nextInt(); // usuario digita ate i ser maior ou igual ao size que foi digitado antes (completa o vetor)
			vetor[i] = n;  // atribui o valor digitado pelo usuario a todo  o vetor
		}
		
		for(int i = 0; i < size; i++){  // for para exibir o vetor => enquanto o valor de size for maior vai rodar o for
			System.out.println("Vetor na posição " + i + " = " + vetor[i]); 
		}
	}
}
