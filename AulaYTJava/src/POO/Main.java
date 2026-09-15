package POO;
public class Main {
    static void main(String[] args) {
        
        // Criando o primeiro objeto Carro
        Carro carro1 = new Carro();
        carro1.modelo = "civic";
        carro1.ano = 2023;
        carro1.cor = "preto";
        carro1.velocidade = 100;

        // Usando metodos
        carro1.acelerar(40);
        carro1.ExibirInfos();

    }
}
