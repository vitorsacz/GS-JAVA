package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Functions;
import br.com.fiap.beans.Mae;
import br.com.fiap.beans.Medico;
import br.com.fiap.beans.Triagem;



public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Mae> mae = new ArrayList<>();
		List<Contato> contato = new ArrayList<>();
		List<Endereco> end = new ArrayList<>();
		List<Triagem> triagem = new ArrayList<>();
		List<Medico> med = new ArrayList<>();
		
		Functions f = new Functions();
		
		String opcao;
		int perfil;
		int op;
		int cod;
			
		mae.add(new Mae(1, "Valeria Costa", 28, "sim" ));
		mae.add(new Mae(1, "Andreia Silva", 35, "não" ));
		
		contato.add(new Contato(1, "11 943411732", "valeria@gmail.com"));
		contato.add(new Contato(2, "11 987651234", "andreia@hotmail.com"));
		
		end.add(new Endereco(1, "Rua Luis Freire", 200, "Butantã", "SP" ));		
		end.add(new Endereco(2, "Rua Vital Brazil", 1080, "Pinheiros", "SP" ));	
		
		triagem.add(new Triagem("Antonieta Cruz", "nozes", 13, "média", "dor abdominal", "obstetrícia"));
		
		med.add(new Medico("Paulo Muzy", "115.573", "Ortopedia", "11 947220715", "contato@clinicamuzy.com.br", "São Paulo"));
		med.add(new Medico("Julio Balestrin", "632.256", "Nutrologia", "11 965982325", "contato@jbalestrin.com.br", "São Paulo"));
		med.add(new Medico("Fabrício Pacholok", "395.62", "Cardiologia", "11 974586321", "contato@pacholokclinic.com.br", "Rio de Janeiro"));
		
		
		do {
			
			
			f.slogan();
			
			f.perfil();
			
			perfil = Functions.inteiro("INFORME O NUMERO DA OPÇÃO");
			
			if (perfil == 1){
				
				f.menuPaciente();
				
				op =Functions.inteiro("INFORME O NÚMERO DA OPCÃO DESEJADA");
				
				//FUNCAO DE CADASTRAR PACIENTE
				if(op == 1) {
					
					cod = Functions.inteiro("Informe o código do paciente");
					
					mae.add(new Mae(cod, Functions.texto("Informe seu nome: "), Functions.inteiro("Informe sua idade: "), Functions.texto("Possui acompanhamento médico prévio? ")));
					contato.add(new Contato(cod, Functions.texto("Telefone de contato: "), Functions.texto("Email: ")));
					end.add(new Endereco(cod, Functions.texto("Informe sua rua: "), Functions.inteiro("Número: "), Functions.texto("Bairro: "), Functions.texto("Estado: ") ));	
					
					System.out.println("Paciente adicionado com sucesso!");
				}
				
				//FUNCAO DE LISTAR MÉDICOS
				else if(op == 2) {
					System.out.println("MÉDICOS DISPONÍVEIS");
					f.pula(1);
					for(Medico i: med) {
						f.pula(1);
						System.out.println(i.toString());
					}
				}
				
				//FUNCAO DE SAIR
				else if(op == 3) {
					System.out.println("SAINDO...");
					break;
				}
				
				
				
			}
			
			
			
			
			else if (perfil == 2){
				f.menuMedico();
				
				op =Functions.inteiro("INFORME O NÚMERO DA OPCÃO DESEJADA");
				
				//FUNCAO DE CADASTRAR NOVO MÉDICO
				if(op == 1) {
					med.add(new Medico(Functions.texto("Informe o nome: "), Functions.texto("Informe o CRM: "), Functions.texto("Informe a especialidade: "), Functions.texto("Informe o telefone de contato: "), Functions.texto("Informe o email de contato: "), Functions.texto("Informe o Estado de atuação: ")));
					
					System.out.println("Médico adicionado com sucesso!");
				}
				
				//FUNCAO DE LISTAR PACIENTES
				else if(op == 2) {
					System.out.println("PACIENTES CADASTRADAS");
					f.pula(1);
					for(Mae i: mae) {
						f.pula(1);
						System.out.println(i.toString());
					}
				}
				
				//FUNCAO DE TRIAGEM
				else if(op == 3) {	
					triagem.add(new Triagem(Functions.texto("Informe o nome da paciente: "), Functions.texto("Paciente possui alguma alergia?: "), Functions.inteiro("A paciente possui quantas semanas de gestação"), Functions.texto("Qual a gravidade da situação "), Functions.texto("Qual a queixa da paciente?"), Functions.texto("Qual a especialidade indicada para lidar com a situação?")));
				}
				
				//FUNÇÃO DE LISTAR PACIENTE TRIADOS
				else if(op == 4) {
					System.out.println("PACIENTES TRIADOS");
					f.pula(1);
					for(Triagem i: triagem) {
						f.pula(1);
						System.out.println(i.toString());
					}
				}
				
				else if(op == 5) {
					System.out.println("SAINDO...");
					break;
				}
				
			}
			
			else if (perfil == 3) {
				System.out.println("SAINDO...");
				break;
			}
			
			else {
				System.out.println("Informe uma opcao válida");
			}
			
	
			opcao = Functions.texto("Gostaria de realizar outra operação? S/N ");
			
		}while(opcao.toUpperCase().charAt(0) == 'S');
		
		f.linha(50);
		System.out.println("OBRIGADO POR ACESSAR O MOMCARE!!");
		f.linha(50);
	}
}
