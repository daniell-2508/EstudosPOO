package Heranca.Heranca2;

public class Impressora3D extends Equipamento {

    @Override
    public void executar() throws EquipamentoIndisponivelException {
        if (estado != EstadoEquipamento.DISPONIVEL) {
            throw new EquipamentoIndisponivelException("Impressora 3D indisponível");
        }
        System.out.println("Executando operação: impressão 3D");
    }
}