package POO9;
import java.util.ArrayList;

public class Fatura {

    ArrayList<Item> Itens = new ArrayList<>();



    public double ValorFinal(){
        double valorFinal = 0;
        for (Item item : Itens){
        valorFinal += item.valorTotalItem();
        }
            return valorFinal;
    }

    public ArrayList<Item> getItens(){
        return Itens;
    }

    public void adicionarItem(Item itemNovo){
        Itens.add(itemNovo);

    }

    public void retirarItem(Item itemExistente){
        Itens.remove(itemExistente);

    }

    public void mudarQuantidadeItem(Item ItemExistente, int quantidadeNova){
        ItemExistente.setQuantidade(quantidadeNova);
    }

    public void verFatura(){
        System.out.println(getItens());
        System.out.println(valows);
    }
    
}
