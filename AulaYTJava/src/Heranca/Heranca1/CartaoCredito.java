package Heranca.Heranca1;

public class CartaoCredito extends FormaPagamento {

    public CartaoCredito(double valor){
        super(valor);
    }
    
    @Override 
    public boolean processar() throws PagamentoRecusadoException{
                 if (valor <= 0){
            throw new PagamentoRecusadoException("Valor insuficinte");
        }
        System.out.println("tranferencia de R$" + valor + " confirmado");
        return true;
    }
}
