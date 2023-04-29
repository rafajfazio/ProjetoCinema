class Critica{
  private String nome;
  private String mensagem;
  private String origem;

  public Critica(String nome, String mensagem, String origem){
    this.nome = nome;
    this.mensagem = mensagem;
    this.origem = origem;
  }

  public String getNome(){
    return nome;
  }

  public String getMensagem(){
    return mensagem;
  }

  public String getOrigem(){
    return origem;
  }

  public void setNome(String nome){
    this.nome = nome;
  }  

  public void setMensagem(String mensagem){
    this.mensagem = mensagem;
  }

  public void setOrigem(String origem){
    this.origem = origem;
  }

  public void atribuirNota(double nota){
    
  }

  public void atribuirCritica(String critica, Filme filme){
    
  }
  
}

  