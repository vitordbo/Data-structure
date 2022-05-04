package questoes25a30;

import java.util.Scanner;

public class Q25 {
		// construa um programa para ler e exibir um matriz de inteiros
		// em tempo de execução, o usuario pode definir o tamanho da matriz 
		
		
		private static Scanner scanner = new Scanner( System.in ); 
		public static void main(String[] args) {
			
			System.out.println("Qual a quantidade de linhas da matriz? ");
			int linhas = scanner.nextInt();
			
			System.out.println("Qual a quantidade de colunas da matriz? ");
			int colunas = scanner.nextInt();
			
			int matriz[][] = new int[linhas][colunas];
		
			for (int i = 0; i < linhas; i++) {  // for para ler os valores => enquanto o valor de size for maior vai rodar o for
				for (int j = 0; j < colunas; j++) {
				System.out.println("Digite o valor [" + i + "] [" + j + "] "); 
				int n = scanner.nextInt(); 
				matriz[i][j] = n;  // atribui o valor digitado pelo usuario a toda a matriz
		     	}
			}
			for (int i = 0; i < linhas; i++) {  // for para ler os valores => enquanto o valor de size for maior vai rodar o for
				for (int j = 0; j < colunas; j++) {			
				System.out.println("O valor em [" + i + "] [" + j + "] = " + matriz[i][j]); 	
				}
			}		
   }
}