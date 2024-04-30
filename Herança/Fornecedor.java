public class Fornecedor {
  // variaveis
  private double valorCredito, valorDivida;

  // get/set
  public double getCred(){
    return valorCredito;
    valorCredito = valor;
  }
  public double getDiv(){
    return valorDivida;
    valorDivida = valor;
  }

  // metodos
  public void inicializarSaldo(double valorCredito, double valorDivida){
    Cred = valorCredito;
    Div = valorDivida;
  }
  public void obterSaldo(){
    double saldo = Cred - Div;
    System.out.println("Saldo: " + saldo);
  }
}