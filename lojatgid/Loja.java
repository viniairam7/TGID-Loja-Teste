package lojatgid;

import java.util.ArrayList;
import java.util.List;
import lojatgid.exceptions.EstoqueException;
import lojatgid.exceptions.ProdutoException;

public class Loja {
    private String nome;
    public List<Produto> produtos;  
    public List<Usuario> usuarios;  
    private List<Venda> vendas;

    public Loja(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) throws ProdutoException {
        if (buscarProdutoPorNome(produto.getNome()) != null) {
            throw new ProdutoException("Produto já existe: " + produto.getNome());
        }
        produtos.add(produto);
    } // verificar se o produto já existe na loja

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Produto buscarProdutoPorNome(String nomeProduto) throws ProdutoException {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto;
            }
        }
        throw new ProdutoException("Produto não encontrado: " + nomeProduto);
    }

    public void realizarVenda(Usuario usuario, List<ItemVenda> itensVenda) throws EstoqueException, ProdutoException {
    
        for (ItemVenda item : itensVenda) {
            Produto produto = buscarProdutoPorNome(item.getNome());
            if (produto.getQuantidade() < item.getQuantidade()) {
                throw new EstoqueException("Estoque insuficiente para o produto: " + produto.getNome());
            }
        } // verificar estoque

    
        for (ItemVenda item : itensVenda) {
            Produto produto = buscarProdutoPorNome(item.getNome());
            produto.diminuirEstoque(item.getQuantidade());
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
