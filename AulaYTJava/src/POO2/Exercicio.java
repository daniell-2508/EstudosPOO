package POO2;

public class Exercicio {
    
    private String nome;
    private int serie;
    private int repeticao;

    public boolean testar(int series, int repeticoes){

        return series == serie && repeticoes == repeticao;

    }

    public void imprimirdados(){

        System.out.println(nome);
        System.out.println(serie);
        System.out.println(repeticao);
    }



}
