import java.util.Scanner;
public class Operario  {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    private double valorProducao, comissao;

    public double getProd(){
      return valorProducao;
      valorProducao = valor;
    }
    public double getCom(){
      return comissao;
      comissao = valorProducao*25/100;
    }

    public void inicializarOperario(double valorProducao, double comissao){
      prod = valorProducao;
      com = comissao;
    }
    public override void calcularSalario(){
      double SalarioOperario = paga = 5000 + com;
    System.out.println("Salário do Operário: " + SalarioOperario);
    }

  }
}