class ContaPoupanca extends Conta {
  public void atualiza(double taxa) {
    this.saldo = this.saldo + (this.saldo * (2 * taxa));
  }

  public void deposita(double valor) {
    this.saldo = this.saldo + valor - 0.10;
  }
}
