package POO1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        ContaBancaria Cliente1 = new ContaBancaria();
        Cliente1.nome = "Bruna";
        Cliente1.saldo = 2300;

        Cliente1.depositar(200);
        Cliente1.sacar(400);
        Cliente1.ExibirInfos();



    }
}
