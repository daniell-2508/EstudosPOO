package eventos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MesaRedonda extends Atividade {
    private Palestrante moderador;
    private List<Palestrante> debatedores = new ArrayList<>();

    public MesaRedonda(String nome, LocalTime inicio, int duracaoMinutos, Palestrante moderador) {
        super(nome, inicio, duracaoMinutos);
        this.moderador = moderador;
    }

    public void adicionarDebatedor(Palestrante p) {
        debatedores.add(p);
    }

    @Override
    public String gerarResumo() {
        String nomes = "";
        for (Palestrante d : debatedores) {
            nomes += d.getNome() + " ";
        }
        return super.gerarResumo() + " [Mesa] Moderador: " + moderador.getNome() + "; Debatedores: " + nomes;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mesa redonda moderada por " + moderador.getNome());
    }
}