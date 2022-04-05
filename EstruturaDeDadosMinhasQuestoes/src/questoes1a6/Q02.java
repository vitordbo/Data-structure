package questoes1a6;

import java.util.Scanner;

public class Q02 {
	// atribua com valores vindos do teclado variaveis adequadas para idade, altura, primeira letra do nome, nome completo
	// exiba na tela 
	
	// instanciando classe scanner 
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main(String args[]) {

		System.out.print("Informe a idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Informe a altura: ");
		float altura = scanner.nextFloat();  // usar com virgula no scanner // scanner.useLocale(Locale.US); => para colocar com o ponto

		
		System.out.print("Informe a primeira letra do seu nome: ");
		// char l = scanner.nextChar(); => assim não vai => precisa de um try catch como no codigo 1 > main 01
		char l = scanner.next().charAt(0); // codigo que foi recomendado => se digitar ab => pega so o a 
		
		scanner.nextLine(); // limpar buffer
		System.out.print("Informe seu nome completo: ");
		String nome = scanner.nextLine();
	
		// mostrando na tela 
		System.out.println("Idade : " + idade);
		System.out.println("Altura : " + altura);
		System.out.println("Primeira letra : " + l);
		System.out.println("Nome completo : " + nome);

	}

}
