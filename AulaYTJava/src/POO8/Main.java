package POO8;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String continuar = "s";

        while(continuar.equalsIgnoreCase("s")){

            System.out.print("Digite seu nome: ");
            String nome = entrada.next();

            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite sua coragem: ");
            double coragem = entrada.nextDouble();

            System.out.print("Digite sua inteligencia: ");
            double inteligencia = entrada.nextDouble();

            System.out.print("Digite sua lealdade: ");
            double lealdade = entrada.nextDouble();

            System.out.print("Digite a sua ambição: ");
            double ambicao = entrada.nextDouble();

            System.out.print("Digite a sua estrategia: ");
            double estrategia = entrada.nextDouble();

            System.out.print("Digite a sua Criatividade: ");
            double criatividade = entrada.nextDouble();

            Aluno aluno = new Aluno(nome,idade,coragem,inteligencia,lealdade, ambicao, estrategia, criatividade);

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            System.out.println("Deseja informar mais uma pessoa? (s/n)");

            continuar = entrada.next();

      }

      System.out.println("Programa finalizado!");
      entrada.close();


    }
}