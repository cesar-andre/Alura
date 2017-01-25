package br.com.caelum.fj11.banco.conta;

abstract public class Conta {

	protected double saldo;
	private String nome;
	private int agencia;
	private int numero;

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Conta(String nome, int agencia, double saldo, int numero) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta com saldo: " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) return false;
		Conta outra = (Conta) obj;
		return outra.numero == this.numero && outra.nome.equals(this.nome);
	}

}
