package POO6;

public class Aula {

    private String titulo;
    private int tempo;
    private String dificuldade;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulonovo){
        this.titulo = titulonovo;
    }
    
    public int getTempo(){
        return tempo;
    }

    public void setTempo(int temponovo){
        this.tempo = temponovo;
    }

    public String getDificuldade(){
        return dificuldade;
    }

    public void setDificuldade( String dificuldadenova){
        this.dificuldade = dificuldadenova;
    }

    public void imprimiInfosAula(){

        System.out.println(titulo);
        System.out.println(tempo);
        System.out.println(dificuldade);
    }
}


