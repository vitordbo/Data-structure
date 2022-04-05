package questoes13a18;

import java.util.Scanner;

public class Q18 {

	// verificar se a senha, informada durante a execução, é correta. Quando a senha estiver correta, exiba "senha correta" e o 
	// programa é encerrado. Quando a senha estiver errada, exiba "senha incorreta", e permita a entrada novamente da senha,
	// repetindo esse processo até que a senha entrada esteja correta 
	//a) usando while
	//b) usando do-while
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
	
		//pegando a senha do usuario
		System.out.println("Defina sua senha: ");
		String senha = scanner.next();
	
		limpatela();
		scanner.nextLine();
	
		// senha que vai ser comparada com a senha que foi dada antes
		System.out.println("Qual a sua senha? ");
		String senhaTentativa = scanner.next();
		
		
		// usando while 
		while(!(senhaTentativa.equals(senha))) {  // se fosse igual ia ser true => 
			System.out.println("Senha incorreta, tente novamente: "); // enquanto for dirente quero que fique no while => por isso neguei (!)
	         scanner.nextLine();
	     	 senhaTentativa = scanner.next();
		}
	
		System.out.println("senha correta!");  
		System.out.println("\n---------------------------------");
		
		
		// usando outra senha para testar do-while 
		//pegando a senha do usuario
		System.out.println("Defina sua senha: ");
		String senha2 = scanner.next();
		
		limpatela();
		scanner.nextLine();
		
		// senha que vai ser comparada com a senha que foi dada antes
		System.out.println("Qual a sua senha? ");
		String senhaTentativa2 = scanner.next();
		
		// usando do-while
		do {
			System.out.println("Senha incorreta, tente novamente: "); // enquanto for dirente quero que fique no while => por isso neguei (!)
	         scanner.nextLine();
	     	 senhaTentativa2 = scanner.next();
			} 
		while(!(senhaTentativa2.equals(senha2)));
	
		System.out.println("senha correta!");  // usando do-while 
		System.out.println("\n---------------------------------");
	
	}

	public static void limpatela() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n "
			+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\""
			+ " \n\n\n\n\n"); }
}
