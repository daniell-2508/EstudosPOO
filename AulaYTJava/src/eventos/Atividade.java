package eventos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Atividade implements Resumivel, Notificavel {
    protected String nome;
    protected LocalTime inicio;
    protected int duracaoMinutos;
    protected List<Participante> participantes = new ArrayList<>();
    protected List<String> notificacoes = new ArrayList<>();

    public Atividade(String nome, LocalTime inicio, int duracaoMinutos) {
        this.nome = nome;
        this.inicio = inicio;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public LocalTime getFim() {
        return inicio.plusMinutes(duracaoMinutos);
    }

    public boolean conflitaCom(Atividade outra) {
        return this.inicio.isBefore(outra.getFim()) && outra.inicio.isBefore(this.getFim());
    }

    @Override
    public void notificar(String mensagem) {
        String registro = "Atividade '" + nome + "' recebeu: " + mensagem;
        notificacoes.add(registro);
        System.out.println(registro);
    }

    @Override
    public String gerarResumo() {
        return nome + " — início: " + inicio + ", duração: " + duracaoMinutos
                + " min, participantes: " + participantes;
    }

    public abstract void exibirDetalhes();
}