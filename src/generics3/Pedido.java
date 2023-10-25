package generics3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {
    
    private LocalDate data;
    private List<T> produtos;
    
    public Pedido() {
        produtos = new ArrayList<>();
    }

    public Pedido(LocalDate data, List<T> produtos) {
        this.data = data;
        if (produtos == null)
            this.produtos = new ArrayList<>();
        else
            this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<T> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<T> produtos) {
        this.produtos = produtos;
    }

    public boolean adicionar(T produto) {
        return produtos.add(produto);
    }

    public void mostrar() {
        if (produtos.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Lista:");
            for (ProdutoX p : produtos) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Pedido [data=" + data + "]";
    }

}
