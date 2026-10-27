package Heranca.Heranca1;

public class Pix extends FormaPagamento{

        public Pix(double valor){
        super(valor);
    }
    
    @Override 
    public boolean processar() throws PagamentoRecusadoException{
        if (valor <= 0){
            throw new PagamentoRecusadoException("Valor insuficinte");
        }
        System.out.println("Pix de " + valor + " confirmado");
        return true;
    }
}
