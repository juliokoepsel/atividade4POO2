package generics2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Produto<Integer> produto1 = new Produto<>(001, 10.5, LocalDate.now(), LocalDate.now().plusMonths(1));

        Produto<String> produto2 = new Produto<>("A002", 10.5, LocalDate.now(), LocalDate.now().plusMonths(1));

        System.out.println(produto1 + " (" + produto1.getId().getClass() + ")");

        System.out.println(produto2 + " (" + produto2.getId().getClass() + ")");

    }
}
