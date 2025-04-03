package model;

public class Cliente extends Usuario {
	
	public Cliente(String nome, String login, String senha, boolean ativo, String cpf, double rendaMensal,
			double limiteDeCredito) {
		super(nome, login, senha, ativo);
		this.cpf = cpf;
		this.rendaMensal = rendaMensal;
		this.limiteDeCredito = limiteDeCredito;
	}
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}


	private String cpf;
	private double rendaMensal;
	private double limiteDeCredito;
	
	
	public void cadastrarCliente(String nome, String cpf, String login, String senha) {
		setNome(nome);
		setCpf(cpf);
		setLogin(login);
		setSenha(senha);
		setAtivo(false);
		setLimiteDeCredito(0.0);
	}
	
	public String apresentarCliente() {
		 return "Nome: " + getNome()
				 + "\nCPF: " + getCpf() 
				 + "\nRenda Mensal: " + getRendaMensal()
				 + "\nLimite de crédito: " + getLimiteDeCredito();
		
	}
}
