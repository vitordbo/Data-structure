package questoes1a9;

import pilha.InterfacePilha;
import pilha.MinhaPilhaVetor;

public class Q01 {
	// Desenvolva um programa que faca uso das funcoes basicas de manipulacao de uma
	// pilha.
	// Desenvolva sua propria classe Pilha. Utilize Generic.
	// Implemente a pilha em Vetor.

	public static void main(String args[]) throws Exception {

		InterfacePilha<Integer> pilha = new MinhaPilhaVetor<Integer>(3);
		// usa inteface e a classe com implementacoes => de <Integer> e tamanho do vetor
		// = 3

		int retorno;

		pilha.colocarNoTopo(5);
		pilha.colocarNoTopo(3);
		pilha.colocarNoTopo(1);

		System.out.println("----------------------------------------------");
		retorno = pilha.cosultarTopo();
		System.out.println("elemento no topo = " + retorno);

		pilha.show();
		System.out.println("----------------------------------------------");

		retorno = pilha.removerDoTopo();
		System.out.println("Tirando " + retorno);

		retorno = pilha.removerDoTopo();
		System.out.println("Tirando " + retorno);

		retorno = pilha.removerDoTopo();
		System.out.println("Tirando " + retorno);
		System.out.println("----------------------------------------------");

		pilha.show();

		System.out.println("full? " + pilha.isFull());

		System.out.println("empty? " + pilha.isEmpty());

	}

}
