public enum Produtos {
  PIPOCA("Pipoca", 8.0),
  REFRIGERANTE("Refrigerante,", 5.0),
  CHOCOLATE("Chocolate", 7.0),
  AGUA("Água", 5.0),
  BOMBOM("Bombom", 2.0);

  private final String nome;
  private final double multiplicador;

  private Produtos(String nome, double multiplicador) {
    this.nome = nome;
    this.multiplicador = multiplicador;
  }

  public String getNome() {
    return nome;
  }

  public double getMultiplicador() {
    return multiplicador;
  }
}