package br.com.fiap.beans;

public class Mae {
	private int cod;
	private String nome;
	private int idade;
	private String acompanhamento;
	
	public Mae() {
		super();
	}

	public Mae(int cod, String nome, int idade, String acompanhamento) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.idade = idade;
		this.acompanhamento = acompanhamento;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	@Override
	public String toString() {
		return 	  "Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Acompanhamento médico: " + acompanhamento;
	}

	
	
}
