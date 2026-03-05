public class Livro {
    private String code;
    private String nome;
    private String autor;
    private boolean status;

    //add o codigo e os status dps
    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        this.status = status;
    }
    public String toString() {
        return "Titulo: " + this.nome + " | Autor: " + this.autor + " | Código: " + this.code; 
    }
}
