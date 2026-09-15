package POO3;
import java.util.ArrayList;

public class ListaPessoal {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public boolean verificarISBN(String isbnProcurado) {
        for (Livro livro : livros) {
            if (livro.possuiISBN(isbnProcurado)) {
                return true;
            }
        }

        return false;
    }

    public void imprimirLivros() {
        for (Livro livro : livros) {
            livro.exibirInformacoes();
        }
    }

    public int contarPorGenero(String generoProcurado) {
        int contador = 0;

        for (Livro livro : livros) {
            if (livro.possuiGenero(generoProcurado)) {
                contador++;
            }
        }

        return contador;
    }

    public int contarPorGeneroEAno(
        String generoProcurado,
        int anoMinimo
    ) {
        int contador = 0;

        for (Livro livro : livros) {
            if (livro.possuiGeneroEAno(generoProcurado, anoMinimo)) {
                contador++;
            }
        }

        return contador;
    }

    public int quantidadeTotal() {
        return livros.size();
    }
}