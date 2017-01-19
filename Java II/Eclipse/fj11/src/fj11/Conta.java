package fj11;

abstract public class Conta {

	protected double saldo;
	private String nome;
	private int agencia;

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.agencia);
		System.out.println(this.saldo);
	}

	public abstract void atualiza(double taxa);

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
