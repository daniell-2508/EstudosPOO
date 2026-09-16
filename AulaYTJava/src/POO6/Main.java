package POO6;

public class Main {

    public static void main(String[] args) {
        
        Aula aula1 = new Aula();
        Aula aula2 = new Aula();

        aula1.setTitulo("Batman");
        aula1.setDificuldade("Fácil");
        aula1.setTempo(100);

        aula2.setTitulo("Diário de uma paixão");
        aula2.setDificuldade("Média");
        aula2.setTempo(80);

        Trilha trilha = new Trilha();
        
        trilha.adicionarAulaTrilha(aula1);
        trilha.adicionarAulaTrilha(aula2);

        trilha.exibirInfosTrilha();

        if (trilha.verificarDeterminadaAula(aula1)){
            System.out.println("A aula " + aula1.getTitulo() + " está na trilha!");
        }
        
        String dificuldadeUser = "Fácil";
        int tempoUser = 100;
        int quantidade = trilha.contarAulaDificuldadeTempoUser(dificuldadeUser,tempoUser);
        System.out.println("Tem " + quantidade + " aulas da dificuldade " + dificuldadeUser + " e com tempo de " + tempoUser + " minutos.");
        

    }
    
}
