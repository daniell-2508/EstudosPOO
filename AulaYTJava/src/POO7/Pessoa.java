package POO7;
import java.lang.Math;
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;

    // GETY E SET PARA OS ATRIBUSTOS:

    //NOME:

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    //SOBRENOME:

    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String novoSobrenome){
        this.sobrenome = novoSobrenome;
    }

    //IDADE:

    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    //ALTURA:

    public double getAltura(){
        return altura;
    }
    public void setAltura(double novaAltura){
        this.altura = novaAltura;
    }

    //PESO:

    public double getPeso(){
        return peso;
    }
    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }

    // CONSTRUOR:

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //MÉTODOS
    
    public double CalculaIMC(){
        double IMC;
        IMC = Math.round(peso / Math.pow(altura, 2));
        return IMC;
    }

    public void InformaObesidade(){
        double IMC;
        IMC = CalculaIMC();
        if (IMC < 18.5){
            System.out.println(nome + " " +  sobrenome + " está abaixo do peso, pois seu IMC é " + IMC + " a sua altura é " + altura + " e seu peso é " + peso+ "Kg");
        }
        if (IMC >= 18.5 && IMC < 25){
             System.out.println(nome + " " +  sobrenome + " está com um peso normal, pois seu IMC é " + IMC + " a sua altura é " + altura + " e seu peso é " + peso +"Kg");
        }
        if (IMC >= 25 && IMC < 30 ){
             System.out.println(nome + " " +  sobrenome + " está com sobrepeso, pois seu IMC é " + IMC + " a sua altura é " + altura + " e seu peso é " + peso + "Kg");
        }
        if (IMC >= 30 && IMC < 35){
             System.out.println(nome + " " + sobrenome + " está com obesidade grau 1, pois seu IMC é " + IMC + " a sua altura é " + altura + " e seu peso é " + peso+"Kg");
        }
        if (IMC >= 35 && IMC < 40){
             System.out.println(nome + " " + sobrenome + " está com obesidade grau 2, pois seu IMC é " + IMC + " a sua altura é " + altura + " e seu peso é " + peso + "Kg");
        }
        if (IMC >= 40){
             System.out.println(nome + " " + sobrenome + " está com obesidade grau 3, pois seu IMC é " + IMC + " a sua altura é " + altura + "m e seu peso é " + peso + "Kg");
        }
    }





}