package lojatgid;

public class Produto {
    private String nome;
    private double precoRS;
    private int quantidade;

    public Produto(String nome, double precoRS, int quantidade) {
        this.nome = nome;
        this.precoRS = precoRS;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoRS() {
        return precoRS;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para o produto " + nome);
        }
    }

    @Override
    public String toString() {
        return "Produto:" + "nome:'" + nome + '\'' + ", preco R$" + precoRS + ", quantidade=" + quantidade + '}';
    }
}