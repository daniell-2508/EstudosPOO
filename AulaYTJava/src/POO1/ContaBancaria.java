package POO1;

public class ContaBancaria {

    // Atributos da Classe

    String nome;
    double saldo;
    int movimentacoes;

    // Métodos da Classe

    public void depositar(double quantidade){

        System.out.println("Seu novo saldo após o deposito é: " + (saldo + quantidade));
        saldo += quantidade;
        movimentacoes++;
        
    }

    public void sacar(double quantidade){
        if (saldo < quantidade){
            System.out.println("Saldo indisponivel para saque! ");
        }
        else {
            System.out.println("Seu novo saldo após o saque é: " + (saldo - quantidade));
            saldo -= quantidade;

        }

        movimentacoes++;
    }

    public void ExibirInfos(){

        System.out.println("Nome do/a cliente: " + nome);
        System.out.println("Saldo do/a " + nome + ": " + saldo);
        System.out.println("Durante esse programa ele fez " + movimentacoes + " movimentacoes");

    }


}
