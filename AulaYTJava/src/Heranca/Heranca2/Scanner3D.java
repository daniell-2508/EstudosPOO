package Heranca.Heranca2;

public class Scanner3D extends Equipamento {

    @Override
    public void executar() throws EquipamentoIndisponivelException {
        if (estado != EstadoEquipamento.DISPONIVEL) {
            throw new EquipamentoIndisponivelException("Scanner 3D indisponível");
        }
        System.out.println("Executando operação: escaneamento 3D");
    }
}
