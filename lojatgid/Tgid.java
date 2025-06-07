package lojatgid;

import java.util.ArrayList;
import java.util.List;

public class Tgid {
    public static void main(String[] args) {
        
        Loja loja = new Loja();

        // adcionar produtos 
        Produto produto1 = new Produto("Produto A", 100.0, 10);
        Produto produto2 = new Produto("Produto B", 50.0, 20);
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        // cadastrar usuario
        Usuario usuario1 = new Usuario("João", "123.456.789-00", "joao@email.com", "Rua Alves de Souza, 22 - Osasco");
        loja.cadastrarUsuario(usuario1);

        // criando item de venda
        ItemVenda item1 = new ItemVenda(produto1.getNome(), produto1.getPreco(), produto1.getQuantidade(), 2);  // 2 unidades do Produto A
        ItemVenda item2 = new ItemVenda(produto2.getNome(), produto2.getPreco(), produto2.getQuantidade(), 1);  // 1 unidade do Produto B

        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(item1);
        itensVenda.add(item2);

        // realizando a venda
        loja.realizarVenda(usuario1, itensVenda);

        // resultados da venda
        loja.exibirResumoVendas();

        // estoque
        loja.exibirEstoque();
    }
}
