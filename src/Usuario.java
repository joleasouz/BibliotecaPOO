import java.util.Scanner;

public class Usuario {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String code;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    }

}