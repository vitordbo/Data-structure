package questoes25a30;

import java.util.Scanner;

public class Q27 {

	// construa um programa que identifique o maior e menor numero de um vetor de inteiros 
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
			System.out.println("Vetor na posição " + i + " = " + vetor[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		int maior = vetor[0];   // maior recebe o valor do vetor na posição 0
		int menor = maior;      // menor tbm recebe valor do vetor na posição 0
 		
		for(int i = 0; i < vetor.length; i++) {//ate o vetor acabar 
			if (vetor[i] >= maior) {   // se o vetor na posição que o if esta for maior ou igual ao valor 0 do vetor
				maior = vetor[i];   // se for maior, vai salvar nessa variavel => passeia pelo vetor de novo com essa variavel atualizada
			}                       //como a variavel tá com o maior vai ficar testando => se encontrar outro maior => atualiza a variavel
			
			if (vetor[i] < menor) { // se for menor que o valor inicial => entra no if => entra no if e passa pra variavel o valor com 
				menor = vetor[i];   // base no valor que o for esta => até não ter nenhum menor 
			}
		}
		
		System.out.println("O maior valor do vetor é: " + maior);
		System.out.println("O menor valor do vetor é: " + menor);
	
	}

}
