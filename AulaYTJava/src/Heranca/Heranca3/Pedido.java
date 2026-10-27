public abstract class Pedido implements Processavel {
    protected int id;
    protected String nomeCliente;
    protected double valor;
    protected StatusPedido status;
    protected Categoria categoria;

    public Pedido(int id, String nomeCliente, double valor, Categoria categoria) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido: " + valor + ". O valor deve ser maior que zero.");
        }
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.categoria = categoria;
        this.status = StatusPedido.PENDENTE;
    }

    public int getId() {
        return id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void alterarStatus(StatusPedido novoStatus) throws PedidoInvalidoException {
        if (status == StatusPedido.ENTREGUE) {
            throw new PedidoInvalidoException("Pedido " + id + " já foi entregue e não pode mudar de status.");
        }
        status = novoStatus;
    }

    @Override
    public void processarPedido() throws PedidoInvalidoException {
        if (status == StatusPedido.CANCELADO) {
            throw new PedidoInvalidoException("Pedido " + id + " está cancelado e não pode ser processado.");
        }
        if (status == StatusPedido.ENTREGUE) {
            throw new PedidoInvalidoException("Pedido " + id + " já foi entregue e não pode mudar de status.");
        }
        status = StatusPedido.PROCESSANDO;
        System.out.println("Processando pedido " + id + " | valor final: R$" + calcularValorFinal());
    }

    @Override
    public String toString() {
        return "Pedido " + id + " | " + nomeCliente + " | " + categoria + " | R$" + valor + " | " + status;
    }
}