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
                System.out.println("==========================\n\n= Bem-vindo - Biblioteca =\n\n==========================");
                System.out.println("========== MENU ==========\n");
                System.out.println("= 1 - Listar Acervo\n"+
                                    "= 2 - Listar Usuários\n"+
                                    "= 3 - Emprestar Livro\n"+
                                    "= 4 - Devolver Livro\n"+
                                    "= 5 - Cadastrar Livro\n"+
                                    "= 5 - Cadastrar Livro\n"+
                                    "= 6 - Cadastrar Usuario\n"+
                                    "= 0 - Sair");

                System.out.println("Escolha uma opção: ");
                String opcao = scanner.nextLine().trim();

                switch (opcao) {
                    case "1":
                        System.out.println("\n\n= LIVROS CADASTRADOS: =");
                        acervo.forEach(System.out::println);
                        break;
                    case "2":
                        System.out.println("\n\n= USUARIOS CADASTRADOS: =");
                        usuarios.forEach(System.out::println);
                        break;
                    case "3":
                        //pegar livros emprestado
                        break;
                    case "4":
                        //devolver livros
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
        System.out.println("==========================");
        System.out.println("=    CADASTRAR USUARIO   =");

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

public static void cadastrarLivros(){
        System.out.println("==========================");
        System.out.println("=    CADASTRAR LIVRO  =");

        System.out.println("Titulo do Livro: ");
        String Titulo = scanner.nextLine().trim();

        System.out.println("Autor: ");
        String Autor = scanner.nextLine().trim();

        System.out.println("Livro Cadastrado!");
        Livro novoLivro = new Livro(Titulo, Autor);

        acervo.add(novoLivro);
        }
}

/*public String gerarCodigo() {
    Random random = new Random();
    int numero = random.nextInt(900000) + 100000;
    return String.valueOf(numero);
}*/