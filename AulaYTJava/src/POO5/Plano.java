import java.util.ArrayList;
public class Plano {

    private ArrayList<Exercicio> exercicios = new ArrayList<>();

    public void adicionarExercicio(Exercicio exercicioNovo){
        exercicios.add(exercicioNovo);
    }

    public void retirarExercicio(Exercicio exercicioTirar){
        exercicios.remove(exercicioTirar);
    }
    
    public boolean verificarExercicio(Exercicio exercicioProcurado){
        for (Exercicio exercicio : exercicios){
            if (exercicio.equals(exercicioProcurado)){
                return true;
            }
        }
        return false;
    }

    public int quantidadeExerciciosCondicao(int serieTestada, int repeticaoTestada){
        int contador = 0;
        for ( Exercicio exercicio : exercicios){
            if (exercicio.verificarCondicaoExercicio(serieTestada, repeticaoTestada)){
                contador++;
            }
        }
        return contador;
    }

    public void ExibirExerciciosPlano(){
        for ( Exercicio exercicio : exercicios){
            exercicio.exibirInfosExercicio();
        }
    }
}
