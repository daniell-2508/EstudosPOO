package Heranca.Heranca1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<FormaPagamento> pagamentos =  new ArrayList<>();
        pagamentos.add(new CartaoCredito(100));
        pagamentos.add(new Pix(0));
        pagamentos.add(new BoletoBancario(30));
        
    for (FormaPagamento p : pagamentos) {
        try {
            p.processar();
            System.out.println("Pagamento concluído");
        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado: " + e.getMessage());
        }
    }

        
    }
    
}
