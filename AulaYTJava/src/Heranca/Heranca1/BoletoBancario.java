package Heranca.Heranca1;

public class BoletoBancario extends FormaPagamento {

        public BoletoBancario(double valor){
        super(valor);
    }
    
   @Override 
    public boolean processar() throws PagamentoRecusadoException{
        if (valor <= 0){
            throw new PagamentoRecusadoException("Valor insuficinte");
        }
        System.out.println("boleto de " + valor + " confirmado");
        return true;
    }
}
