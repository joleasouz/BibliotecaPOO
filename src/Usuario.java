import java.util.Random;
import java.util.Scanner;

public class Usuario {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String ID;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.ID = gerarID();
    }

    private String gerarID() {
      Random random = new Random();
      int numero = random.nextInt(900000) + 100000;
      return String.valueOf(numero);
   }

    public String toString() {
    return "Usuário: " + this.nome + " | CPF: " + this.cpf + " | E-mail: " + this.email + " | ID: " + this.ID;  
    }
}