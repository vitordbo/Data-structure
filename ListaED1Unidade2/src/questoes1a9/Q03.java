package questoes1a9;

import listas.InterfaceListas;
import listas.MinhaListaSimples;

public class Q03 {
    // Desenvolva um programa e implemente as funcao basicas de manipulacao de uma
    // lista simplesmente encadeada.
    // Desenvolva sua propria classe ListaSimples. Utilize Generic.

    public static void main(String[] args) {

        InterfaceListas<Integer> lista = new MinhaListaSimples<Integer>();

        // adicionando
        lista.addFirst(50);
        lista.addFirst(45);
        lista.addLast(90);

        lista.addAfter(40, 45); // adicionar 40 depois de 45

        System.out.println("----------------------------------------------");

        lista.show();

        System.out.println("----------------------------------------------");

        System.out.println("pegando primeiro: " + lista.peekFirst());
        System.out.println("pegando ultimo: " + lista.peekLast());

        System.out.println("----------------------------------------------");

        // removendo
        System.out.println("Removendo especifico: ");
        lista.remove(50);
        lista.show();

        System.out.println("----------------------------------------------");

        System.out.println("Removendo primeiro: ");
        lista.removeFirst();
        lista.show();

        System.out.println("----------------------------------------------");

        System.out.println("Removendo ultimo: ");
        lista.removeLast();
        lista.show();

        System.out.println("----------------------------------------------");

        System.out.println("pegando primeiro: " + lista.peekFirst());
        System.out.println("pegando ultimo: " + lista.peekLast());

        System.out.println("procurando: " + lista.search(40));

    }

}
