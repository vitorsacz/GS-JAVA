package br.com.fiap.beans;

public class Contato {
	private int cod;
	private String telefone;
	private String email;
	
	public Contato() {
		super();
	}

	public Contato(int cod, String telefone, String email) {
		super();
		this.cod = cod;
		this.telefone = telefone;
		this.email = email;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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

	@Override
	public String toString() {
		return  "Telefone: " + telefone + "\n"
				+ "Email: " + email;
	}
	
	
	
	
	
}
