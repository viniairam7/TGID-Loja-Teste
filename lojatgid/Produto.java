package lojatgid;

public class Produto {
    private String objeto;
    private double preco;
    private int quantidade;

    public Produto(String objeto, double preco, int quantidade) {
        this.objeto = objeto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getObjeto() {
        return objeto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        }
    }

    @Override
    public String toString() {
        return "Produto:" + "nome='" + objeto + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}