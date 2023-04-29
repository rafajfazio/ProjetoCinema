public enum Salas{
  COMUM("Sala comum", 1.0),
  SALA_3D("Sala 3D", 1.2),
  XD("Sala XD", 1.3),
  XD_3D("Sala XD/3D", 1.4);

  private final String nome3;
  private final double multiplicador3;

  private Salas(String nome3, double multiplicador3){
    this.multiplicador3 = multiplicador3;
    this.nome3 = nome3;
  }

  public String getNome3(){
    return nome3;
  }

  public double getMultiplicador3(){
    return multiplicador3;
  }
}