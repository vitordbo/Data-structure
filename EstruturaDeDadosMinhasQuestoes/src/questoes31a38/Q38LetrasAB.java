package questoes31a38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import questoes1a6.MyClass;

public class Q38LetrasAB {
	// Utilizando a Collection de Java, faça exemplo de usos das classes abaixo e explicite suas diferenças:
	// a) List: ArrayList, Vector, LinkedList
	// b) Set: HashSet, LinkedHashS, TreeSet
	// c) Queue: PriorityQueue, LinkedList
	// d) Deque: LinkedList
	// e) Map: HashMap, LinkedHashMap, TreeMap

	// Collcection = classe com várias estruturas de dados prontas
	public static void main(String[] args) {
		
		/*
		 * List: Estruturas lineares = Ficam espalhadas na memorias => uma aponta para outra
		 * Listas x Array 
		 * Listas => mais lento de acessar, mais simples de usar e deletar, permite repetir valores
		 * arryas => tempo menor de acesso e tbm permite repetir valores (SET => item b => não permite repetir)
		 */
		
		/* a) List: ArrayList, Vector, LinkedList
		 * ArrayList => implementa List 
		 * facil de usar e manipular => uma das mais usadas 
		 * itens são armazenados de forma adjacente => aumenta indexação
		 * uma arrayList muito grande fica ineficiente 
		 * preserva ordem das adições => facilita manipulação => 
		 * mais lento que array => novas intancias são criadas => quando requer mais espaço aumenta em 50% => size + 50%
		 */
		
		 System.out.println("ArrayList");
	        // definir a capacidade é opcional, mas aumenta a eficiencia. 
	        List<String> PrimeiraArrayList = new ArrayList<String>(10);
	        PrimeiraArrayList.add(0, "zero"); 		// index 0
	        PrimeiraArrayList.add(1, "um"); 		// index 1
	        PrimeiraArrayList.add("dois"); 			// no final
	        PrimeiraArrayList.add("tres"); 			// no final
	        System.out.println("size = " + PrimeiraArrayList.size()); //tamanho
	        System.out.println(PrimeiraArrayList); 
	        
	        String str = PrimeiraArrayList.remove(1); 	// remove o "um" e guarda em str 
	        boolean bool = PrimeiraArrayList.remove("tres");   // se revomer vira true 
	        System.out.println("remove(1): " + str); 	// dois
	        System.out.println("remove: " + bool); 	// true
	        System.out.println(PrimeiraArrayList); 
	        
	        
	        System.out.println("get(0): " + PrimeiraArrayList.get(0) ); // zero 
	  
	        System.out.println("----------------------------");
	        PrimeiraArrayList.set(0, "teste"); 				// Substitui no indice informado => perde o 0 e coloca "teste"
	        PrimeiraArrayList.add("teste");					// ArrayList permite duplicatas
	        System.out.println(PrimeiraArrayList); 			// ficar com dois "teste"
	        
	        System.out.println("----------------------------");
	        
	        int index = PrimeiraArrayList.indexOf("teste");	// Obtem indice do conteudo informado (primeira ocorrencia)
	        System.out.println(index);
	        PrimeiraArrayList.set(index, "novissimo"); 
	        System.out.println(PrimeiraArrayList); 
	        
	        System.out.println("----------------------------");
	        List<String> list2 = new ArrayList<String>(); 
	        
	        list2.add("ZERO"); 
	        list2.add("UM"); 
	        list2.add("DOIS"); 
	        
	        PrimeiraArrayList.addAll(2, list2); 	// Adiciona list2 no index 2
	        System.out.println(PrimeiraArrayList); 
	        System.out.println();
	       
	        // Ordena a lista. Se primitivo considera a natureza do tipo.
	        // Se objeto deve-se sobrescrever o metodo compareTo.
	        Collections.sort(PrimeiraArrayList);	
	        
	        for(String string : PrimeiraArrayList) {
				System.out.println(string);
			}
	        System.out.println("----------------------------");
	        
	        
	        /**
			 * Vector: implementa List
			 * Muito parecida com ArrayList.
			 * Diferencas: thread-safe; capacidade eh size+100%
			 */
	        System.out.println("Vector");
	        List<String> vector = new Vector<String>(); 
	        vector.add("zero"); 		
	        vector.add("um"); 		
	        vector.add("dois");
	        System.out.println(vector); 
	        System.out.println();
	        System.out.println("----------------------------");
	        
	        
			/**
			 * LinckedList: implementa List 
			 * Elementos Nao sao armazenados de forma adjacente na memoria. 
			 * Internamente eh uma lista duplamente encadeada.
			 * Melhor eficiencia em: add, remove (elementos no meio, se comparado com ArrayList)
			 * Pior eficiencia em: acessar um elemento, pois nao eh indexado => tem que sair pulando de elemento em elemento para acahr
			 */
	        System.out.println("LinkedList");
	        List<String> linkedList = new LinkedList<String>();
	        linkedList.add("zero"); 			
	        linkedList.add("um");
	        linkedList.add("dois");		// adicionados ao final	
	        System.out.println(linkedList); 
	        System.out.println();
	        System.out.println("----------------------------");
	        
	        
	     // b) Set: HashSet, LinkedHashS, TreeSet
	        /**
	         * Set => interface que servem de base para estruturas que aceitam apenas valores chaves (unicos) 
			 * HashSet =>
			 * Internamente utiliza tabela de dispersao (hash table).
			 * Por isso, destaca-se pela eficiencia: Complexidade O(1) para operacoes de add e delete.
			 * Seus elementos nao sao ordenados.
			 * 
			 * Muito eficiente => não controla nada da ordem => HashSet
			 * Eficiente => perde eficiencia quando ordena => treeSet
			 * Eficiente (não tanto quanto HashSet) => ordem que ordena é a que fica => LinkedHashSet
			 * 
			 *  => TRES NÃO PERMITEM CHAVE REPETIDA
			 * 	
				@Override  // meotodo que seleciona a chave 
				public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + inteiro;
				return result;
			}
			 */
			System.out.println("HashSet");
			Set<MyClass> hashSet = new HashSet<MyClass>();
			hashSet.add( new MyClass(0, "zero") );
			hashSet.add( new MyClass(1, "um") );        // metodo definindo o atributo chave na classe MyClass
			hashSet.add( new MyClass(1, "ummmmmmm") );	// Nao sera adicionado pois a chave eh o atributo "inteiro" definido em hashCode() em MyClass. 
			hashSet.add( new MyClass(2, "dois") );
			hashSet.add( new MyClass(3, "tres") );
			hashSet.add( new MyClass(4, "quatro") );
			hashSet.add( new MyClass(5, "quatro") );	// Sera adicionado, pois quem eh a chave eh o atributo "inteiro".
			
			System.out.println( hashSet );
			System.out.println( hashSet.size() );
			
			System.out.println( hashSet.remove( new MyClass(1, "qqcoisa") ) );
			System.out.println( hashSet );
			System.out.println( hashSet.size() );
			System.out.println();
			System.out.println("----------------------------");
		
			
			/**
			 * LinkedHashSet
			 * Tentaiva de pegar o melhor dos dois mundos => hash e list
			 * Tem como diferencial ter boa eficiencia e manter a ordem de insercao, semelhante ao List.
			 */
			System.out.println("LinkedHashSet");
			Set<MyClass> linkedHashSet = new LinkedHashSet<MyClass>();		
			linkedHashSet.add( new MyClass(5, "quatro") );		
			linkedHashSet.add( new MyClass(4, "quatro") );	// Sera adicionado, pois quem eh a chave eh o atributo "inteiro".
			linkedHashSet.add( new MyClass(3, "tres") );
			linkedHashSet.add( new MyClass(2, "dois") );
			linkedHashSet.add( new MyClass(1, "um") );	
			linkedHashSet.add( new MyClass(1, "ummmmm") );	// Nao sera adicionado, pois ha repeticao da chave "inteiro"
			linkedHashSet.add( new MyClass(0, "zero") );
			
			System.out.println( linkedHashSet );				// Preserva a ordem da adição
			System.out.println( linkedHashSet.size() );
			
			System.out.println( linkedHashSet.remove( new MyClass(1, "um") ) );
			System.out.println( linkedHashSet );
			System.out.println( linkedHashSet.size() );
			System.out.println();
			System.out.println("----------------------------");
			
			
			/**
			 * TreeSet
			 * Internamente utiliza uma estrutura de arvore.
			 * Internamente utiliza a interface SortedSet, que ordena automaticamente os elementos, por isso, tem menor eficiencia com complexidade O(log n).
			 *
			 *
			@Override
			public int compareTo(MyClass second) {
			return Integer.compare(this.inteiro, second.inteiro);
			}	
			 */
			System.out.println("TreeSet");
			Set<MyClass> treeSet = new TreeSet<MyClass>();		// ATENCAO: Eh preciso sobrescrever o metodo compareTo em MyClass.
			treeSet.add( new MyClass(2, "dois") );
			treeSet.add( new MyClass(0, "zero") );
			treeSet.add( new MyClass(1, "um") );
			treeSet.add( new MyClass(1, "ummmmmm") );	
			treeSet.add( new MyClass(3, "tres") );
			treeSet.add( new MyClass(4, "quatro") );
			treeSet.add( new MyClass(5, "quatro") );
			
			System.out.println( treeSet );
			System.out.println( treeSet.size() );
			
			System.out.println( treeSet.remove( new MyClass(1, "qqcoisa!!!") ) );
			System.out.println( treeSet );
			System.out.println( treeSet.size() );
			System.out.println();
			System.out.println("----------------------------");
			
	}
}
