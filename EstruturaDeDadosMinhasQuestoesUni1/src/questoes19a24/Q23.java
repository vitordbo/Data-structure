package questoes19a24;

import java.util.Scanner;

public class Q23 {
	//construa um programa que simule uma calculadora. Disponibilize um menu de op��es e simule a op��o desejada, exibindo novamente o menu
	// ate que o usuario escolha sair. Menu de op��es
	// 1 - potencia��o      Dica: utilize fun��es da biblioteca matematica
	// 2 - raiz quadrada    Dica: utilize fun��es da biblioteca matematica
	// 3 - fatorial         Dica: crie e utilize uma fun��o com a solu��o da quest�o anterior
	// 0 - sair 
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
	System.out.println("Digite o que deseja fazer: 1-potencia��o  2-raiz quadrada  3-fatorial  0-sair ");	
	int option = scanner.nextInt();
	double resultado = 0;
	
	while (!(option == 0)) { // se for igual a 0 => vira false e sai do while
	switch(option) {	
	case 1:
		System.out.println("Digite o numero que deseja descobrir a potencia��o: ");	
		double numero = scanner.nextDouble();
		System.out.println("Digite o numero que deseja elevar: ");	
		double expoente = scanner.nextDouble();
		resultado = Math.pow(numero,expoente);
		System.out.println(numero + " elevado a: " + expoente + " = " + resultado);
		break;
	
	case 2:
		System.out.println("Digite o numero que deseja descobrir a raiz quadrada: ");	
		double numRaiz = scanner.nextDouble();
		double raiz = Math.sqrt(numRaiz);
		System.out.println("Raiz quadrada de: " + numRaiz + " = " + raiz);
		break;
		
	case 3:
		System.out.println("Digite o numero que deseja descobrir o fatorial: ");	
		int numFatorial = scanner.nextInt();
			int resulFatorial = fatorial(numFatorial);

		System.out.println("Fatorial de: " + numFatorial + " = " + resulFatorial);
		break;
		
		}
	
	System.out.println("Digite o que deseja fazer: 1-potencia��o  2-raiz quadrada  3-fatorial  0-sair ");	
	option = scanner.nextInt(); // lendo de novo para continuar o loop
	}

	System.out.println("Obrigado por usar a calculadora!! ");	
	}
	
	static int fatorial (int numeroFat) {  // fun��o com base na quest�o anterior => q22
		int fatFinal = 0;
		int FatAux = numeroFat;
		
		while (numeroFat > 1) {
		FatAux = FatAux*(numeroFat -1);
		numeroFat--;
		}
		
		fatFinal = FatAux;
		return fatFinal;	
	}	
}
