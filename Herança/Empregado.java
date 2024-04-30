import java.util.Scanner;
public class Empregado  {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    // variáveis
    private double SalarioBase, SalarioTotal, imposto;

    // get/set
    public double getPaga(){
      return SalarioBase;
      SalarioBase = valor;
    }
    public double getTaxa(){
      return imposto;
      imposto = valor;
    }
    public double getTpaga(){
      return SalarioTotal;
      SalarioTotal = valor;
    }

    // metodos
    public void inicializarSalario(double SalarioBase, double imposto, double SalarioTotal){
      paga = SalarioBase;
      taxa = imposto;
      tpaga = SalarioTotal;
    }
    public virtual void calcularSalario(){
      SalarioTotal = SalarioBase - imposto;
    System.out.println("Salário do Empregado: " + tpaga);
    }

  }
}