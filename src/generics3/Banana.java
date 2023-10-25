package generics3;

public class Banana extends ProdutoX {

    private String tipo;

    public Banana() {
    }

    public Banana(double valor, int quantidade, String tipo) {
        super(valor, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Banana [valor=" + super.getValor() + ", quantidade=" + super.getQuantidade() + ", tipo=" + tipo + "]";
    }

}
