package lojatgid;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public List<Produto> produtos;  
    private List<Usuario> usuarios;  
    private List<Venda> vendas;      

    
    public Loja() {
        this.produtos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    
    public Produto buscarProdutoPorNome(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {  
                return produto;
            }
        }
        return null;  
    }

    
    public void realizarVenda(Usuario usuario, List<ItemVenda> itensVenda) {
        
        for (ItemVenda item : itensVenda) {
            if (item.getQuantidade() > item.getQuantidade()) {
                System.out.println("Estoque insuficiente para o produto: " + item.getNome());
                return;  
            }
        }

        
        for (ItemVenda item : itensVenda) {
            item.diminuirEstoque(item.getQuantidade());  
        }

        
        Venda venda = new Venda(usuario, itensVenda);
        vendas.add(venda);  

        
    }

    
    public void exibirResumoVendas() {
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }

   
    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
