package unbounded_wildcards1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void imprimeListaDeCoisas(List<?> lista) {
        for (Object coisa : lista) {
            System.out.println("Coisa: " + coisa);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("H");
        strings.add("I");
        strings.add("J");

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(30);

        imprimeListaDeCoisas(strings);
        System.out.println();
        imprimeListaDeCoisas(inteiros);
    }
    
}
