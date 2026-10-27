package Heranca.Heranca3;

public interface Processavel {

    public boolean processarPedido() throws PedidoInvalidoException;

    public double calcularValorFinal();
}
