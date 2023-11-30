package br.com.fiap.beans;

public class Endereco {
	private int cod;
	private String rua;
	private int numero;
	private String bairro;
	private String estado;
	
	public Endereco() {
		super();
	}


	public Endereco(int cod, String rua, int numero, String bairro, String estado) {
		super();
		this.cod = cod;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}



	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Endereco: " 
				+ rua 
				+ ", " + numero 
				+ ", " + bairro 
				+ ", " + estado;
	}
	
	
	
	
	
	
}
