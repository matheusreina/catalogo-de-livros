public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livros(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

    public String toString() {
        return "{ Titulo: \"" + getTitulo() + "\" | Autor: " + getAutor() + " | Ano de Publicacao: " + getAnoPublicacao() + " }\n";
    }

//    Getters & Setters;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
