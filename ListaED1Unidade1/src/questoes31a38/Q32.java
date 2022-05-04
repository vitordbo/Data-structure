package questoes31a38;

import java.util.Scanner;

public class Q32 {
	// Construa um programa que conte a quantidade de letras de uma palavra.
	// Ex.: "casa" => c=1, a=2, s=1
	
	private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		/*poderia fazer assim=>
		 * int aCont = 0;
		 * int bCont = 0;
		 * 
		 * String palavra = "casa";
		 * for (int i =0; i < palavra.length(); i++;){
		 * 		char teste = palavra.charAt(i)
		 * if(teste == 'a' || teste == 'A'){
		 * aCont++;}
		 *  if(teste == 'b' || teste == 'B'){
		 * bCont++;}
		 * }
		 * 
		 * System.out.println("a palavra tem a " + aCont);
		 * Iria ficar imenso, mas ia prestar
		 */
	
	// outro jeito
		String palavra;
		char letra1;
		int qnt;
		System.out.println("Digite uma palavra: ");
		palavra = scanner.next();
		
		for(int i = 0; i < palavra.length(); i++) {
			
			letra1 = palavra.toLowerCase().charAt(i);  // pega só o char => vai para a palavra toda
			
			if(letra1 != 0) { // se tiver palavra
				if(palavra.indexOf(letra1, 0) == -1) {  //se não tiver => index = -1
					qnt = 1;
				}
				else {
					qnt = 0; // se tiver a palavra
					for(int j =0; j < palavra.length(); j++) {
						if(letra1 == palavra.toLowerCase().charAt(j)) { // vai rodar palavra por palavra e achar a que tem 
						qnt++;
						}
					}
			palavra = palavra.replace(letra1, '0'); // elimina a antiga pra não repetir
				}
		
			System.out.println(letra1 + "=" + qnt);
			}
		}
		
	}
}

