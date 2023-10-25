package generics3;

public abstract class ProdutoX {
    
    private double valor;
    private int quantidade;
    
    public ProdutoX() {
    }

    public ProdutoX(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoX [valor=" + valor + ", quantidade=" + quantidade + "]";
    }
    
}
