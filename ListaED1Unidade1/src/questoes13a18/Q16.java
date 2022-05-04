package questoes13a18;

import java.util.Scanner;

public class Q16 {
	//Construa um programa que leia do usuario um numero incial e um numero final. Em seguida, exiba na tela uma sequencia
	// com os numeros desse intervalo informado pelo usuario => 4 e 10 => 4 5 6 7 8 9 10
	//a) usando While 
	//b) usando do-while
	//c) usando for
	
	private static Scanner scanner = new Scanner( System.in ); 
	public static void main(String[] args) {
		
		 System.out.print("Digite o numero incial "); 
		    int n1 = scanner.nextInt(); 
		
		 System.out.print("Digite o numero final "); 
		    int n2 = scanner.nextInt();
		    
		    // contador pro while e do-while
		    int contador = n1;
		
		    
		    System.out.println("\n---------------------------------");
		    // usando while
			System.out.println("Usando while: ");
		    while(contador <= n2) {
		    	System.out.print(contador + " ");
		    	contador++;
		    }
		
		    System.out.println("\n---------------------------------");
		    // usando do-while
		    contador = n1;
		    System.out.println("Usando do-while: ");
		    do {
		    	System.out.print(contador + " ");
		    	contador++;
		    }  	
		  	while(contador <= n2);	
		    
		    
		    System.out.println("\n---------------------------------");
		    // usando for com novo contador
		    System.out.println("Usando for");
		    for(int cont = n1; cont <= n2; cont++) 	//fazendo outro contador = cont
		    {
		    	System.out.print(cont + " ");
		    }
	}
	
}
		
		
