package EstudosJV;
import java.util.Iterator;
import java.util.ArrayList;

public class EstudosJS {

    public static void main(String[] args) {
        
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Daniell");
        pessoas.add("Thiago Guerra");
        pessoas.add("Matheus");

        Iterator<String> it = pessoas.iterator();

        while (it.hasNext()){
            String pessoa = it.next();

            if (pessoa.equals("Daniell")){
                it.remove();
            }
        }

        System.out.println(pessoas);


    }
    
}
