import java.util.ArrayList;
import java.util.List;
import lojatgid.ItemVenda;
import lojatgid.Produto;
import lojatgid.Usuario;
import lojatgid.Venda;
import lojatgid.exceptions.CpfException;
import lojatgid.exceptions.CpfExceptionII;
import lojatgid.exceptions.TelefoneException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTestes {

    @Test
    public void testTotalVenda() throws CpfException, TelefoneException, CpfExceptionII {
        Produto produto1 = new Produto("Produto A", 100.0, 10);
        Produto produto2 = new Produto("Produto B", 50.0, 20);

        ItemVenda item1 = new ItemVenda(produto1.getNome(), produto1.getPrecoRS(), produto1.getQuantidade(), 2);  // 2 unidades
        ItemVenda item2 = new ItemVenda(produto2.getNome(), produto2.getPrecoRS(), produto2.getQuantidade(), 1);  // 1 unidade

        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(item1);
        itensVenda.add(item2);

        Usuario usuario = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "11982288228", "Rua Alves de Souza, 22 - Osasco");

        Venda venda = new Venda(usuario, itensVenda);

        assertEquals(250.0, venda.getTotal(), "O total da venda deve ser 250.0");
    }
}
