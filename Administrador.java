import java.util.ArrayList;
import java.util.List;

class Administrador extends Base {
  private double salario;
  private int ID;

  private static List<Usuario> usuarios = new ArrayList<>();
  private static List<Filme> filmes = new ArrayList<>();

  public Administrador(String nome, int idade, String email, double salario, int ID) {
    super(nome, idade, email);
    this.salario = salario;
    this.ID = ID;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public void adicionarUsuario() {

  }

  public void alterarUsuario() {

  }

  public void excluirUsuario(Usuario usuario) {

  }

  public void adicionarFilme(Filme filme) {

  }

  public void editarFilme(Filme filme) {

  }

  public void removerFilme(Filme filme) {

  }

  public void adicionarUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }

  public void adicionarFilme(Filme filme) {
    filmes.add(filme);
  }

}
