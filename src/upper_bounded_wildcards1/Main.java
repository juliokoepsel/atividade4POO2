package upper_bounded_wildcards1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void ativarTodosOsDialogos(List<? extends Personagem> lista) {
        for (Personagem personagem : lista) {
            System.out.println(personagem.dialogo());
        }
    }

    public static void main(String[] args) {
        
        List<Amigo> amigos = new ArrayList<>();
        amigos.add(new Amigo());
        amigos.add(new Amigo());
        ativarTodosOsDialogos(amigos);

        System.out.println();

        List<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo());
        inimigos.add(new Inimigo());
        ativarTodosOsDialogos(inimigos);

    }
}
