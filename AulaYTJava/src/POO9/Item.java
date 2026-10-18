package POO9;

public class Item {

    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidadeNova){
        this.quantidade = quantidadeNova;
    }


    public double valorTotalItem(){
        return quantidade * produto.getPreco();
    }

    public void exibirInfosItem(){
        System.out.println(produto);
        System.out.println(quantidade);
        System.out.println(valorTotalItem());
    }
    
}
