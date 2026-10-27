package eventos;

public class Palestrante implements Notificavel, Resumivel {
    private String nome;
    private String email;
    private String miniCurriculo;

    public Palestrante(String nome, String email, String miniCurriculo) {
        this.nome = nome;
        this.email = email;
        this.miniCurriculo = miniCurriculo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Palestrante '" + nome + "' recebeu: " + mensagem);
    }

    @Override
    public String gerarResumo() {
        return "Palestrante: " + nome + " | Email: " + email + " | Currículo: " + miniCurriculo;
    }
}