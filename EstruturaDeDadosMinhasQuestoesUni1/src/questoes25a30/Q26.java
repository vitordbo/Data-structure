package questoes25a30;

import java.util.Scanner;

public class Q26 {
	//Construa e use uma função que produz um novo vetor de inteiros com a ordem inversa do vetor original passado por parametro 

	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
	

		System.out.println("Qual o tamanho do vetor? ");
		int size = scanner.nextInt();
		
		int vetor[] = new int[size];
		
		System.out.println("Monte o seu vetor para ser invertido: "); // receber valores escolhidos do usuario para o vetor 
		for (int i = 0; i < size; i++) {  // for para ler os valores => enquanto o valor de size for maior vai rodar o for
			System.out.println("Digite o numero " + i + ": "); 
			int n = scanner.nextInt(); // usuario digita ate i ser maior ou igual ao size que foi digitado antes (completa o vetor)
			vetor[i] = n;  // atribui o valor digitado pelo usuario a todo  o vetor
		}
		
		// mostrando o vetor que foi montado pelo usuario
		System.out.println("Mostrando vetor original");
		for(int i=0; i<size; i++) {
			System.out.println("Vetor na posição " + i + " = " + vetor[i]);
		}
		
		
		System.out.println("-------------------------------------------");
		inverteVetor(vetor);
		
		
	}
	
	public static void inverteVetor(int vet[]) {
		int size = vet.length;   // tamanho do vetor que vem por parametro 
		int contador = vet.length;
		
		int invertido[] = new int[size];  // criação de um novo vetor que vai receber a ordem invertida com o mesmo tamanho do original
		 
		for(int i = 0; contador != 0; i++) {   // quando contador chegar em 0 vai parar o for => primeiro indice => indice 0 do primeiro vetor
			/* pensando em o usuario digitou 3 no tamanho do vetor =>
			 já deve decrementar no começo o contador => em um vetor com tamanho 3 => 
			 vamos ter os indices 0,1,2 => se não for decrescido no começo 
		     vamos ter 3,2,1,0 => ou seja 4 indices até o contador chegar em 0 => logo vai criar um vetor maior do que necessario e vai gerar 
			 uma exceção, pois só teriamos 3 valores para um vetor de 4 valores
			 para evitar isso deve-se decrementar logo no começo => ficaria 3,2,1,0 sem o decremento
			 com o decremento 2,1,0 => correto pois so temos 3 valores para considerar */
			contador--; 
			invertido[i] = vet[contador];
		}
		
		System.out.println("Mostrando vetor invertido");
		for(int i = 0; i < size; i++) {  // mostra invertido
			System.out.println("Vetor na posição " + i + " = " + invertido[i]);
		}
	}
}
