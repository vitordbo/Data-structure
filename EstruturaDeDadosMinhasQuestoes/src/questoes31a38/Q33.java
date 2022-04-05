package questoes31a38;

import java.util.Scanner;

public class Q33 {
		// Construa um programa que conte a quantidade de vezes que as palavras de uma
		// frase aparecem // Ex.: "estdue muito estude" => estude =2, muito=1

	static class Palavra
	{
	    String palavra = "";
	    int cont = 0;
	}
	
	private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args) 
	{
	    // Entrada de dados:
		 System.out.println("Digite sua frase: ");
		String frase = scanner.nextLine();
	    
		// Separar e contar palavras:
	    String[] arrayPalavras = frase.split(" ");  // separar as palavras da string e colocar em um array 
	    int sizePalavras = arrayPalavras.length;	  // mede o tamanho da array  
	    System.out.println("sizePalavras = " + sizePalavras);  // imprimi quantidade da palavras
	    
	    // Inicializando dicionario
	    Palavra dicionario[] = new Palavra[sizePalavras];    // array de palavras => começa sem nada e com cont = 0 
	    for(int i=0; i < sizePalavras; i++) { 
	    	dicionario[i] = new Palavra();  // cada nova palavra => TEM QUE INSTANCIAR 	
	    }
	    
	    // Variaveis de controle
	    boolean flagExiste = false;  
	    int iExiste=0;	// indice da palavra encontrada
	    int iNova=0;	// indice da palavra nova
	    
	    // PERCORRER CADA PALAVRA DA FRASE:
	    for(int p=0; p < sizePalavras; p++)
	    {
	    	// Palavra atual
	    	String palavra = arrayPalavras[p];
	    	
            // PROCURAR NA ESTRUTURA SE JA EXISTE palavra
            flagExiste = false;
            
            for(iExiste=0; iExiste<sizePalavras; iExiste++) 
            {
                if( dicionario[iExiste].palavra.equals(palavra) == true )  // se existir no dicionario => equals a alguma palavra 
                {                                                          // sai e não incremente cont => coloca como true e incremente depois
                    flagExiste = true;
                    break;
                }
            }

            if(flagExiste == true)  // como tem => só incrementa 
            {
                // Incrementar o cont
                dicionario[iExiste].cont++;
            }
            else
            {
                // Palavra nova, então adiciona	
            	dicionario[iNova].palavra = palavra; //palavra = array com as palavras que vão ser contadas
                dicionario[iNova].cont = 1;
                iNova++;
            }
	        
	    }

	    // Imprimir a lista desordenada
	    for(int i=0; i<iNova; i++) {
	        System.out.println(dicionario[i].palavra + " : " + dicionario[i].cont);
	    }

	    // Organizar a lista

	    // Imprimir a lista ordenada
	}
}
