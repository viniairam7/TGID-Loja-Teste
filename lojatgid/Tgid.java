package lojatgid;

import java.util.ArrayList;
import java.util.List;
import lojatgid.exceptions.CpfException;
import lojatgid.exceptions.CpfExceptionII;
import lojatgid.exceptions.EstoqueException;
import lojatgid.exceptions.ProdutoException;
import lojatgid.exceptions.TelefoneException;

public class Tgid {
    public static void main(String[] args) throws CpfException, TelefoneException, CpfExceptionII, ProdutoException, EstoqueException {
        
        Loja loja = new Loja("Loja TGID");
        System.out.println("Bem-vindo à " + loja.getNome());

        // adcionar produtos 
        Produto produto1 = new Produto("Produto A", 100.0, 10);
        Produto produto2 = new Produto("Produto B", 50.0, 20);
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        // cadastrar usuario
        Usuario usuario1 = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "(11)98228-8228", "Rua Alves de Souza, 22 - Osasco");
        loja.cadastrarUsuario(usuario1);

        // criando item de venda
        ItemVenda item1 = new ItemVenda(produto1.getNome(), produto1.getPrecoRS(), produto1.getQuantidade(), 2);  // 2 unidades do Produto A
        ItemVenda item2 = new ItemVenda(produto2.getNome(), produto2.getPrecoRS(), produto2.getQuantidade(), 1);  // 1 unidade do Produto B

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
