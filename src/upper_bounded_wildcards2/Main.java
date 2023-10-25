package upper_bounded_wildcards2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean somaIgualNumeroPar(List<? extends Number> lista) {
        double soma = 0.0;
        for (Number n : lista) {
            soma += n.doubleValue();
        }
        return soma % 2 == 0;
    }

    public static void main(String[] args) {

        int int1 = 1;
        int int2 = 20;
        int int3 = 35;

        List<Integer> ints = new ArrayList<>();
        ints.add(int1);
        ints.add(int2);
        ints.add(int3);

        System.out.println(somaIgualNumeroPar(ints));

        double double1 = 0.5;
        double double2 = 3.5;

        List<Double> doubles = new ArrayList<>();
        doubles.add(double1);
        doubles.add(double2);

        System.out.println(somaIgualNumeroPar(doubles));
        
    }
}
