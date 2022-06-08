package questoes1a7;

public class Q07 {
    // Implemente o algoritmo de ordenação insert sort.
    // um pouco mais rapido que o bubble sort  
    // tbm é um de complexidade quadratica

    // cartas de baralho na mão 
    // a partir de um novo valor inserido => compara do final ao começo 
    // e coloca na posição exata que deve ficar 

    public static void main(String[] args) {

        int[] vetor = new int[10];
        
        //preenche o vetor com números aleatórios
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        System.out.println("Desordenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        // um pouco mais complexo aqui que o bubble sort
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
                
        System.out.println("\n\nOrdenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    
    }
}
