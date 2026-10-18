package POO9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto produto1 = new Produto("Notebook", "001", 3500.0);
        Produto produto2 = new Produto("Mouse", "002", 80.0);
        Produto produto3 = new Produto("Teclado", "003", 150.0);
        Produto[] produtos = {produto1, produto2, produto3};

        Fatura fatura = new Fatura();

        System.out.println("1-Comprar, 2-Ver fatura, 3-Excluir Item, 4-Alterar Item, 5-Finalizar");
        int teste = entrada.nextInt();

        while (teste != 5) {

            if (teste == 1) {
                System.out.println("Produtos disponíveis (0 para voltar):");
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println((i + 1) + " - " + produtos[i].getNome() + " | Código: " + produtos[i].getCodigo() + " | Preço: " + produtos[i].getPreco());
                }
                int escolha = entrada.nextInt();
                if (escolha != 0) {
                    Produto produtoEscolhido = produtos[escolha - 1];
                    System.out.println("Quantidade:");
                    int quantidade = entrada.nextInt();
                    Item novoItem = new Item(produtoEscolhido, quantidade);
                    fatura.adicionarItem(novoItem);
                }
            }

            if (teste == 2) {
                for (Item item : fatura.getItens()) {
                    item.exibirInfosItem();
                }
                System.out.println("Valor total até agora: " + fatura.ValorFinal());
            }

            if (teste == 3) {
                if (fatura.getItens().size() == 0) {
                    System.out.println("Não há itens na fatura.");
                } else {
                    System.out.println("Itens na fatura (0 para voltar):");
                    for (int i = 0; i < fatura.getItens().size(); i++) {
                        System.out.println((i + 1) + " - ");
                        fatura.getItens().get(i).exibirInfosItem();
                    }
                    int indice = entrada.nextInt();
                    if (indice != 0) {
                        Item itemEscolhido = fatura.getItens().get(indice - 1);
                        fatura.retirarItem(itemEscolhido);
                    }
                }
            }

            if (teste == 4) {
                if (fatura.getItens().size() == 0) {
                    System.out.println("Não há itens na fatura.");
                } else {
                    System.out.println("Itens na fatura (0 para voltar):");
                    for (int i = 0; i < fatura.getItens().size(); i++) {
                        System.out.println((i + 1) + " - ");
                        fatura.getItens().get(i).exibirInfosItem();
                    }
                    int indice = entrada.nextInt();
                    if (indice != 0) {
                        Item itemEscolhido = fatura.getItens().get(indice - 1);
                        System.out.println("Nova quantidade:");
                        int quantidadeNova = entrada.nextInt();
                        fatura.mudarQuantidadeItem(itemEscolhido, quantidadeNova);
                    }
                }
            }

            System.out.println("1-Comprar, 2-Ver fatura, 3-Excluir Item, 4-Alterar Item, 5-Finalizar");
            teste = entrada.nextInt();
        }

        System.out.println("O valor final da compra é " + fatura.ValorFinal());
    }
}