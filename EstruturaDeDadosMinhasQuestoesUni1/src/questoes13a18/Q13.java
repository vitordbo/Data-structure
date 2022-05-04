package questoes13a18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q13 {

	// Construa um programa que calcule para o aluno sua media parcial e informe sua situa��o parcial
	// (Aprovado, recupera��o ou reprovado. Caso ele esteja em recupera��o, calcule quanto precisa tirar
	// na quarta prova para ser aprovado (media final maior ou igual a 5)
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
	
		System.out.println("Digite a nota da primeira unidade: ");
		float n1 = scanner.nextFloat();
		
		System.out.println("Digite a nota da segunda unidade: ");
		float n2 = scanner.nextFloat();

		System.out.println("Digite a nota da terceira unidade: ");
		float n3 = scanner.nextFloat();
	
		
		float media = (n1 + n2 + n3) / 3;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		if (media >= 7) {
			System.out.println("Sua media foi de "+ df.format(media) +" Parab�ns,foi Aprovado!!");
		}
		if (media < 7 && media >= 4) { // if da recupera��o
			System.out.println("Sua media foi de "+ media +" Estude mais, est� de recupera��o!!");
			System.out.println("Digite a nota da sua quarta prova: ");
			float n4 = scanner.nextFloat();
			
			float mediaQuarta = (media + n4) / 2;
			System.out.println("Sua media apos a quarta prova foi de: "+ df.format(mediaQuarta)+" (media maior que 5 igual a aprova��o)");
			if (mediaQuarta >= 5) {
				System.out.println("Parab�ns!! Voc� passou na quarta prova");
			}
			else {
				System.out.println("Que triste, voc� n�o conseguiu a aprova��o :'( ");
			}
			
		}
		if (media < 4) {
			System.out.println("Sua media foi de "+ media +" Que pena,foi reprovado!!");
		}
	
	}

}
