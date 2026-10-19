package POO10;

public class Notebook extends Dispositivo {
    
    private double memoria;

    public Notebook(String marca, String modelo, double preco, double memoria){

        super(marca, modelo, preco);
        this.memoria = memoria;

    }
}
