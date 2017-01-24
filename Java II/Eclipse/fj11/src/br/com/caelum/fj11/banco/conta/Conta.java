package br.com.caelum.fj11.banco.conta;

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

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
	}

	/**
	 * realiza um saque na conta dado o valor passado
	 * 
	 * @param valor valor a ser sacado
	 * @throws Exception caso o saldo seja insuficiente 
	 */
	public void saca(double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(this.saldo);
		}
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
