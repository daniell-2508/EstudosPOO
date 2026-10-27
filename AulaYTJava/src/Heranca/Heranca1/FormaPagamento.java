package Heranca.Heranca1;

public abstract class FormaPagamento {

    protected double valor;

    public FormaPagamento(double valor) {
    this.valor = valor;
    }

    public abstract boolean processar() throws PagamentoRecusadoException;
    
}
