import java.util.ArrayList;
import java.util.List;
import lojatgid.ItemVenda;
import lojatgid.Loja;
import lojatgid.Produto;
import lojatgid.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LojaTestes {

    @Test
    public void testAdicionarProduto() {
        Loja loja = new Loja();
        Produto produto = new Produto("Produto A", 100.0, 10);
        loja.adicionarProduto(produto);

        assertEquals(1, loja.produtos.size(), "A loja deve ter 1 produto");
    }

    @Test
    public void testCadastrarUsuario() {
        Loja loja = new Loja();
        Usuario usuario = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "Rua Alves de Souza, 22 - Osasco");
        loja.cadastrarUsuario(usuario);

        assertEquals(1, loja.usuarios.size(), "A loja deve ter 1 usuário cadastrado");
    }

    @Test
    public void testRealizarVenda() {
        Loja loja = new Loja();
        Produto produto = new Produto("Produto A", 100.0, 10);
        Usuario usuario = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "Rua Alves de Souza, 22 - Osasco");

        loja.adicionarProduto(produto);
        loja.cadastrarUsuario(usuario);

        ItemVenda itemVenda = new ItemVenda(produto.getNome(), produto.getPreco(), produto.getQuantidade(), 2);
        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(itemVenda);

        loja.realizarVenda(usuario, itensVenda);

        assertEquals(8, produto.getQuantidade(), "O estoque do produto deve ser atualizado após a venda");
    }
}
