package generics1;

public class Main {
    public static void main(String[] args) throws Exception {
        
        MeuDado<Double> dadoDouble = new MeuDado<>(11.9);

        MeuDado<String> dadoString = new MeuDado<>("DADO");

        MeuDado<Objeto> dadoObjeto = new MeuDado<>(new Objeto(6));

        System.out.println(dadoDouble + " (" + dadoDouble.getDado().getClass() + ")");

        System.out.println(dadoString + " (" + dadoString.getDado().getClass() + ")");

        System.out.println(dadoObjeto + " (" + dadoObjeto.getDado().getClass() + ")");

    }
}
