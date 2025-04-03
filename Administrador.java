package model;

import javax.swing.JOptionPane;

public class Administrador extends Funcionario {

	public Administrador(String nome, String login, String senha, boolean ativo, double salarioBase,
			int codigoDeLiberacao) {
		super(nome, login, senha, ativo, salarioBase);
		this.codigoDeLiberacao = codigoDeLiberacao;
	}
	

	public int getCodigoDeLiberacao() {
		return codigoDeLiberacao;
	}

	public void setCodigoDeLiberacao(int codigoDeLiberacao) {
		this.codigoDeLiberacao = codigoDeLiberacao;
	}


	
	
	
	private int codigoDeLiberacao;
	
	
	
	
	
	
	public void autorizarCliente(int cod, Usuario usu) {
		if(cod != getCodigoDeLiberacao()) {
			JOptionPane.showMessageDialog(null, usu.getClass().toString() + " não tem permissão para essa operação!");
		} else {
			usu.setAtivo(true);
		}
	}
	
	public void calcularLimiteCredito( int cod, Cliente cli) {
		if (cod != getCodigoDeLiberacao()) {
			JOptionPane.showMessageDialog(null, "Usuário não tem permissão para essa operação!");
		} else {
			cli.setLimiteDeCredito(cli.getRendaMensal()*1.4);
		}
	}
}
