class Compra {
  private int pipoca;
  private int refrigerante;
  private int chocolate;
  private int agua;
  private int bombom;

  public Compra() {
  }

  public Compra(int pipoca, int refrigerante, int chocolate, Bilhete bilhete, int agua, int bombom) {
    this.pipoca = pipoca;
    this.refrigerante = refrigerante;
    this.chocolate = chocolate;
    this.bilhete = bilhete;
    this.agua = agua;
    this.bombom = bombom;
  }

  public int getPipoca() {
    return pipoca;
  }

  public int getRefrigerante() {
    return refrigerante;
  }

  public Bilhete getBilhete() {
    return bilhete;
  }

  public int getChocolate() {
    return chocolate;
  }

  public int compraBilhete(Sessao sessao) {
    return 0;
  }

  public void alterarCompra(Compra compra) {

  }

  public void cancelarCompra(Compra compra) {

  }

  public void setPipoca(int pipoca) {
    this.pipoca = pipoca;
  }

  public void setChocolate(int chocolate) {
    this.chocolate = chocolate;
  }

  public void setRefrigerante(int refrigerante) {
    this.refrigerante = refrigerante;
  }

  public int getAgua() {
    return agua;
  }

  public int getBombom() {
    return bombom;
  }

  public void setAgua(int agua) {
    this.agua = agua;
  }

  public void setBombom(int bombom) {
    this.bombom = bombom;
  }

  public void realizarCompra(Bilhete bilhete, CupomPromocional cupom) {
    double valorTotal = bilhete.getPreco();
    if (cupom != null) {
      valorTotal -= cupom.getValorDesconto(valorTotal);
    }
  }

  private double calcularValorTotal(Compra compra) {
    double valorTotal = 0;
    valorTotal += pipoca * PRECO_PIPOCA;
    valorTotal += refrigerante * PRECO_REFRI;
    valorTotal += chocolate * PRECO_CHOCOLATE;
    valorTotal += agua * PRECO_AGUA;
    valorTotal += bombom * PRECO_BOMBOM;
    valorTotal += bilhete.getPreco();
    return valorTotal;
  }
}