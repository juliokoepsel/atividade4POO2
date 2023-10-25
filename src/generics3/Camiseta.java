package generics3;

public class Camiseta extends ProdutoX {

    private String tamanho;
    private String cor;

    public Camiseta() {
    }

    public Camiseta(double valor, int quantidade, String tamanho, String cor) {
        super(valor, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Camiseta [valor=" + super.getValor() + ", quantidade=" + super.getQuantidade() + ", tamanho=" + tamanho + ", cor=" + cor + "]";
    }
    
}
