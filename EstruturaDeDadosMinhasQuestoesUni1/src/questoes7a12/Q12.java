package questoes7a12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q12 {
	// Distinguir, com base na media parcial do aluno, se ele será aprovado, reprovado ou na final. Aplique as regras da Ufersa
	
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
			System.out.println("Sua media foi de "+ df.format(media) +" Parabéns,foi Aprovado!!");
		}
		if (media < 7 && media >= 4) {
			System.out.println("Sua media foi de "+ media +" Estude mais, está de recuperação!!");
		}
		if (media < 4) {
			System.out.println("Sua media foi de "+ media +" Que pena,foi reprovado!!");
		}
	
	}

}
