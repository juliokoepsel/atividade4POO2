package generics1;

public class Objeto {
    
    private int chave;

    public Objeto() {
    }

    public Objeto(int chave) {
        this.chave = chave;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "Objeto [chave=" + chave + "]";
    }

}
