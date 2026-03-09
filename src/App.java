import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    static ArrayList<Livro> acervo = new ArrayList<Livro>();

    public static void main(String[] args) throws Exception {
        boolean rodando = true;
            while(rodando){ 
                System.out.println("\n╔═════════════════════════╗");
                System.out.println("║ Bem-Vindos a Biblioteca ║");
                System.out.println("╟─────────────────────────╢");
                System.out.println("║ ──────── MENU ───────── ║");
                System.out.println("║ = 1 - Listar Acervo     ║\n"+
                                    "║ = 2 - Listar Usuários   ║\n"+
                                    "║ = 3 - Emprestar Livro   ║\n"+
                                    "║ = 4 - Devolver Livro    ║\n"+
                                    "║ = 5 - Cadastrar Livro   ║\n"+
                                    "║ = 6 - Cadastrar Usuario ║\n"+
                                    "║ = 0 - Sair              ║");
                System.out.println("╚═════════════════════════╝\n");
                System.out.println("  = Escolha uma opção:     ");
                String opcao = scanner.nextLine().trim();

                switch (opcao) {
                    case "1":
                        System.out.println("\n╔═════════════════════════╗");
                        System.out.println("║   LIVROS CADASTRADOS:   ║");
                        System.out.println("╚═════════════════════════╝\n");
                        acervo.forEach(System.out::println);
                        break;
                    case "2":
                        System.out.println("\n╔═════════════════════════╗");
                        System.out.println("║  USUARIOS CADASTRADOS:  ║");
                        System.out.println("╚═════════════════════════╝\n");
                        usuarios.forEach(System.out::println);
                        break;
                    case "3":
                        emprestarLivro();
                        break;
                    case "4":
                        devolverLivro();
                        break;
                    case "5":
                        cadastrarLivros();
                        break;
                    case "6":
                        cadastrarUsuario();
                        break;
                    case "0":
                        System.out.println("Até a próxima!");
                        rodando = false;
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            }
        }

public static void cadastrarUsuario(){
    System.out.println("\n╔═════════════════════════╗");
    System.out.println("║    CADASTRAR USUARIO    ║");
    System.out.println("╚═════════════════════════╝\n");

    System.out.println("Nome de Usuario: ");
    String nome = scanner.nextLine().trim();

    System.out.println("CPF: ");
    String cpf = scanner.nextLine().trim();

    System.out.println("E-mail: ");
    String email = scanner.nextLine().trim();

    System.out.println("Usuario Cadastrado!");
    Usuario novoUsuario = new Usuario(nome, cpf, email);
        
    usuarios.add(novoUsuario);
    }

public static void devolverLivro(){

    System.out.println("\n╔═════════════════════════╗");
    System.out.println("║      DEVOLVER LIVRO     ║");
    System.out.println("╚═════════════════════════╝\n");

    System.out.println("Digite o código do livro:");
    String codigo = scanner.nextLine();

    for(Livro livro : acervo){
        if(livro.getCode().equals(codigo)){
            if(!livro.foiEmprestado()){
                System.out.println("Esse livro já está disponível!");
            }else{
                livro.devolver();
                System.out.println("Livro devolvido com sucesso!");
            } return;
        }
    }

    System.out.println("Livro não encontrado.");
}

public static void emprestarLivro(){

    System.out.println("\n╔═════════════════════════╗");
    System.out.println("║    EMPRESTAR LIVROS     ║");
    System.out.println("╚═════════════════════════╝\n");

    System.out.println("Digite o código do livro:");
    String codigo = scanner.nextLine();

    for(Livro livro : acervo){
        if(livro.getCode().equals(codigo)){
            if(livro.foiEmprestado()){
                System.out.println("Livro já está emprestado!");
            }else{
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso!");
            } return;
        }
    }

    System.out.println("Livro não encontrado.");
}

public static void cadastrarLivros(){
    System.out.println("\n╔═════════════════════════╗");
    System.out.println("║     CADASTRAR LIVRO     ║");
    System.out.println("╚═════════════════════════╝\n");

    System.out.println("Titulo do Livro: ");
    String Titulo = scanner.nextLine().trim();

    System.out.println("Autor: ");
    String Autor = scanner.nextLine().trim();

    System.out.println("Livro Cadastrado!");
    Livro novoLivro = new Livro(Titulo, Autor);

    acervo.add(novoLivro);
    }
}