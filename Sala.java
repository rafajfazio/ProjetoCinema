class Sala {
  private Sessao[] listaSessoes = new Sessao[6];
  private String nome;

  public Sala(String nome) {
    this.nome = nome;
  }

  public void adicionarSessao(Sessao sessao) {
    int horario = sessao.getHorario();
    if (horario >= 0 && horario < tamanhoLista) {
      listaSessoes[horario] = sessao;
    }
  }

  public void removerSessao(int horario) {
    if (horario >= 0 && horario < tamanhoLista) {
      listaSessoes[horario] = null;
    }
  }

  public Sessao getSessao(int horario) {
    if (horario >= 0 && horario < tamanhoLista) {
      return listaSessoes[horario];
    } else {
      return null;
    }
  }

  public String getNome() {
    return nome;
  }
}
