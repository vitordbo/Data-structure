package questoes31a38;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import questoes25a30.Pessoa;
import questoes25a30.Pessoa.Gender;

public class Q31 {
	// Evolua a questão anterior. Permita que o programa salve o resultado em um arquivo binário. Permita que o programa abra o arquivo binario
	// e exiba o conteudo na tela
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
		
		System.out.println("----------------------------------");
		System.out.println("Parte do arquivo: ");
		System.out.println("----------------------------------");
		
		// começo parte arquivo
		String path = "src/questoes31a38/arquivo_binario.bin"; 	// arquivo sera criado na pasta (temp) ja criada dentro do projeto.
		
		// ESCRITA
		List<Object> listInput  = new ArrayList<Object>(); //Lista de qualquer objeto = arrayList de qualquer objeto 
		
		// OBS: MyClass deve implementar a interface Serializable.
		for(int i =0; i < size; i++) {
			listInput.add(pessoas[i]);  // passando o array de pessoas => objeto de Pessoa => adicionando o array na lista
		}
		
		try {
			escritor(path, listInput);  // metodo para escrever => recebe caminho e oq deve ser escrito 
		} catch (IOException e) {  // revisar metodo de escrever 
			System.out.println("Erro na escrita");
			e.printStackTrace();
		}


		// LEITURA
		try {
			List<Object> listOutput = leitor(path);  // outro List, mas sem ArrayList => recebendo caminho de onde ler 
			
			/*
			for (Object object : listOutput) // todos os objetos da listaOutput que estão no arquivo indicado pelo caminho
			{
				MyClass myObj = (MyClass) object;  // fica só assim? não faz um for para tudo?
				System.out.print( myObj.toString() );
			}
			*/
			for(int i =0; i < size; i++) {
				listOutput.add(pessoas[i]); // adicionando na lista de leitura
				System.out.println(pessoas[i].toString());  // passando o array de pessoas => objeto de Pessoa => adicionando o array na lista
			}	
		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}
		
	}

	public static void escritor(String path, List<Object> lista) throws IOException // escrever => recebe caminho e 
	{																				//texto pra escrever => que vem da lista
		File file = new File(path);	// class File => recebendo o caminho 			// por isso recebe uma lista 
    	file.delete();  // deleta caso já exista
        file.createNewFile(); // cria o novo arquivo

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
        // classe feia recebendo o arquivo
        
        objOutput.writeObject(lista); //vai escrever oq está na lista no arquivo 
        objOutput.close();  
	}

	@SuppressWarnings("unchecked")
	public static List<Object> leitor(String path) throws IOException, ClassNotFoundException 
	{  // leitor vai receber apenas o caminho de onde o arquivo está e retornar uma lista 
		List<Object> lista = new ArrayList<Object>(); // uma nova list com Array List para ser retornada
		
		File file = new File(path); // classe File recebendo o caminho 
	    
		if(file.exists()) 
		{
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file)); //INPUT => recebe e vai tentar acessar pelo caminho
			lista = (ArrayList<Object>) objInput.readObject();  // passa para a lista os objetos que achou 
	        objInput.close();
		}
		
		return lista;  // retorna a lista 
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