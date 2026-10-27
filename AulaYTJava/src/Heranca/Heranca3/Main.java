import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int proximoId = 1;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Alterar status de um pedido");
            System.out.println("3 - Processar pedidos");
            System.out.println("4 - Remover cancelados");
            System.out.println("5 - Exibir pedidos");
            System.out.println("6 - Exibir pedidos entregáveis");
            System.out.println("0 - Encerrar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPedido();
                    break;
                case 2:
                    alterarStatus();
                    break;
                case 3:
                    processarPedidos();
                    break;
                case 4:
                    removerCancelados();
                    break;
                case 5:
                    exibirPedidos();
                    break;
                case 6:
                    exibirEntregaveis();
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void cadastrarPedido() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        System.out.print("Categoria (1-Eletrônico, 2-Roupa, 3-Alimento): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        try {
            Pedido p;
            if (tipo == 1) {
                p = new PedidoEletronico(proximoId, nome, valor);
            } else if (tipo == 2) {
                p = new PedidoRoupa(proximoId, nome, valor);
            } else {
                p = new PedidoAlimento(proximoId, nome, valor);
            }
            pedidos.add(p);
            proximoId++;
            System.out.println("Cadastrado: " + p);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static Pedido buscarPorId(int id) {
        for (Pedido p : pedidos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    static void alterarStatus() {
        System.out.print("ID do pedido: ");
        int id = sc.nextInt();
        System.out.print("Novo status (PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE, CANCELADO): ");
        String texto = sc.next().toUpperCase();
        sc.nextLine();

        Pedido p = buscarPorId(id);
        if (p == null) {
            System.out.println("Pedido não encontrado.");
        } else {
            try {
                StatusPedido novo = StatusPedido.valueOf(texto);   // String → enum (Aula 06)
                p.alterarStatus(novo);
                System.out.println("Status alterado: " + p);
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido: " + texto);
            } catch (PedidoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    static void processarPedidos() {
        Iterator<Pedido> it = pedidos.iterator();
        while (it.hasNext()) {
            Pedido p = it.next();
            try {
                p.processarPedido();
            } catch (PedidoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    static void removerCancelados() {
        Iterator<Pedido> it = pedidos.iterator();   // iterator NOVO
        int removidos = 0;
        while (it.hasNext()) {
            Pedido p = it.next();
            if (p.getStatus() == StatusPedido.CANCELADO) {
                it.remove();
                removidos++;
            }
        }
        System.out.println(removidos + " pedido(s) cancelado(s) removido(s).");
    }

    static void exibirPedidos() {
        for (Pedido p : pedidos) {
            if (p.getStatus() != StatusPedido.CANCELADO) {
                System.out.println(p);
            }
        }
    }

    static void exibirEntregaveis() {
        for (Pedido p : pedidos) {
            if (p instanceof Entregavel) {
                Entregavel e = (Entregavel) p;   // downcasting pra interface
                System.out.println(p + " | frete: R$" + e.calcularFrete());
            }
        }
    }
}