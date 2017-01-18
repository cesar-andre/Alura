class Conta{
  int numero;
  Cliente titular;
  private double saldo;
  private double limite;
  private static int numeroIncremental = 1;

  public Conta(int numero, double limite) {
    this(numero, limite, 0);
  }

  public Conta(int numero, double limite, double saldoInicial) {
    this.numero = numero;
    this.limite = limite;
    this.saldo = saldoInicial;
  }

  public Conta() {
    this.numero = numeroIncremental;
    numeroIncremental++;
  }


  public void saca(double valor) {
    if (valor > this.saldo + this.limite) {
      System.out.println("Saque invalido");
    } else{
      this.saldo = this.saldo - valor;
    }
  }

  public void deposita(double valor) {
    this.saldo = this.saldo + valor;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setLimite(double novoLimite) {
    this.limite = novoLimite;
  }

}

class Cliente {
  String nome;
  String endereco;
}


class TesteModificador {
  public static void main(String[] args) {
    Conta joao = new Conta();

    joao.deposita(500.0);
    joao.saca(700.0);

    System.out.println(joao.numero);

    Conta jose = new Conta();
    System.out.println(jose.numero);

  }
}
