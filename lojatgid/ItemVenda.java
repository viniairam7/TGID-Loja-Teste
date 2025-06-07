package lojatgid;
public class ItemVenda extends Produto {
    private int quantidadeVendida;

    public ItemVenda(String nome, double preco, int quantidadeEstoque, int quantidadeVendida) {
        // acionar o construtor da classe Produto
        super(nome, preco, quantidadeEstoque);
        this.quantidadeVendida = quantidadeVendida;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    
    @Override
    public void diminuirEstoque(int quantidade) {
        if (super.getQuantidade() >= quantidade) {
            super.diminuirEstoque(quantidade);  
        }
    }

    
    public double getTotal() {
        return getPrecoRS() * quantidadeVendida;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
               "produto:" + getNome() +  
               ", quantidadeVendida:" + quantidadeVendida + 
               ", total:" + getTotal() + '}';
    }
}
