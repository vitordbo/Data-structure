package questoes25a30;

import java.util.Scanner;

import questoes25a30.Pessoa.Gender;

public class Q30 {
	// construa um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome, idade sexo, peso, altura, imc
	// Permita que o usuario defina a quantidade de pessoas em tempo de execução. Ao cadastrar uma pessoa ,calcule o imc(Indice de Massa Corporal)
	// Ao final, exiba a lista de pessoas (com seus respectivos atributos). Utilize enum. Crie uma função para identificar se o CPF é valido
	
	private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Digite quantas pessoas vão ser cadastradas: ");
		int size = scanner.nextInt();
		//EnumSexo sexoEnum = pessoas[i].setSexo();
		
		Pessoa[] pessoas =  new Pessoa[size];  // array de objetos => se tiver mais de uma pessoa
		// CLASSEname[] nomeObjArray = new CLASSEname[tamanho]
		
		//cpf, nome, idade, sexo, peso, altura, imc
		for (int i = 0; i < size; i++) {
			pessoas[i] = new Pessoa();   // tem que instanciar = >array de objetos[] = new classe();
			
			System.out.println("Digite o cpf da pessoa " + i);
			String cpf = scanner.next();
			String cpfAceito = validarCpf(cpf);  // guarda o cpf com 11 digitos que retorna da função (cpf que foi aceito)
			pessoas[i].setCpf(cpfAceito);
			
			System.out.println("Digite o nome da pessoa " + i);
			scanner.nextLine(); // limpar buffer
			String nome = scanner.nextLine();
			pessoas[i].setNome(nome);
			
			System.out.println("Digite a idade da pessoa " + i);
			int idade = scanner.nextInt();
			pessoas[i].setIdade(idade);
			

			System.out.println("Digite o sexo da pessoa " + i + " selecione 0 para masculino e 1 para feminino");
			int sexo = scanner.nextInt();
			if(sexo == 0) {
				pessoas[i].setSexo(Gender.Masculino);
			}
			else {
				pessoas[i].setSexo(Gender.Feminino);
			}
			
			System.out.println("Digite o peso da pessoa " + i);
			int peso = scanner.nextInt();
			pessoas[i].setPeso(peso);
			
			System.out.println("Digite a altura da pessoa " + i);
			float altura = scanner.nextFloat();
			pessoas[i].setAltura(altura);
			
			System.out.println("O imc da pessoa " + i + " é ");
			double imc = (peso / (Math.pow(altura,2))) * 10000;
			System.out.println((float)imc);
			pessoas[i].setImc(imc);
						
		}
		
		for (int i = 0; i < size; i++) {  // mostrando pessoas usando o toString
			System.out.println("Pessoa " + i + ": " + pessoas[i].toString());
		}
		
	
}
	private static String validarCpf(String cpf) {
		do {
			if(cpf.length() > 11 || cpf.length() < 11){ // se o cpf tiver mais de 11 ou menos que 11 digitos => normal tem 11=> não valida
					System.out.println("Cpf invalido, digite novamente ");
					cpf = scanner.next();
			} 
			else 
				System.out.println("Cpf aprovado!!");
			}
		while(cpf.length() != 11); // cpf tem 11 => enquanto for diferente de 11 faz o while
		
		return cpf;  // retornar o cpf que foi aceito
		
	}
}
