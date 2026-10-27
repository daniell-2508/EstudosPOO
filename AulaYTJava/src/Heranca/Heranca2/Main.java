package Heranca.Heranca2;

public class Main {
    public static void main(String[] args) {
        Impressora3D impressora = new Impressora3D();
        impressora.estado = EstadoEquipamento.DISPONIVEL;

        CortadoraLaser cortadora = new CortadoraLaser();
        cortadora.estado = EstadoEquipamento.EM_USO;

        Scanner3D scanner = new Scanner3D();
        scanner.estado = EstadoEquipamento.INATIVO;

        Estoque estoque = new Estoque();
        estoque.adicionar(impressora);
        estoque.adicionar(cortadora);
        estoque.adicionar(scanner);

        try {
            impressora.executar();   // funciona
            cortadora.executar();    // lança exceção (está EM_USO)
        } catch (EquipamentoIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        try {
            cortadora.calibrar();    // lança exceção (está EM_USO)
        } catch (EquipamentoIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        estoque.removerInativos();   // remove o scanner
    }
}