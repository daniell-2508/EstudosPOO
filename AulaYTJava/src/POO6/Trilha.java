package POO6;
import java.util.ArrayList;
public class Trilha {

    private ArrayList<Aula> aulas = new ArrayList<>();

    public void adicionarAulaTrilha(Aula aulanova){
        aulas.add(aulanova);
    }

    public void retirarAulaTrilha( Aula aulaEspecifica){
        aulas.remove(aulaEspecifica);
    }

    public boolean verificarDeterminadaAula( Aula aulaDeterminada){
        return aulas.contains(aulaDeterminada);
    }

    public void exibirInfosTrilha(){
        for ( Aula aula : aulas){
            aula.imprimiInfosAula();
        }
    }

    public int contarAulaDificuldadeTempoUser(String dificuldadeUser, int tempoUser){
        int contador = 0;
        for ( Aula aula : aulas){
            if ( aula.getDificuldade().equals(dificuldadeUser) && aula.getTempo() == tempoUser){
                contador++;
            }
        }
        return contador;
        }
    }
    

