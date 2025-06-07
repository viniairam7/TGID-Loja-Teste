package lojatgid;

import java.util.List;

public class Venda {
    private Usuario usuario;  
    private List<ItemVenda> itensVenda;  
    private double total;

    
    public Venda(Usuario usuario, List<ItemVenda> itensVenda) {
        this.usuario = usuario;
        this.itensVenda = itensVenda;
        calcularTotal();
    }

    
    private void calcularTotal() {
        total = 0;
        for (ItemVenda item : itensVenda) {
            total += item.getTotal(); // para calcular o total da venda, somando o valor de cada ItemVenda //
        }
    }

 
    public double getTotal() {
        return total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "usuario=" + usuario + ", itensVenda=" + itensVenda + ", total=" + total + '}';
    }
}
