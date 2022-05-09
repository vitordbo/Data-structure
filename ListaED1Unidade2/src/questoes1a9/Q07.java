package questoes1a9;

import java.io.IOException;

import listas.MinhaListaSimples;

public class Q07 {
    // Implemente a Fila da questao 2 em uma estrutura de Lista Encadeada.

    public static void main(String[] args) throws IOException {

        MinhaListaSimples<Integer> teste = new MinhaListaSimples<Integer>();

        teste.addFirst(50);
        teste.addLast(45);
        teste.addLast(40);

        System.out.println("----------------------------------------------");

        teste.show();

        System.out.println("----------------------------------------------");

        teste.removeFirst();
        teste.show();

        System.out.println("----------------------------------------------");

        teste.removeFirst();
        teste.show();

        System.out.println("----------------------------------------------");

        teste.removeFirst();
        teste.show();

    }
}