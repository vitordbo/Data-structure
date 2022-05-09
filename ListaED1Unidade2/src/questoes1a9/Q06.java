package questoes1a9;

import java.io.IOException;

import listas.MinhaListaSimples;

public class Q06 {
    // Implemente a Pilha da questão 1 em uma estrutura de Lista Encadeada.

    public static void main(String[] args) throws IOException {

        MinhaListaSimples<Integer> teste = new MinhaListaSimples<Integer>();

        teste.addFirst(50);
        teste.addFirst(45);
        teste.addFirst(40);

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