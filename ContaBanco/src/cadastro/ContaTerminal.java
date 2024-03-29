package cadastro;

public class ContaTerminal{
	
	public ContaTerminal() {
		
	}
	
	int conta;
	String agencia;
	String nome;
	double saldo;
	
	
	public int getConta() {
		return conta;
	}
	
	public void setConta( int conta) {
		this.conta = conta;
	}
	
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}