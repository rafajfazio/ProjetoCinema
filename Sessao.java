class Sessao {
  private Filme filme;
  private boolean[][] cadeirasDisponiveis;
  private int horario;

  public Sessao(Filme filme, int horario) {
    this.filme = filme;
    this.horario = horario;
    this.cadeirasDisponiveis = new boolean[15][15];
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        cadeirasDisponiveis[i][j] = true;
      }
    }
  }

  public Filme getFilme() {
    return filme;
  }

  public int getHorario() {
    return horario;
  }

  public boolean[][] getCadeirasDisponiveis() {
    return cadeirasDisponiveis;
  }

}
