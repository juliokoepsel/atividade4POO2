package lower_bounded_wildcards1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void adicionarTresNumerosInteirosAleatorios(List<? super Integer> lista) {
        Random rn = new Random();
        for (int i = 1; i <= 3; i++) {
            lista.add(rn.nextInt());
        }
    }

    public static void main(String[] args) {

        List<Number> numeros = new ArrayList<>();

        numeros.add(25.32);
        numeros.add(2.2);

        adicionarTresNumerosInteirosAleatorios(numeros);

        System.out.println(numeros);
    }

}
