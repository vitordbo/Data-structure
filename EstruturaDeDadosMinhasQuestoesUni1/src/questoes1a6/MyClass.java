package questoes1a6;

import java.io.Serializable;

/**
 * Classe usada nos varios exemplos.
 */
public class MyClass implements Serializable, Comparable<MyClass>
{
	private static final long serialVersionUID = -4126034513697849903L;

	// Constante
	private static final float FATOR = 0.5f;
	
	// Atributos
	private int inteiro;	// atributo-chave
	private String nome;
	
	// Construtor
	public MyClass(int inteiro, String nome) {
		this.inteiro = inteiro;
		this.nome = nome;
	}

		
	// Metodos getters e setters
	public int getInteiro() {
		return inteiro;
	}
	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "MyClass [" + 
				"inteiro=" + inteiro + ", " + 
				(nome != null ? "nome=" + nome : "") + "]";
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inteiro;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (inteiro != other.inteiro)
			return false;
		return true;
	}

	@Override
	public int compareTo(MyClass second) {
		return Integer.compare(this.inteiro, second.inteiro);
	}


	
}