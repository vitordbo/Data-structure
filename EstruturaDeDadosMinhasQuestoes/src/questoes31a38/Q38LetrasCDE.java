package questoes31a38;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import questoes1a6.MyClass;

public class Q38LetrasCDE {

	// Utilizando a Collection de Java, faça exemplo de usos das classes abaixo e explicite suas diferenças:
		// a) List: ArrayList, Vector, LinkedList
		// b) Set: HashSet, LinkedHashS, TreeSet
		// c) Queue: PriorityQueue, LinkedList
		// d) Deque: LinkedList
		// e) Map: HashMap, LinkedHashMap, TreeMap

		// Collcection = classe com várias estruturas de dados prontas
		public static void main(String[] args) {
			
			// c) Queue: PriorityQueue, LinkedList
				/**
				 * Queue => IGUAL A FILA DE BANCO => CHEGOU VAI PARA O FINAL
				 * Interface que embasa estruturas de fila. 
				 * Permite elementos com repeticao de chaves.
				 * Facilita a insersao de elementos no fim e a remocao/acesso de elementos no inicio da fila.
				 * elemento adicionado vai pro fim 
				 * adicionado no fim e removido no inicio => igual a fila de banco 
				 */
				
				/**
				 * PriorityQueue
				 * Nao aceita elementos null.
				 * Como nao foi definida prioridades (em compareTo), a estrutra usa a ordem padrao, diferente de LinkedList que mantem a ordem de insersao.
				 */
				System.out.println("PriorityQueue");
		        Queue<String> priorityQueue = new PriorityQueue<String>(); 
				
		        priorityQueue.add("e"); 		// insere no fim
		        priorityQueue.add("a"); 		// insere no fim
		        priorityQueue.add("b"); 		// insere no fim
		        priorityQueue.add("e"); 		// insere no fim // permite repeticao
		        priorityQueue.add("d"); 		// insere no fim 
		        priorityQueue.add("c"); 		// insere no fim 
		                
		        /*
		        OBS: a exibição (ou iteração) dos elementos não condiz com a ordem com que serão removidos.
				Portanto, apesar de estarem desordenados internamente, no momento da remoção, SIM, vai ser respeitada a ordenação natural.
		        */
				System.out.println(priorityQueue); 
				System.out.println("size: " + priorityQueue.size()); 
				
				// não mantem a ordem de inserção => prestar atenção no remove pq a ordem de adicionar não fica clara 
				String str = priorityQueue.peek(); 		// apenas consulta inicio
				System.out.println("peek (inicio): " + str); 		
				System.out.println(priorityQueue);			// nao altera nada
				
				str = priorityQueue.remove();
				System.out.println("remove: " + str); 	//a
				
				str = priorityQueue.remove();
				System.out.println("remove: " + str);	//b
				
				str = priorityQueue.remove();
				System.out.println("remove: " + str);	//c
				
				str = priorityQueue.remove();
				System.out.println("remove: " + str);	//d
				
				System.out.println(priorityQueue); 
				System.out.println("size: " + priorityQueue.size()); 
				System.out.println("----------------------------");
				
				
				/**
				 * LinkedList
				 * Internamente utiliza uma lista duplamente encadeada.
				 * Conserva a ordem de insercao. // bem melhor pois conserva a ordem => memso assim prestar atenção no remove 
				 * OBS: aceita elementos null.
				 */
				System.out.println("LinkedList");
		        Queue<String> linkedListQueue = new LinkedList<String>();
				
		        linkedListQueue.add("zzz"); 		// insere no fim
		        linkedListQueue.add("aaa"); 		// insere no fim
		        linkedListQueue.add("ttt"); 		// insere no fim
		        linkedListQueue.add("ttt"); 		// insere no fim	permite repeticao
		        linkedListQueue.add("bbb"); 		// insere no fim
		        linkedListQueue.add(null); 		// insere no fim
		        linkedListQueue.add("ccc"); 		// insere no fim
		        
				System.out.println(linkedListQueue); 
				System.out.println("size: " + linkedListQueue.size()); 
				
				String teste = linkedListQueue.peek(); 			// apenas consulta inicio
				System.out.println("inicio: " + teste); 		// zzz
				
				str = linkedListQueue.remove(); 					// remove do inicio
				System.out.println("removed: " + teste); 		// zzz
				
				System.out.println(linkedListQueue); 
				System.out.println("size: " + linkedListQueue.size()); 
				System.out.println();	
				System.out.println("----------------------------");
				
				// d) Deque: LinkedList
				/**
				 * LinkedList
				 * Internamente utiliza uma lista duplamente encadeada.
				 * Conserva a ordem de insercao. => já vai pro final 
				 * Adiciona liberdade de manipula o inicio e fim da estrutura 
				 * Manipula os dois extremos => muita liberdade para as extremidades
				 */
				System.out.println("LinkedList Deque");
		        Deque<String> linkedList = new LinkedList<String>(); 
				
		        linkedList.add("fim1"); 			// insere no fim
		        linkedList.addLast("fim2"); 		// insere no fim
		        
		        linkedList.addFirst("inicio1"); 	// insere no inicio
		        linkedList.addFirst("inicio2"); 	// insere no inicio
		        linkedList.addFirst("inicio3"); 	// insere no inicio
		        
				System.out.println(linkedList); 
				System.out.println("size: " + linkedList.size()); 
				
				String dequeTest = linkedList.peek(); 			// apenas consulta inicio
				System.out.println("inicio: " + dequeTest); 		
				
				dequeTest = linkedList.peekFirst(); 				// apenas consulta inicio
				System.out.println("inicio: " + dequeTest); 		
				
				dequeTest = linkedList.peekLast(); 				// apenas consulta fim
				System.out.println("final:  " + dequeTest); 		
				System.out.println();	
				
				System.out.println(linkedList); 
				System.out.println("size: " + linkedList.size()); 
				System.out.println();
				
				dequeTest = linkedList.remove(); 							// remove do inicio
				System.out.println("removed inicio: " + dequeTest); 		
				
				dequeTest = linkedList.removeFirst(); 					// remove do inicio
				System.out.println("removed inicio: " + dequeTest); 	
				
				dequeTest = linkedList.removeLast(); 						// remove do fim
				System.out.println("removed final:  " + dequeTest); 	
				
				System.out.println();	
				System.out.println(linkedList); 
				System.out.println("size: " + linkedList.size()); 
				System.out.println();	
				System.out.println("----------------------------");

				
				// e) Map: HashMap, LinkedHashMap, TreeMap
				/**
				 * HashMap
				 * Tem boa eficiencia, com complexidade O(1).
				 * Permite apenas uma chave null.
				 * Não ordenada. OBS: A ordenação é baseada apenas na ordem natural da chave.
				 */
				System.out.println("HashMap");
				Map<String, MyClass> hashMap = new HashMap<String, MyClass>();
				hashMap.put("a", new MyClass(0, "zero") );
				hashMap.put("b", new MyClass(1, "um") );
				hashMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
				hashMap.put("d", new MyClass(3, "tres") );			// não pode repetir =>subistitui
				hashMap.put("c", new MyClass(2, "dois") );
				hashMap.put(null, new MyClass(4, "quatro") );
				
				System.out.println( hashMap );
				System.out.println( hashMap.size() );
				
				System.out.println( hashMap.remove( "b" ) );
				System.out.println( hashMap.size() );
				
				System.out.println( hashMap.keySet() );

				for(String key: hashMap.keySet() ) { 
		            System.out.print( hashMap.get(key) + " ");  
		        }
				System.out.println("\n\n");
				System.out.println("----------------------------");
				
				/**
				 * LinkedHashMap
				 * Tem boa eficiencia, com complexidade O(1).
				 * Permite apenas uma chave null.
				 * Mantem a ordem de inserção.
				 */
				System.out.println("LinkedHashMap");
				Map<String, MyClass> linkedHashMap = new LinkedHashMap<String, MyClass>();
				linkedHashMap.put("a", new MyClass(0, "zero") );
				linkedHashMap.put("b", new MyClass(1, "um") );
				linkedHashMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
				linkedHashMap.put("d", new MyClass(3, "tres") );            // não pode repetir =>subistitui
				linkedHashMap.put("c", new MyClass(2, "dois") );
				linkedHashMap.put(null, new MyClass(4, "quatro") );
				
				System.out.println( linkedHashMap );
				System.out.println( linkedHashMap.size() );
				
				System.out.println( linkedHashMap.remove( "b" ) );
				System.out.println( linkedHashMap.size() );
				
				System.out.println( linkedHashMap.keySet() );// retorna as chaves

				for(String key: linkedHashMap.keySet() ) {   // pegas as chvaves retornadas e escreve
		            System.out.print( linkedHashMap.get(key) + " ");  
		        }
				System.out.println("\n\n");
				System.out.println("----------------------------");
				
				
				/**
				 * TreeMap
				 * Tem eficiencia média, com complexidade O(log n).
				 * Não permite nenhuma chave null.
				 * Elementos são ordenados (por padrão natural ou por compareTo).
				 */
				System.out.println("TreeMap");
				Map<String, MyClass> treeMap = new TreeMap<String, MyClass>();
				treeMap.put("a", new MyClass(0, "zero") );
				treeMap.put("b", new MyClass(1, "um") );
				treeMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
				treeMap.put("d", new MyClass(3, "tres") );			// não pode repetir =>subistitui
				treeMap.put("c", new MyClass(2, "dois") );
				// treeMap.put(null, new MyClass(4, "quatro") );	// não pode!
				
				System.out.println( treeMap );
				System.out.println( treeMap.size() );
				
				System.out.println( treeMap.remove( "b" ) );
				System.out.println( treeMap.size() );
				
				System.out.println( treeMap.keySet() ); // retorna as chaves

				for(String key: treeMap.keySet() ) {   // pegas as chvaves retornadas e escreve
		            System.out.print( treeMap.get(key) + " ");  
		        }
				System.out.println("\n\n");

				
		}
}
