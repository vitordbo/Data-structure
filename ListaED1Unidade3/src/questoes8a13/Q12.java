package questoes8a13;

public class Q12 {
   // Construa funções para todos os algoritmos de ordenação da unidade 3 e coloque todos em um único
   //programa. Execute todas as funções com a mesma entrada, e compare o tempo de execução em
   //milissegundos de cada função implementada.

   public static void main(String[] args) {

      System.out.println("\nTempo de execução em milissegundos");
      System.out.println("\n----------------------------------");
      int[] vetor = new int[300]; // vetor grande para ver diferença no tempo
      System.out.println("Vetor inical aleatorio: ");

      for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + " ");
      }

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando bubble sort: ");
      bubbleSort(vetor);
      System.out.println("\n----------------------------------");

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando insert sort: ");
      insertSort(vetor);
      System.out.println("\n----------------------------------");

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando select sort: ");
      selectSort(vetor);
      System.out.println("\n----------------------------------");

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando shell sort: ");
      shellSort(vetor);
      System.out.println("\n----------------------------------");

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando quick sort: ");
      quickSortFinal(vetor);
      System.out.println("\n----------------------------------");

      System.out.println("\n----------------------------------");
      System.out.println("\nUsando heap sort: ");
      heapSort(vetor);
      System.out.println("\n----------------------------------");
   }


   private static void bubbleSort(int vetor[]){
  
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
      System.out.println("\nOrdenado com bubble sort = ");
      for (int i = 0; i < vetor.length; i++) {
         System.out.print(vetor[i] + " ");
      }
   }

   private static void insertSort(int vetor[]){
      long inicio = System.currentTimeMillis();
      long fim;

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

      // tempo para testar com maior tamanho no vetor 
      fim = System.currentTimeMillis();
      System.out.println("\nTempo percorrido = " + (fim-inicio));

      System.out.println("\nOrdenado com insert sort = ");
     for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
     }

   }

   private static void selectSort(int vetor[]){

      long inicio = System.currentTimeMillis();
      long fim;

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

      // tempo para testar com maior tamanho no vetor 
      fim = System.currentTimeMillis();
      System.out.println("\nTempo percorrido = " + (fim-inicio));

      System.out.println("\nOrdenado com Select sort = ");
       for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
     }
   }

   private static void shellSort(int vetor[]){
      long inicio = System.currentTimeMillis();
      long fim;

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
      
      // tempo para testar com maior tamanho no vetor 
      fim = System.currentTimeMillis();
      System.out.println("\nTempo percorrido = " + (fim-inicio));

      System.out.println("\nOrdenado com shell sort = ");
      for (int i = 0; i < vetor.length; i++) {
         System.out.print(vetor[i] + " ");
      }
   }

   // quick sort
   private static void quickSortFinal(int vetor[]){
  
      long inicio = System.currentTimeMillis();
      long fim;

      quicksort(vetor, 0, vetor.length - 1);

      // tempo para testar com maior tamanho no vetor 
      fim = System.currentTimeMillis();
      System.out.println("\nTempo percorrido = " + (fim-inicio));
        
      System.out.println("\nOrdenado com quick sort = ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
      }
    }
    
    // parte do quick sort
    static void quicksort(int[] vetor, int esquerda, int direita){  // usa recursividade aq
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);  
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
    
      // parte do quick sort
    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
   }

  
   private static void heapSort(int vetor[]){
   //Heap Sort
   int n = vetor.length;

   long inicio = System.currentTimeMillis();
   long fim;
   
   for(int i = n / 2 - 1; i >= 0; i--){
       aplicarHeap(vetor, n, i);
   }
   
   System.out.println("\n\nQuase ordenado");
   for(int i = 0; i < vetor.length; i++){
       System.out.print(vetor[i] + " ");
   }
   
   for(int j = n-1; j > 0; j--){
       int aux = vetor[0];
       vetor[0] = vetor[j];
       vetor[j] = aux;
       
       aplicarHeap(vetor, j, 0);
   }

   // tempo para testar com maior tamanho no vetor 
   fim = System.currentTimeMillis();
   System.out.println("\nTempo percorrido = " + (fim-inicio));


   System.out.println("\n\nOrdenado com heap sort = ");
   for(int i = 0; i < vetor.length; i++){
       System.out.print(vetor[i] + " ");
   }
}   

// para usar com heap
private static void aplicarHeap(int[] vetor, int n, int i){
   int raiz = i;
   int esquerda = 2*i + 1;
   int direita = 2*i + 2;
   
   if (esquerda < n && vetor[esquerda] > vetor[raiz]){
       raiz = esquerda;
   }
   if (direita < n && vetor[direita] > vetor[raiz]){
       raiz = direita;
   }
   
   if (raiz != i){
       int aux = vetor[i];
       vetor[i] = vetor[raiz];
       vetor[raiz] = aux;
       
       aplicarHeap(vetor, n, raiz);
   }

   }
}