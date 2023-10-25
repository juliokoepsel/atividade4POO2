package generics3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Pedido<ProdutoX> pedido = new Pedido<>(LocalDate.now(), null);

        System.out.println(pedido);

        pedido.adicionar(new Banana(3.89, 2, "Nanica"));
        pedido.adicionar(new Camiseta(80.0, 1, "XG", "Azul Marinho"));

        pedido.mostrar();

    }
}
