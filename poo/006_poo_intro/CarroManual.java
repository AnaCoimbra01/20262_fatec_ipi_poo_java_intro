public class CarroManual {
  private String nomeDoModelo;
  String tipoDoMotor;

  public CarroManual (String nomeDoModelo, String tipoDoMotor) {
    setNomeDoModelo(nomeDoModelo);
    setTipoDoMotor(tipoDoMotor);
  }

    public CarroManual (String nomeDoModelo, String tipoDoMotor) {
      getNomeDoModelo(nomeDoModelo);
      getTipoDoMotor(tipoDoMotor);
    }

  public void CarroManual (String nomeDoModelo, String tipoDoMotor) {
    this.nomeDoModelo = nomeDoModelo;
    this.tipoDoMotor = tipoDoMotor;
  }  
}
