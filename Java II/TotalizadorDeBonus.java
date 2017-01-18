class TotalizadorDeBonus {
  private double total = 0;

  public void adiciona(Funcionario f) {
    total += f.getBonus();
  }

  public double getBonusTotal() {
    return this.total;
  }

}
