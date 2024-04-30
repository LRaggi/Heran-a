import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String nome, nascimento, endereco, telefone;
    int ID=1, cpf;
    double paga=5000, taxa=0, custo, tpaga=0, prod=0, comv=0, com=0, venda=0;

    Empregado empregado = new Empregado();
    Administrador administrador = new Administrador();
    Operario operario = new Operario();
    Vendedor vendedor = new Vendedor();

    //Input usuario
    System.out.println("Digite o nome do funcionário: ");
    nome = sc.nextLine();
    System.out.println("Digite o ano de nascimento: ");
    nascimento = sc.nextLine();
    Systen.out.println("Digite o endereço: ");
    endereco = sc.nextLine();
    System.out.println("Digite o telefone: ");
    telefone = sc.nextLine();
    System.out.println("Digite o CPF: ");
    cpf = sc.nextInt();
    System.out.println("Digite a ajuda de custo do Adimistrador: ");
    custo = convert.toDouble(sc.nextLine());
    System.out.println("Digite o valor de produção: ");
    prod = convert.toDouble(sc.nextLine());
    System.out.println("Digite o valor de venda: ");
    venda = convert.toDouble(sc.nextLine());

    // metodos
    empregado.inicalizarPessoa(nome, nascimento, endereco, telefone, ID, cpf);
    empregado.inicializarSalario(paga, taxa, tpaga);
    empregado = sc.nextLine();
    empregado.calcularSalario();
    administrador.inicializarAdministrador(custo);
    administrador.calcularSalario();
    operario.inicializarOperario(prod, com);
    operario.calcularSalario();
    vendedor.inicializarVendedor(venda, comv);
    vendedor.calcularSalario();
  }

 
}