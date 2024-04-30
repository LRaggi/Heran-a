import java.util.Scanner;
public class Pessoa  {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    // variáveis
    private String Nome, Nascimento, Endereco, Telefone;
    private int Numero, Cpf;

    // get/set
    public String getNome(){
      return nome;
      nome = valor;
    }
    public String getNascimento(){
      return nascimento;
      nascimento = valor;
    }
    public String getEndereco(){
      return endereco;
       endereco = valor;
    }
     public String Telefone(){
       return telefone;
       telefone = valor;
     }
    public int getID(){
      return Numero;
      Numero = valor;
    }
    public int getCpf(){
      return cpf;
      cpf = valor;
    }

    // metodos
    public void imprimir(){
      System.out.println("Nome: " + nome);
      System.out.println("Nascimento: " + nascimento);
      System.out.println("Endereço: " + endereco);
      System.out.println("Telefone: " + telefone);
      System.out.println("Número de ID: " + ID); 
      System.out.println("CPF: " + cpf);
      
    }
    

    
  }
}