package questoes1a7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {
    //Implemente o algoritmo de busca linear. Utilize uma estrutura dinâmica.
    //passar por todos do vetor até achar o valor
    
    public static void main(String[] args) {
        List<Integer> listaValores = new ArrayList<>(15); // começa com 15 
        
        for(int i = 0; i < 15; i++){
            listaValores.add((int) (Math.random() * 100));
            System.out.print(listaValores.get(i).toString() + "  ");
        }

        System.out.println("\nQual valor deseja procurar na lista? ");
        Scanner leitor = new Scanner(System.in); 
        Integer buscado = leitor.nextInt();

            int posição = -1;
            boolean existe = false; // mudar para true caso ache o valor no vetor
            for (int i = 0; i < listaValores.size(); i++) {
                if(listaValores.get(i) == buscado){
                    existe = true;
                    posição = i;
                    break;
                }
            }
   
            if(existe) {
                System.out.println("Achou");
                System.out.println("Na seguinte posição da lista: " + posição);
            }
            else{
                System.out.println("Não achou");
            }
        } 
}
