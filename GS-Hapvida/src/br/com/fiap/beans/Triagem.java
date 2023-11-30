package br.com.fiap.beans;

public class Triagem {
	private String nome;
	private String alergias;
	private int semanas;
	private String urgencia;
	private String queixa;
	private String especialidade;
	
	

	public Triagem() {
		super();
	}

	public Triagem(String nome, String alergias, int semanas, String urgencia, String queixa, String especialidade) {
		super();
		this.nome = nome;
		this.alergias = alergias;
		this.semanas = semanas;
		this.urgencia = urgencia;
		this.queixa = queixa;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public int getSemanas() {
		return semanas;
	}

	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "" + nome 
				+ "Alergias: " + alergias + "\n"
				+ "Semanas: " + semanas + "\n"
				+ "Queixa: " + queixa + "\n"
				+ "Urgência: " + urgencia + "\n"
				+ "Especialidade indicada: " + especialidade;
	}

	
	
	
	
	
	
	
}
