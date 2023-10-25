package generics4;

import java.util.ArrayList;

public class Lista<K, V> {

    private class Estr<K, V> {
        private K chave;
        private V valor;

        Estr(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public K getChave() {
            return chave;
        }

        @Override
        public String toString() {
            return "Estr [chave=" + chave + ", valor=" + valor + "]";
        }
    }

    private ArrayList<Estr<K, V>> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public boolean add(K chave, V valor) {
        for (Estr<K, V> e : lista) {
            if (e.getChave().equals(chave)) {
                return false;
            }
        }
        lista.add(new Estr<>(chave, valor));
        return true;
    }

    public Estr<K, V> busca(K chave) {
        for (Estr<K, V> e : lista) {
            if (e.getChave().equals(chave)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Estr<K, V>> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estr<K, V>> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista [lista=" + lista + "]";
    }

}
