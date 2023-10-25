package lower_bounded_wildcards2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean buscaNumeroInteiroEspecifico(List<? super Integer> lista, int inteiro) {
        return lista.contains(inteiro);
    }

    public static void main(String[] args) {

        List<Number> numeros = new ArrayList<>();

        numeros.add(37.888);
        numeros.add(3.1415);
        numeros.add(100);

        System.out.println(numeros);

        System.out.println(buscaNumeroInteiroEspecifico(numeros, 1));
        System.out.println(buscaNumeroInteiroEspecifico(numeros, 100));

    }

}
