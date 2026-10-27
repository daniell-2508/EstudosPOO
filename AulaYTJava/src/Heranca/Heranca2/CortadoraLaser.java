package Heranca.Heranca2;

public class CortadoraLaser extends Equipamento implements Calibravel {

    @Override
    public void executar() throws EquipamentoIndisponivelException {
        if (estado != EstadoEquipamento.DISPONIVEL) {
            throw new EquipamentoIndisponivelException("Cortadora laser indisponível");
        }
        System.out.println("Executando operação: corte a laser");
    }

    @Override
    public void calibrar() throws EquipamentoIndisponivelException {
        if (estado == EstadoEquipamento.EM_USO) {
            throw new EquipamentoIndisponivelException("Cortadora em uso, não pode ser calibrada");
        }
        System.out.println("Executando calibração da cortadora laser");
    }
}