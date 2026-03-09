import java.util.Random;

public class Livro {
    private String code;
    private String nome;
    private String autor;
    private boolean emprestado;

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        this.code = gerarCodigo();
        this.emprestado = false;
    }

    private String gerarCodigo() {
        Random random = new Random();
        int numero = random.nextInt(900000) + 100000;
        return String.valueOf(numero);
    }

    public String getCode(){
        return code;
    }

    public boolean foiEmprestado(){
        return emprestado;
    }

    public void emprestar(){
        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }


    public String toString() {
        return "Titulo: " + this.nome + " | Autor: " + this.autor + " | Código: " + this.code + " | emprestado: "+ this.emprestado; 
    }
}
