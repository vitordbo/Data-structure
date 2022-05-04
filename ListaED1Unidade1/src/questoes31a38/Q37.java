package questoes31a38;

import questoes25a30.Pessoa;
import questoes25a30.Pessoa.Gender;

public class Q37 {
	//Utilizando o recurso Generic de Java, faça um metodo para exibir um objeto (usando seu metodo toString), e outro metodo
	// para exibir os elementos de um vetor 
	
	public static void main(String[] args) {
	
		/*
 		public Pessoa(String cpf, String nome, int idade, Gender sexo, int peso, float altura, double imc) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		}
		 */
		Pessoa pessoas = new Pessoa("7894561232","Vitor", 20, Gender.Masculino, 72, 1.84f, 25.1);
		System.out.println("Exibindo usando generics: ");
		exibirObjeto(pessoas);
		
		
		System.out.println("-----------------");
		System.out.println("Exibindo arrays usando generics: ");
		Integer[] array = {0,1,2,3,4,5,6,7,8};
		exibirArray(array);
		
		System.out.println("-----------------");
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		exibirArray(characterArray);
	}
	
	private static <T> void exibirObjeto(T MyObject) {
	 System.out.println(MyObject + " "); // metodo usando generics => vai usar o toString de qualquer objeto que vier
	}
	
	private static <E> void exibirArray(E[] array) { // metodo usando generics => vai usar exibir de qualquer tipo que vier
		for(E arr: array) { 
			System.out.println(arr + " ");
			
		}
		
	}
	
}
