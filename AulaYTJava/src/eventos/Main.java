package eventos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Palestrante ana = new Palestrante("Ana", "ana@email.com", "Dev Java");
        Palestrante bia = new Palestrante("Bia", "bia@email.com", "Arquiteta de software");

        Palestra palestra = new Palestra("Abertura", LocalTime.of(9, 0), 60, ana, "POO na prática");
        palestra.adicionarParticipante(new Participante("Daniell"));

        Oficina oficina = new Oficina("Spring Boot", LocalTime.of(10, 30), 90);
        oficina.adicionarInstrutor(ana);
        oficina.adicionarInstrutor(bia);
        oficina.adicionarMaterial("Notebook");

        MesaRedonda mesa = new MesaRedonda("Carreira em TI", LocalTime.of(14, 0), 60, bia);
        mesa.adicionarDebatedor(ana);

        MiniCurso mc = new MiniCurso("Git", LocalTime.of(16, 0), 120, Nivel.BASICO);
        mc.adicionarNota(8);
        mc.adicionarNota(10);
        mc.adicionarNota(9);

        List<Atividade> atividades = new ArrayList<>();
        atividades.add(palestra);
        atividades.add(oficina);
        atividades.add(mesa);
        atividades.add(mc);

        for (Atividade atividade : atividades) {                  // 1) percorre
            System.out.println(atividade.gerarResumo());          // 2) resumo (polimórfico)
            if (atividade instanceof Avaliavel) {                 // 3) verifica
                Avaliavel av = (Avaliavel) atividade;             // 4) downcasting
                System.out.println("Média: " + av.calcularAvaliacaoMedia()); // 5) 9.0
            }
        }
    }
}
