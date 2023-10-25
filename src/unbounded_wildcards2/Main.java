package unbounded_wildcards2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Object objeto = "Oi!";
        System.out.println(objeto);

        if (objeto instanceof List<?>) {
            System.out.println("Verdadeiro!");
        } else {
            System.out.println("Falso!");
        }

        List<String> lista = new ArrayList<>();
        lista.add("Oi");
        objeto = lista;
        System.out.println(objeto);

        if (objeto instanceof List<?>) {
            System.out.println("Verdadeiro!");
        } else {
            System.out.println("Falso!");
        }
        
    }
    
}
