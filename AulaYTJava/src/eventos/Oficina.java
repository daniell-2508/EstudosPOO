package eventos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Oficina extends Atividade {
    private List<Palestrante> instrutores = new ArrayList<>();
    private List<String> materiais = new ArrayList<>();

    public Oficina(String nome, LocalTime inicio, int duracaoMinutos) {
        super(nome, inicio, duracaoMinutos);
    }

    public void adicionarInstrutor(Palestrante p) {
        instrutores.add(p);
    }

    public void adicionarMaterial(String material) {
        materiais.add(material);
    }

    @Override
    public String gerarResumo() {
        String instr = "";
        for (int i = 0; i < instrutores.size(); i++) {
            instr += instrutores.get(i).getNome();
            if (i < instrutores.size() - 1) {
                instr += ", ";
            }
        }
        return super.gerarResumo() + " [Oficina] Instrutores: " + instr + "; Materiais: " + materiais;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Oficina com " + instrutores.size() + " instrutor(es)");
    }
}