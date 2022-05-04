package questoes31a38;

import java.util.Scanner;

public class Q36 {
	//Calcule o somatorio dos numeros inteiros do intervalo entre dois n�meros. No mesmo programa ,implemente esse calculo em duas fun��es:
	// a) resolva o problema com estrutura de repeti��o
	// b) resolva o problema usando recursividade
	// c) analise os pontos positivos e negativos de cada vers�o

	private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args) {

		System.out.println("Digite o primeiro numero do som�torio: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero do som�torio: ");
		int numero2 = scanner.nextInt();
		
		// a)
		int soma = 0;
		for(int i = numero1; i <= numero2; i++) { // quando n2 for maior igual que i => i = 5 , 6 , 7 , 8.. => soma i ate igualar a n2 
			 soma += i; 	
		 //System.out.println("Soma = " + soma);
		}
		System.out.println("Soma = " + soma);  // soma final


		//b)
		System.out.println("A soma usando recusrsividade = " + somaIntervalo(numero1, numero2));

		//c)
		/*
		 * usando la�os de repeti��o pode se tornar mais direto, mais facil de visualizar para alguns
		 * usando recursivade resquer alguns cuidados a mais para evitar o loop infinito, al�m de usar a ED pilha para solucionar o problema
		 * no debug, � bem mais claro acompanhar o processo de pilha, o que pode faciliar a visualiza��o de todo o processo do somatorio
		 * j� no debug com la�os de repeti��o n�o � t�o facil acompanhar o processo como um todo
		 * Com rela��o a perfomance, duas s�o identicas pois o porblema � pequeno, mas possivelmente em um problema maior o custo de 
		 * memoria usando recursividade vai ser maior, pois empilha e desempilha para resolver o problema 
		 */

	}

	private static int somaIntervalo(int num1, int num2) {
		int soma = num1;   // receve valor de n1 => no caso 4
		if (num1 > num2) { // vamos incrementar n1 => quando n1 for maior que n2 vai sair da recursividade =>
			return 0;      // quando for maior para fazer a soma correta
		}
		else {
		soma +=  somaIntervalo(num1 + 1,num2);
		// soma vai receber a propria fun��o mais o n+1 => ex: tendo n1 =4 e n2= 9
		//4 + 1
		//5 + 1
		//6 + 1
		//7 + 1
		//8 + 1
		//9 + 1 // qundo chegar em 10 vai sair => pois n1= 10 > vai ser maior que n2 = 9
	}

		return soma;
	}
}

