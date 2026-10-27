package eventos;

import java.time.LocalTime;
import java.util.ArrayList;

public class MiniCurso extends Atividade implements Avaliavel {   // extends ANTES de implements
    private Nivel nivel;                                          // enum (Aula 06)
    private ArrayList<Integer> notas = new ArrayList<>();         // wrapper Integer (Aula 03)

    public MiniCurso(String nome, LocalTime inicio, int duracao, Nivel nivel) {
        super(nome, inicio, duracao);                             // super no construtor (Aula 04)
        this.nivel = nivel;
    }

    @Override
    public void adicionarNota(int nota) {
        notas.add(nota);
    }

    @Override
    public double calcularAvaliacaoMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        return (double) soma / notas.size();                     // coerção p/ não truncar
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Minicurso nível " + nivel);
    }
}