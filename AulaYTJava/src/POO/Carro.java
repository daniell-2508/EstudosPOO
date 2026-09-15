package POO;
public class Carro {

        // Atributos ( Caracteristicas do carro )
        String modelo;
        String cor;
        int ano;
        double velocidade;

        // Metodos ( comportamentos)
        public void acelerar(double quantidade) {
            velocidade += quantidade;
            System.out.println(modelo + " acelerou! Velocidade atual: " + velocidade + "km/h");
        }

        public void ExibirInfos(){
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
            System.out.println("Velocidade: " + velocidade);
        }





    }

