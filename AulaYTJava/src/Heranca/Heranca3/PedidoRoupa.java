public class PedidoRoupa extends Pedido implements Entregavel {

    public PedidoRoupa(int id, String nomeCliente, double valor) throws ValorInvalidoException {
        super(id, nomeCliente, valor, Categoria.ROUPA);
    }

    @Override
    public double calcularValorFinal() {
        if (valor > 200) {
            return valor * 0.8;
        }
        return valor;
    }

    @Override
    public double calcularFrete() {
        return 10 + valor * 0.05;
    }
}