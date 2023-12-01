package br.com.fiap.beans;

import javax.swing.JOptionPane;

public class Functions {
	
	//MÉTODO PARA RECEBER UMA STRING
	public static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//MÉTODO PARA RECEBER UM NUMERO INTEIRO ()
	public static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//MÉTODO PARA RECEBER UM NUMERO REAL
	public static Double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	//MÉTODO PULA LINHA
	public void pula(int tamanho) {
		   for(int y=1; y<=tamanho; y++){
			   System.out.print("\n");
			}	
		}
			
	//MÉTODO PARA CRIAR UMA LINHA DE DIVISÃO
	public void linha(int tamanho) {
		pula(1);
		for(int y=1; y<=tamanho; y++){
			System.out.print("-");
		}
			pula(1);
	}
	
	
	//MÉTODO PARA EXIBIR O SLOGAN DO PROJETO
	public void slogan() {
		
		this.linha(60);
		this.pula(1);
		System.out.println("BEM-VINDA AO MOM CARE");
		System.out.println("Pensado e desenvolvido para todas as mães!");
		this.linha(60);
	}
	
	
	//MÉTODO PARA EXIBIR AS OPCOES DE PERFIL DO USUARIO
	public void perfil() {
		System.out.println("QUAL O SEU PERFIL?");
		this.pula(1);
		System.out.println("1- PACIENTE");
		System.out.println("2- MÉDICO");
		
	}
	
	
	//MÉTODO PARA EXIBIR AS OPCOES DE MENU DO MEDICO
	public void menuMedico() {
		this.linha(50);
		System.out.println("O QUE DESEJA REALIZAR? ");
		this.pula(1);
		System.out.println("1- CADASTRAR NOVO MÉDICO");
		System.out.println("2- LISTAR PACIENTES");
		System.out.println("3- REALIZAR TRIAGEM");
		System.out.println("4- LISTAR PACIENTES TRIADOS");
		System.out.println("5- SAIR");
		this.linha(50);
		
	}
	
	
	//MÉTODO PARA EXIBIR AS OPCOES DE MENU DO PACIENTE
	public void menuPaciente() {
		
		this.linha(50);
		System.out.println("O QUE DESEJA REALIZAR? ");
		this.pula(1);
		System.out.println("1- CADASTRAR-SE");
		System.out.println("2- MÉDICOS DISPONÍVEIS");
		System.out.println("3- SAIR");
		this.linha(50);
		
	}
		
	
}
