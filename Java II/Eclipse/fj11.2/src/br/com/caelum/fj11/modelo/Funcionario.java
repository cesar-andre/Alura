package br.com.caelum.fj11.modelo;
abstract class Funcionario {
	protected String nome;
	protected double salario;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void mostra() {
		System.out.println("###########################");
		System.out.println("Nome: " + this.getNome());
		System.out.println(this.getBonus());
	}

	public abstract double getBonus();

}
