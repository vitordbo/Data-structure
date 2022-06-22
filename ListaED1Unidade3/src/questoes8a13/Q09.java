package questoes8a13;

public class Q09 {
    //Implemente o algoritmo de ordenação shell sort.
    // metodo meio estranho, mas rapido 

    // a partir do tamanho do vetor vai definir um fator h 
    // saltos atraves desse h faz o algoritmo ser mais rapido
    // como se o vetor estivesse sendo ordenado por partes 
    // depois (ultima iteração) passa um em um pra ver se esta ordenado
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        System.out.println("Vetor desordenado");
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }
        
        int h = 1;
        int n = vetor.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);
        
        int elemento, j;
        while(h > 0){
            for(int i = h; i < n; i++){
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }
            h = h / 2;
        }
        
        System.out.println("Vetor ordenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }    
}
