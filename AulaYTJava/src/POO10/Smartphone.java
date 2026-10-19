package POO10;

public class Smartphone extends Dispositivo {
    
    private int numeroCameras;

    public Smartphone(String marca, String modelo, double preco, int numeroCameras){
        
        super(marca, modelo, preco);
        this.numeroCameras = numeroCameras;
    }

}
