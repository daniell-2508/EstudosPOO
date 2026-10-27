package Heranca.Heranca2;

import java.util.ArrayList;
import java.util.Iterator;

public class Estoque {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public void adicionar(Equipamento e) {
        equipamentos.add(e);
    }

    public void removerInativos() {
        Iterator<Equipamento> it = equipamentos.iterator();
        while (it.hasNext()) {
            Equipamento e = it.next();
            if (e.estado == EstadoEquipamento.INATIVO) {
                it.remove();
            }
        }
    }
}
