public enum CupomPromocional {
  PROMO5("Promo 5%", 0.5),
  PROMO10("Promo 10%", 0.10),
  PROMO15("Promo 15%", 0.15);

  private final String nome2;
  private final double multiplicador2;

  private CupomPromocional(String nome2, double multiplicador2) {
    this.nome2 = nome2;
    this.multiplicador2 = multiplicador2;
  }

  public String getNome2() {
    return nome2;
  }

  public double getMultiplicador2() {
    return multiplicador2;
  }
}