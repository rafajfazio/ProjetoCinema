class VendasException extends Exception {
  public VendasException(String message) {
    super(message);
  }

  public void realizarCompra(Bilhete bilhete, CupomPromocional cupom) throws VendasException {
    if (bilhete.getHora().isBefore(LocalDateTime.now())) {
      throw new VendasException("Não é possível comprar um bilhete de um filme que já passou.");
    }

    if (sessao.isPoltronaSelecionada(bilhete.getPoltrona())) {
      throw new VendasException("A poltrona selecionada já foi vendida.");
    }

    if (!sessao.isFilmeEmCartaz(bilhete.getFilme())) {
      throw new VendasException("O filme não está mais em cartaz.");
    }

    double valorTotal = bilhete.getPreco();
    if (cupom != null) {
      valorTotal -= cupom.getValorDesconto(valorTotal);
    }
  }
}
