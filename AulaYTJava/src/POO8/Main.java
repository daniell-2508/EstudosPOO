package POO8;
import java.time.LocalDate;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Aluno aluno[] = new Aluno[10];

        

        for (int i = 0; i < 10; i++){

            System.out.println("Quer cadastrar outro aluno? (s/n) ");
            String teste = entrada.next();

            if (teste.equalsIgnoreCase("s")){
            

            System.out.print("Digite seu nome: ");
            String nome = entrada.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = entrada.next();

            System.out.print("Digite sua data de nascimento: ");
            LocalDate data_nascimento = entrada.next();

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

            aluno[i] = new Aluno(nome, sobrenome, data_nascimento,coragem, inteligencia, lealdade, ambicao, estrategia, criatividade);
            
            }

            else {
                for (int i = 0; i < aluno.length; i++){
                    aluno[i].exibirInformacoes();
                }
            }

      }

    public void exibirAlunosCasaETotal(String casaTestada){
        int contador = 0;
        for (int i = 0; i < aluno.length(); i++){
            if (aluno[i].calcularCasa().verificarCasa(casaTestada)){
            aluno[i].exibirInformacoes();
            contador++;
            }
        }
        System.out.println("Existem " + contador + " da casa: " + casaTestada);
    }

    public void exibirAlunosMaioresdeIDADE(){
            for (int i = 0; i < aluno.length(); i++)
                if (aluno[i].calcularIdade() >= 17){
                    aluno[i].exibirInformacoes();
                }
    }

        public void exibirAlunosMenoresdeIDADE(){
            for (int i = 0; i < aluno.length(); i++){
                if (aluno[i].calcularIdade() < 17){
                    aluno[i].exibirInformacoes();
                }
            }
    }


    public int procurarDeterminadoSobrenome(String SobrenomeTestar){
        int contador = 0;
        for (int i = 0; i < aluno.length(); i++){
            if(aluno[i].verificarSobrenome(SobrenomeTestar)){
                contador++;
            }
        }
        return contador;

    }

    }
}