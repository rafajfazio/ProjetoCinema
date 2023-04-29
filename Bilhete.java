class Bilhete {
  private Usuario usuario;
  private String cpf;
  private Sala sala;
  private Sessao sessao;
  private Filme filme;
  private double valor;
  private Cadeira cadeira;

  public Bilhete(Usuario usuario, Sala sala, Sessao sessao, Filme filme, Cadeira cadeira) {
    this.usuario = usuario;
    this.cpf = usuario.getCpf();
    this.sala = sala;
    this.sessao = sessao;
    this.filme = filme;
    this.cadeira = cadeira;
    this.valor = filme.getValor();
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public String getCpf() {
    return cpf;
  }

  public Sala getSala() {
    return sala;
  }

  public Sessao getSessao() {
    return sessao;
  }

  public Filme getFilme() {
    return filme;
  }

  public double getValor() {
    return valor;
  }

  public Cadeira getCadeira() {
    return cadeira;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
