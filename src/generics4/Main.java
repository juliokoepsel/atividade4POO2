package generics4;

public class Main {
    public static void main(String[] args) {
        
        Lista<String, Integer> lista = new Lista<>();

        if (lista.add("A", 1))
            System.out.println("Inserido na lista!");
        else
            System.out.println("Chave já existe na lista!");

        if (lista.add("A", 2))
            System.out.println("Inserido na lista!");
        else
            System.out.println("Chave já existe na lista!");

        System.out.println("Busca da chave A: " + lista.busca("A"));

        System.out.println("Busca da chave B: " + lista.busca("B"));

        System.out.println(lista);

    }
}
