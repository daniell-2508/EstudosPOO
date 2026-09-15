package POO3;
public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro(
            "O Hobbit",
            "111",
            "Fantasia",
            1937
        );

        Livro livro2 = new Livro(
            "Harry Potter",
            "222",
            "Fantasia",
            1997
        );

        Livro livro3 = new Livro(
            "Código Limpo",
            "333",
            "Tecnologia",
            2008
        );

        ListaPessoal lista = new ListaPessoal();

        lista.adicionarLivro(livro1);
        lista.adicionarLivro(livro2);
        lista.adicionarLivro(livro3);

        lista.imprimirLivros();

        System.out.println(
            "Possui ISBN 222? " + lista.verificarISBN("222")
        );

        System.out.println(
            "Livros de fantasia: "
                + lista.contarPorGenero("Fantasia")
        );

        System.out.println(
            "Fantasia publicada a partir de 1950: "
                + lista.contarPorGeneroEAno("Fantasia", 1950)
        );

        System.out.println(
            "Quantidade total: " + lista.quantidadeTotal()
        );
    }
}
