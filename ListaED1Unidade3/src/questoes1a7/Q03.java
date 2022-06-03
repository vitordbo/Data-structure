package questoes1a7;

import java.util.Scanner;

public class Q03 {
    //Implemente o algoritmo de busca binária.
    // pega o meio e olha se o valor buscado é menor ou maior => reduz vetor pela metade

    
    public static void main(String[] args) {
        
        int[] vetor = new int[101];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]); 
        }

        System.out.println("Qual numero deseja buscar? ");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();
        
        // variaveis de controle 
        int inicio = 0; // inicio vetor 
        int fim = vetor.length - 1; // fim do vetor => -1 pois começa do 0 
        int meio; // definido no if 
        boolean achou = false; // trocar para true caso ache o valor 
        int posição = -1; // indicar a posição que foi encontrado
        int contador = 0; // saber quantas vezes rodou 

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2); // achar a posição do meio => sempre int 
            contador++;

            if(vetor[meio] == buscado){
                achou = true;
                posição = meio;
                break;
            } else if (vetor[meio] < buscado) { // se o valor buscado for maior que a posição do meio 
                inicio = meio + 1; // inicio passa a ser o valor do meio + 1 => reduzindo o vetor
            }
            else { // se o valor buscado for menor => reduzie vetor para metade inicial
                fim = meio - 1;
            }
        }
        
        System.out.println("Quantidade de testes: " + contador);
        if (achou == true){
            System.out.println("Achou na posição: " + posição);
        }
        else{
            System.out.println("Não achou");
        }
    }
}
