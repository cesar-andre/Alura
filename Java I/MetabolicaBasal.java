class MetabolicaBasal {
  public static void main(String[] args) {
    double taxa, caloriasGasta;
    taxa = 66 + (13.7 * 67.5) + (5 * 1.79) - (6.8 * 22);
    System.out.println("Taxa metabolica basal: " + taxa);


    /*Sedentário = BMR X 1.2 (pouco ou nenhum exercício)
    Levemente ativo = BMR X 1.375 (exercício leve 1 a 3 dias por semana)
    Moderadamente ativo = BMR X 1.55 (exercício moderador, faz esportes 3 a 5 dias por semana)
    Altamente ativo = BMR X 1.725 (exercício pesado de 6 a 7 dias por semana)
    Extremamente ativo = BMR X 1.9 (exercício pesado diariamente e até 2 vezes por dia) */

    caloriasGasta = taxa * 1.55;
    System.out.println("Calorias gastas: " + caloriasGasta);
  }
}
