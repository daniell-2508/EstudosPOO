package POO8;

import java.time.LocalDate;

import java.time.Period;

public class Aluno {

    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private double coragem;
    private double inteligencia;
    private double lealdade;
    private double ambicao;
    private double estrategia;
    private double criatividade;
    private String casa;
    private String codigoMatricula;
    private LocalDate data_nascimento;
    


    //CONSTRUTOR
    public Aluno(String nome, int idade, double coragem, double inteligencia, double lealdade, double ambicao, double estrategia, double criatividade, String sobrenome, LocalDate data_nascimento){
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
        this.coragem = coragem;
        this.inteligencia= inteligencia;
        this.lealdade = lealdade;
        this.ambicao = ambicao;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        
    }

    //METODOS
    public void exibirInformacoes(){

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(calcularIdade());
        System.out.println(coragem);
        System.out.println(inteligencia);
        System.out.println(lealdade);
        System.out.println(ambicao);
        System.out.println(casa);

    }

    public double grifinoria(){
        return ((2 * coragem) + lealdade);
    }
    public double sonserina(){
        return ((2 * ambicao) + estrategia);
    }
    public double corvinal(){
        return ((2 * inteligencia) + criatividade);

    }
    public double lufalufa(){
        return (((2 * lealdade) + coragem) / 3);
    }

    public void calcularCasa(){
        
        if (grifinoria() >= sonserina() && grifinoria() >= corvinal() && grifinoria() >= lufalufa()) {
            casa = "Grifinoria";
        }
        else if (sonserina() >= grifinoria() && sonserina() >= corvinal() && sonserina() >= lufalufa()){
            casa = "Sonserina";
        }
        else if (corvinal() >= grifinoria() && corvinal() >= sonserina() && corvinal() >= lufalufa()){
            casa = "Corvinal";
        }
        else if (lufalufa() >= grifinoria() && lufalufa() >= sonserina() && lufalufa() >= corvinal()){
            casa = "Lufa-Lufa";
        }
    }

    public String formatarCasa(){

            return casa.toUpperCase();
    }

    public String gerarNome(){
        char inicial = nome.charAt(0);
        return (inicial + sobrenome).toLowerCase();
    }

    public boolean verificarCasa(String casaTestada){
        if (casa.equalsIgnoreCase(casaTestada)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verificarSobrenome(String sobrenomeTestado){

        return sobrenome.toLowerCase().contains(sobrenomeTestado.toLowerCase());
    }

    public int calcularIdade(){
        int idade = Period.between(data_nascimento,LocalDate.now()).getYears();
        return idade;
    }

    public boolean verificarMaioridade(){

        if (calcularIdade() >= 17){
            return true;
        }
        else{
            return false;
        }
    }

    public String gerarCodigo(int posicaoCadastro) {
    char inicialNome = Character.toUpperCase(nome.charAt(0));
    char inicialSobrenome = Character.toUpperCase(sobrenome.charAt(0));

    String codigoMatricula = "";

    codigoMatricula += inicialNome;
    codigoMatricula += inicialSobrenome;
    codigoMatricula += "-";
    codigoMatricula += LocalDate.now().getYear();
    codigoMatricula += "-";
    codigoMatricula += String.format("%02d", posicaoCadastro);

    return codigoMatricula;

    }





    }

