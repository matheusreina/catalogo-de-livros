import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CatalogoLivros {
    static ArrayList<Livros> catalogo = new ArrayList<>();
    public static void main(String[] args) {
        // Adicionando livros ao catálogo
        adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println("---------------------------------------");
        System.out.println(catalogo);
        System.out.println("---------------------------------------");
        System.out.println(pesquisarPorAutor("Susan J. Fowler"));
        System.out.println("---------------------------------------");
        System.out.println(pesquisarPorIntervaloAnos(2010,2018));
        System.out.println("---------------------------------------");
        System.out.println(pesquisarPorTitulo("Código Limpo"));
        System.out.println("---------------------------------------");

    }

    static void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livros(titulo, autor, anoPublicacao));
    }

    static List<Livros> pesquisarPorAutor(String autor) {
        ArrayList<Livros> pesquisaAutor = new ArrayList<>();

        if (!catalogo.isEmpty()) {
            for (Livros livro : catalogo) {
                if (Objects.equals(livro.getAutor(), autor)) {
                    pesquisaAutor.add(livro);
                }
            }
        }
        return pesquisaAutor;
    }

    static List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        ArrayList<Livros> pesquisaAnos = new ArrayList<>();

        for (Livros livro : catalogo) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                pesquisaAnos.add(livro);
            }
        }
        return pesquisaAnos;
    }

    static List<Livros> pesquisarPorTitulo(String titulo) {
        ArrayList<Livros> pesquisaTitulo = new ArrayList<>();

        for (Livros livro : catalogo) {
            if (Objects.equals(livro.getTitulo(), titulo)) {
                pesquisaTitulo.add(livro);
            }
        }
        return pesquisaTitulo;
    }

}