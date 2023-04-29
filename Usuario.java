class Usuario{

  private String user;
  private String cpf;
  private String senha;
  private int idade;
  private char sexo;
  private String email;
  private String nomeCartao;
  private String numCartao;
  private String codCartao;

  public Usuario(){
  }

  public Usuario(String user, String cpf, String senha, int idade, char sexo, String email, String nomeCartao, String numCartao, String codCartao){
    this.user = user;
    this.cpf = cpf;
    this.senha = senha;  
    this.idade = idade;
    this.sexo = sexo;
    this.email = email;
    this.nomeCartao = nomeCartao;
    this.numCartao = numCartao;
    this.codCartao = codCartao;
  }

  public String getUser(){
    return user;
  }

  public String getCpf(){
    return cpf;
  }

  public String getSenha(){
    return senha;
  }

  public int getIdade(){
    return idade;
  }

  public char getSexo(){
    return sexo;
  }

  public String getEmail(){
    return email;
  }

  public String getNomeCartao(){
    return nomeCartao;
  }

  public String getNumCartao(){
    return numCartao;
  }

  public String getCodCartao(){
    return codCartao;
  

  }

  public void setUser(String user){
    this.user = user;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }
  public void setSexo(char sexo){
    this.sexo = sexo;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setNomeCartao(String nomeCartao){
    this.nomeCartao = nomeCartao;
  }
  public void setNumCartao(String numCartao){
    this.numCartao = numCartao;
  }
  public void setCodCartao(String codCartao){
    this.codCartao = codCartao;
  }
}