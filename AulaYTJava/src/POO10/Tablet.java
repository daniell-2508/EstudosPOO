package POO10;

public class Tablet extends Dispositivo {

    private double tamanhoTela;

    public Tablet(String marca, String modelo, double preco, double tamanhoTela){
        super(marca, modelo, preco);
        this.tamanhoTela = tamanhoTela;
    }
}
