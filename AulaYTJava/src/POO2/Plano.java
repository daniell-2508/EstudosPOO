package POO2;
import java.util.ArrayList;

public class Plano {

    private ArrayList<Exercicio> exercicios = new ArrayList<>();

    public void adicionarexercicio( Exercicio exercicio){
        exercicios.add(exercicio);
    }

    public void retirarexercicio( Exercicio exercicio){
        exercicios.remove(exercicio);
    }

    public boolean verificarExercicio( Exercicio exercicio){
        return  exercicios.contains(exercicio);
    }

    public void imprimirPlano(){
        for ( Exercicio exercicio : exercicios){
            exercicio.imprimirdados();
        }
    }

    public int contarExercicios(int serie, int repeticao){
        int contador = 0;
        for ( Exercicio exercicio : exercicios){
            if (exercicio.testar(serie,repeticao)){
                contador++;
            }
        }
        return contador;   
    }
}
