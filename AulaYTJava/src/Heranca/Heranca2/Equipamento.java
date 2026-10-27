package Heranca.Heranca2;

public abstract class Equipamento {
    protected String codigo;
    protected String descricao;
    protected EstadoEquipamento estado;

    public abstract void executar() throws EquipamentoIndisponivelException;
}
