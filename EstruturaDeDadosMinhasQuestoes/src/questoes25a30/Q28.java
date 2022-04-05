package questoes25a30;

import java.util.Scanner;

public class Q28 {
	// Construa um programa que mova o numero da ultima posi��o de um vetor para a primeira posi��o, Fa�a isso gradativamente: 
	// use uma estrutura de repeti��o, e em cada itera��o do loop mova esse numero apenas uma posi��o, ou seja,
	//troque esse numero da posi��o n por n-1
	
	private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Qual o tamanho do vetor? ");
		int size = scanner.nextInt();
		
		int vetor[] = new int[size];
		
		System.out.println("Monte o seu vetor: "); // receber valores escolhidos do usuario para o vetor 
		for (int i = 0; i < size; i++) {  // for para ler os valores => enquanto o valor de size for maior vai rodar o for
			System.out.println("Digite o numero " + i + ": "); 
			int n = scanner.nextInt(); // usuario digita ate i ser maior ou igual ao size que foi digitado antes (completa o vetor)
			vetor[i] = n;  // atribui o valor digitado pelo usuario a todo  o vetor
		}
		
		// mostrando o vetor que foi montado pelo usuario
		System.out.println("Mostrando vetor ");
		for(int i=0; i<size; i++) {
			System.out.println("Vetor na posi��o " + i + " = " + vetor[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		int ultimo =vetor[vetor.length - 1];  // comprimento = 4 => mas so te, 0,1,2 no vetor
		
		for (int i = vetor.length - 1; i >= 1; i--) {  
			vetor[i] = vetor[i-1];   // posi��o 3 do vetor vai receber posi��o 1
			vetor[i-1] = ultimo;  // posi��o 1 do vetor vai recber 
		}
		
		
		// mostrando o vetor que foi montado pelo usuario
				System.out.println("Mostrando vetor ");
				for(int i=0; i<size; i++) {
					System.out.println("Vetor na posi��o " + i + " = " + vetor[i]);
				}
				
				System.out.println("-------------------------------------------");
		
	}

}
