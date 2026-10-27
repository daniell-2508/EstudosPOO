public class PedidoAlimento extends Pedido {   // NÃO implementa Entregavel
    private double frete = 5;                  // enunciado cita frete 5, mas diz que não é entregável

    public PedidoAlimento(int id, String nomeCliente, double valor) throws ValorInvalidoException {
        super(id, nomeCliente, valor, Categoria.ALIMENTO);
    }

    @Override
    public double calcularValorFinal() {
        return valor;   // sem desconto
    }
}