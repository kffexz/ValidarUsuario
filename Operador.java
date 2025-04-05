package model;

import javax.swing.JOptionPane;

public class Operador extends Funcionario{

	private String cargo;
	private double valorDeComissao;
	
	
	public Operador(String nome, String login, String senha, boolean ativo, double salarioBase, String cargo,
			double valorDeComissao) {
		super(nome, login, senha, ativo, salarioBase);
		this.cargo = cargo;
		this.valorDeComissao = valorDeComissao;
	}
	
	
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorDeComissao() {
		return valorDeComissao;
	}

	public void setValorDeComissao(double valorDeComissao) {
		this.valorDeComissao = valorDeComissao;
	}

	public void cadastrarOperador(String nome,String login, String senha, String cargo, double valorDeComissao, double salarioBase )  {
		setNome(nome);
		setLogin(login);
		setSenha(senha);
		setAtivo(false);
		setCargo(cargo);
		setSalarioBase(salarioBase);
		setValorDeComissao(valorDeComissao);
		
	}
	
	public void apresentarOperador()  {
		 JOptionPane.showMessageDialog(null,  "Nome: " + getNome()
		 + "\nCargo: " + getCargo() 
		 + "\nSalário base: " + getSalarioBase()
		 + "\nValor de comissão: " + getValorDeComissao());
	}
	
	public String calcularSalario()  {
		setSalarioBase(getSalarioBase() + getValorDeComissao());
		return "Nome: "+ getNome() +
				"\nSalário: " + getSalarioBase();
	}
}
