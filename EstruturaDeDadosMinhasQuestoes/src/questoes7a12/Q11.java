package questoes7a12;

import java.util.Scanner;

public class Q11 {

	
	// Construa um programa que simule uma transferência bancaria, entre duas contas. Primeiro, inicialize cada conta com R$100. Depois, 
	// permita que o usuario defina quando deve tranferir, da conta 1 para a conta 2, 
	//porem a transferência só deve ser realizada caso haja saldo suficinete
	
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
	
		float contaUm = 100f;
		float contaDois = 100f;
		
		System.out.println("Quanto deseja tranferir da conta 1 para a conta 2? ");
		float valorT = scanner.nextFloat();
		
		if (valorT <= contaUm) {
			System.out.println("Valor na conta 1: "  + contaUm);
			System.out.println("Valor na conta 2: " + contaDois);
			System.out.println("Realizando transferência...");
			
			contaUm += valorT;
			contaDois -= valorT;
			
			System.out.println("Apos transferência: ");
			System.out.println("Valor na conta 1: "  + contaUm);
			System.out.println("Valor na conta 2: " + contaDois);
			
		} else {
			System.out.println("Impossivel sacar! O valor desejado de saque é maior que o valor disponivel na conta");
		}
		
	}

}
