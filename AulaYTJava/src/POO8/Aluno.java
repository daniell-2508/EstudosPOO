package POO8;



public class Aluno {

    //ATRIBUTOS
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double lealdade;
    private double ambicao;
    private String casa;

    //CONSTRUTOR
    public Aluno(String nome, int idade, double coragem, double inteligencia, double lealdade, double ambicao, String casa){
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia= inteligencia;
        this.lealdade = lealdade;
        this.ambicao = ambicao;
        this.casa = casa;
    }

    //METODOS
    public void exibirInformacoes(){
        System.out.println(nome);

        System.out.println(idade);
        System.out.println(coragem);
        System.out.println(inteligencia);
        System.out.println(lealdade);
        System.out.println(ambicao);
        System.out.println(casa);

    }

    public double grifinoria(){
        return ((2 * coragem) + lealdade);
    }
    public double sonserina(double ambicao, double estrategia){
        return ((2 * ambicao) + estrategia);
    }
    public double corvinal(double criatividade){
        return ((2 * inteligencia) + criatividade);

    }
    public double lufalufa(){
        return (((2 * lealdade) + coragem) / 3);
    }

    public String calcularCasa(){
        if ()

    }
}
