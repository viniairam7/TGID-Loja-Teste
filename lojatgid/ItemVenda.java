package lojatgid;

public class ItemVenda extends Produto {
    private int quantidadeVendida;

    public ItemVenda(String objeto, double preco, int quantidadeEstoque, int quantidadeVendida) {
        // aciona o construtor da classe Produto // 
        super(objeto, preco, quantidadeEstoque);
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
        // pode ser verificado a quantidade de produto //
        if (super.getQuantidade() >= quantidade) {
            super.diminuirEstoque(quantidade);
        }
    }

    
    public double getTotal() {
        return getPreco() * quantidadeVendida;
    }
       // calcula o total do item em relação ao preço e quantidade //
    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + getObjeto() + 
                ", quantidadeVendida=" + quantidadeVendida + 
                ", total=" + getTotal() + '}';
    }
}
