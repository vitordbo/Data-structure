package questoes1a9;

import fila.InterfaceFila;
import fila.MinhaFilaVetor;

public class Q02 {
    // Desenvolva um programa que faça uso das funcoes basicas de manipulacao de uma
    // fila circular.
    // Desenvolva sua propria classe Fila. Utilize Generic.
    // Implemente a fila em Vetor
    public static void main(String[] args) throws Exception {
        int retorno;

        InterfaceFila<Integer> fila = new MinhaFilaVetor<Integer>(3);

        fila.add(5);
        fila.add(3);
        fila.add(1);

        retorno = fila.consultaInicio();
        System.out.println("Inicio da fila: " + retorno);

        System.out.println("-------------------------------------------------------");

        fila.show();

        System.out.println("-------------------------------------------------------");

        retorno = fila.remove();
        System.out.println("removido = " + retorno);

        retorno = fila.remove();
        System.out.println("removido = " + retorno);

        retorno = fila.remove();
        System.out.println("removido = " + retorno);

        System.out.println("-------------------------------------------------------");

        fila.show();

        System.out.println("empty? " + fila.isEmpty());
        System.out.println("full? " + fila.isFull());

    }

}
