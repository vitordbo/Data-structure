package questoes25a30;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
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
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = -4126034513697849903L;

	// Pessoa com os seguintes atributos: cpf, nome, idade, sexo, peso, altura, imc
	@Override
	public String toString() {
		return "[cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + " anos" + ", sexo=" + sexo + ", peso=" + peso + " kg"
				+ ", altura=" + altura +" cm" + ", imc=" + (float)imc + "]";
	}
	
	public enum Gender {
	    Masculino(0), Feminino(1);
	 
	    private int code;
	     
	    Gender(int code) {
	        this.code = code;
	    }
	 
	    public int getCode() {
	        return code;
	    }
	}

	private String cpf;
	private String nome;
	private int idade;
	private Gender sexo;
	private int peso;
	private float altura;
	private double imc;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public Gender getSexo() {
        return sexo;
    }
 
    public void setSexo(Gender sexo) {
        this.sexo = sexo;
    }	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public double getImc() {
		return imc;
	}
	public void setImc(double imc2) {
		this.imc = imc2;
	}
	
}
