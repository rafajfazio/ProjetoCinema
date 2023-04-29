class Estudante extends Usuario {

  public Estudante(String user, String cpf, String senha, int idade, char sexo, String email, String nomeCartao,
      String numCartao, String codCartao, String numIdentEstudante) {
    super(user, cpf, senha, idade, sexo, email, nomeCartao, numCartao, codCartao);
  }

  @Override
  public int compraBilhete(Sessao sessao) {
    int valor = sessao.getPreco();
    return valor / 2;
  }
}
