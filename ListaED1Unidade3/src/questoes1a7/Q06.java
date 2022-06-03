package questoes1a7;

public class Q06 {
    // Implemente o algoritmo de ordenação bubble sort => não tão eficiente para grandes volumes de dados
    // uma variavel fixa na posição 0 e outra variavel andando no vetor  (duas setas)
    // depois que ve o menor a fixa do 0 anda e vai pra posição 1... => outra seta continua percorrendo tudo
    // pra ordernar => maiores no fim e menores no começo 
    // muito passos => toda vez a outra seta percorre tudo
    // i e j no for => como se fosse uma matriz 
    // para cada posição o bubble sort passa pelo vetor inteiro => vetor grande => muito ineficiente

    public static void main(String[] args) {
        
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (int) (Math.random() * 10);
                System.out.print(vetor[i] + " ");
        }

        long inicio = System.currentTimeMillis();
        long fim;

        int auxiliar; // para trocar o valor de i com j 
        // Complexidade O(N^2)
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]){
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }

        // tempo para testar com maior tamanho no vetor 
        fim = System.currentTimeMillis();
        System.out.println("\nTempo percorrido = " + (fim-inicio));

        // imprimindo vetor ordenado 
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
