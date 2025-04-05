package model;

abstract class Funcionario extends Usuario {

	public Funcionario(String nome, String login, String senha, boolean ativo, double salarioBase) {
		super(nome, login, senha, ativo);
		this.salarioBase = salarioBase;
	}

	private double salarioBase;

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	

}
