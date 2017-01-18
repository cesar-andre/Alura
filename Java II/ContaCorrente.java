class ContaCorrente extends Conta {
  public void atualiza(double taxa) {
    this.saldo = this.saldo + (this.saldo * (2 * taxa));
  }
}
