package POO3;
public class Livro {

    // ATRIBUTOS 
    private String titulo;
    private String isbn;
    private String genero;
    private int anoPublicacao;

    // CONSTRUTOR

    public Livro(
        String titulo,
        String isbn,
        String genero,
        int anoPublicacao
    ) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
    }

    // MÉTODOS
    
    public boolean possuiISBN(String isbnProcurado) {
        return isbn.equals(isbnProcurado);
    }

    public boolean possuiGenero(String generoProcurado) {
        return genero.equalsIgnoreCase(generoProcurado);
    }

    public boolean possuiGeneroEAno(
        String generoProcurado,
        int anoMinimo
    ) {
        return genero.equalsIgnoreCase(generoProcurado)
            && anoPublicacao >= anoMinimo;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("-----------------------------");
    }
}
