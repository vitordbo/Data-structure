package questoes8a13;

public class Q08 {
    
    // Implemente o algoritmo de ordenação select sort.

    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        System.out.println("Desordenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        //Selection sort O(N^2)
        int posicao_menor, aux;
        for(int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];  // guarda a posição e faz apenas uma troca no final => n trocas
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            // bubble sort faz n^2 trocas => por isso esse é melhor que o bubble sort
        }
        
        System.out.println("\n\nOrdenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
    }
}
