package eventos;

import java.time.LocalTime;

public class Palestra extends Atividade {
    private Palestrante palestrante;
    private String tema;

    public Palestra(String nome, LocalTime inicio, int duracaoMinutos, Palestrante palestrante, String tema) {
        super(nome, inicio, duracaoMinutos);
        this.palestrante = palestrante;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String gerarResumo() {
        return super.gerarResumo() + " [Palestra] Tema: " + tema + "; Palestrante: " + palestrante.getNome();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Palestra sobre " + tema);
    }
}