import lojatgid.ItemVenda;
import lojatgid.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemVendaTestes {

    @Test
    public void testTotalItemVenda() {
        Produto produto = new Produto("Produto A", 100.0, 10);
        ItemVenda item = new ItemVenda(produto.getNome(), produto.getPrecoRS(), produto.getQuantidade(), 2);  // 2 unidades

        assertEquals(200.0, item.getTotal(), "O total do item de venda deve ser 200.0");
    }
}
