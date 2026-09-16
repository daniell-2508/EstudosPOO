public class Exercicio {

    private String nome;
    private int serie;
    private int repeticao;

    // Getters and Setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nomenovo){
        this.nome = nomenovo;
    }

    public int getSerie(){
        return serie;
    }

    public void setSerie(int serienova){
        this.serie = serienova;
    }

    public int getRepeticao(){
        return repeticao;
    }

    public void setRepeticao(int repeticaonova){
        this.repeticao = repeticaonova;
    }

    public void exibirInfosExercicio(){
        System.out.println(nome);
        System.out.println(serie);
        System.out.println(repeticao);
    }

    public boolean verificarCondicaoExercicio(int serieTestar, int repeticaoTestar){
        if ((serie == serieTestar) && (repeticao == repeticaoTestar)){
            return  true;
        }
        return false;
    }

    
}   