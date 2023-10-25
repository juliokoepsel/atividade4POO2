package generics1;

public class MeuDado<T> {
    
    private T dado;

    public MeuDado() {
    }

    public MeuDado(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "MeuDado [dado=" + dado + "]";
    }

}
