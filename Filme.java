class Filme {
  private String nome;
  private double duracao;
  private String sinopse;
  private double valor;
  private Critica critica[];
  private int quantidade_criticos;
  private double nota;

  public Filme() {

  }

  public Filme(String nome, double duracao, String sinopse, double valor, Critica critica[]) {
    this.nome = nome;
    this.duracao = duracao;
    this.sinopse = sinopse;
    this.valor = valor;
    this.critica = new int[100];
    this.quantidade_criticos = 0;
    this.nota = 0;
  }

  public String getNome() {
    return nome;
  }

  public double getDuracao() {
    return duracao;
  }

  public String getSinopse() {
    return sinopse;
  }

  public void setSinopse(String sinopse) {
    this.sinopse = sinopse;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String[] getCritica() {
    return critica;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDuracao(double duracao) {
    this.duracao = duracao;
  }

  public void setCritica(Critica[] critica) {
    this.critica = critica;
  }

  public int getQuantidadeCriticos() {
    return quantidade_criticos;
  }

  public double getNota() {
    return nota;
  }

  public void addCritico(double nota) {
    this.nota = (this.nota * this.quantidade_criticos + nota) / (this.quantidade_criticos + 1);
    this.quantidade_criticos++;
  }

}
