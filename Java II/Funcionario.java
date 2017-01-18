class Funcionario {
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

  public double getBonus() {
    return this.salario * 0.2;
  }
}
