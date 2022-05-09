package questoes1a9;

import java.util.Scanner;

import pilha.InterfacePilha;
import pilha.MinhaPilhaVetor;

public class Q08 {

    /*
     * Desenvolva um programa que implemente o algoritmo que leia uma expressao ja
     * na forma pos-fixa e a resolva.
     * Exemplo: Expressão infixa: 304 + 11 - 2 Expressão pós-fixa: 304 11 + 2 -
     * Resultado: 313
     * Algoritmo:
     * 1. Inicialize pilha vazia
     * 2. Varra a expressão:
     * 2.1. Se for operando, empilhe o valor.
     * 2.2. Se for operador, desempilhe dois valores da pilha, efetue a operação com
     * eles e empilhe o resultado.
     * 3. Ao final, exiba o elemento no topo da pilha, que é o resultado da
     * expressão.
     */
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int x;
        do {

            System.out.print("Digite a expressão pós-fixa separando tudo com espacos: ");
            String expressao = in.nextLine();

            // usando charAt para pegar a expressao separada
            String verifica[] = new String[expressao.length()];
            String agrega = "";
            int j = 0;

            for (int i = 0; i < expressao.length(); i++) {
                if (expressao.charAt(i) != ' ') {
                    agrega += (expressao.charAt(i));
                    verifica[j] = agrega;
                } else {
                    agrega = "";
                    j++;
                }
            }

            // definindo tamanho da expressão dividida
            int size = 0;
            while (verifica[size] != null) {
                size++;
            }

            decodificar(verifica, size);

            System.out.println();
            System.out.print("Deseja um novo calculo se SIM digite 1 se NÃO digite 0: ");
            x = in.nextInt();
            in.nextLine();

        } while (x != 0);

    }

    public static void decodificar(String[] expressao, int size) throws Exception {

        InterfacePilha<Double> pilha = new MinhaPilhaVetor<Double>(size);

        double numeroDesempilhado;
        double numeroDesempilhado2;

        for (int i = 0; i < size; i++) {

            String simbolo = expressao[i];

            switch (simbolo) {

                // desempilhado os numeros para fazer a operação
                // dica a pilha sempre LIFO as operaçoes comecao pelo segundo numero
                case "^":
                    numeroDesempilhado = pilha.cosultarTopo();
                    numeroDesempilhado2 = pilha.cosultarTopo();

                    pilha.colocarNoTopo((Math.pow(numeroDesempilhado2, numeroDesempilhado)));
                    break;

                case "/":
                    numeroDesempilhado = pilha.removerDoTopo();
                    numeroDesempilhado2 = pilha.removerDoTopo();

                    pilha.colocarNoTopo((numeroDesempilhado2 / numeroDesempilhado));
                    break;
                case "*":
                    numeroDesempilhado = pilha.removerDoTopo();
                    numeroDesempilhado2 = pilha.removerDoTopo();

                    pilha.colocarNoTopo((numeroDesempilhado2 * numeroDesempilhado));
                    break;
                case "-":
                    numeroDesempilhado = pilha.removerDoTopo();
                    numeroDesempilhado2 = pilha.removerDoTopo();

                    pilha.colocarNoTopo((numeroDesempilhado2 - numeroDesempilhado));
                    break;
                case "+":

                    numeroDesempilhado = pilha.removerDoTopo();
                    numeroDesempilhado2 = pilha.removerDoTopo();

                    pilha.colocarNoTopo((numeroDesempilhado2 + numeroDesempilhado));
                    break;

                default:
                    pilha.colocarNoTopo(Double.valueOf(simbolo));
                    break;
            }
        }

        System.out.println(pilha.cosultarTopo());

    }

}