public class Critico extends Usuario {
  
  private String origem;

  public Critico(){
    super();
  }

  public Critico(String user, String cpf, String senha, int idade, char sexo, String email, String nomeCartao, String numCartao, String codCartao, String origem){
    super(user, cpf, senha, idade, sexo, email, nomeCartao, numCartao, codCartao);
    this.origem = origem;
  }

  public String getOrigem(){
    return origem;
  }

  public void setOrigem(String origem){
    this.origem = origem;
  }

  @Override
  public double comprarBilhete(Sessao sessao){
    return 0;
  }

}
