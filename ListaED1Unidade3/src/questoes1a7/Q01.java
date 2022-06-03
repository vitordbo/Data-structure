package questoes1a7;

import java.util.Scanner;

public class Q01 {
    //Implemente o algoritmo de busca linear. Utilize uma estrutura estática
    // passar por todos do vetor até achar o valor

    public static void main(String[] args) {

        int[] vetor = new int[10]; // vetor de testes com apenas 10 de tamanho

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + "  ");
        }

        System.out.println("\nQual valor deseja procurar no vetor? ");
        try (Scanner leitor = new Scanner(System.in)) {
            int buscado = leitor.nextInt();

            int posição = -1;
            boolean existe = false; // mudar para true caso ache o valor no vetor
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] == buscado){
                    existe = true;
                    posição = i;
                    break;
                }
            }
   
            if(existe) {
                System.out.println("Achou");
                System.out.println("Na seguinte posição do vetor: " + posição);
            }
            else{
                System.out.println("Não achou");
            }
        }
    }
}