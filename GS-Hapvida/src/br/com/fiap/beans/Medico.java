package br.com.fiap.beans;

public class Medico {
	
	private String nome;
	private String crm;
	private String especialidade;
	private String telefone;
	private String email;
	private String regiaoAtendimento;
	
	
	public Medico() {
		super();
	}

	public Medico(String nome, String crm, String especialidade, String telefone, String email,
			String regiaoAtendimento) {
		super();
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
		this.telefone = telefone;
		this.email = email;
		this.regiaoAtendimento = regiaoAtendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegiaoAtendimento() {
		return regiaoAtendimento;
	}

	public void setRegiaoAtendimento(String regiaoAtendimento) {
		this.regiaoAtendimento = regiaoAtendimento;
	}

	public String lista_medicos() {
		return    "Nome: " + nome + "\n"
				+ "CRM: " + crm + "\n"
				+ "Especialidade: " + especialidade;
				
	}
	@Override
	public String toString() {
		return    "Nome: " + nome + "\n"
				+ "CRM: " + crm + "\n"
				+ "Especialidade: " + especialidade + "\n"
				+ "Telefone: " + telefone + "\n"
				+ "Email: " + email + "\n"
				+ "Região de Atendimento:" + regiaoAtendimento;
	}
	
	
	
	
}
