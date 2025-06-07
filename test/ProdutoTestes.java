import lojatgid.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTestes {

    @Test
    public void testDiminuirEstoque() {
        Produto produto = new Produto("Produto A", 100.0, 10);

        produto.diminuirEstoque(3);
        assertEquals(7, produto.getQuantidade(), "O estoque do produto deve diminuir após a venda");

        produto.diminuirEstoque(10);
        assertEquals(7, produto.getQuantidade(), "Não pode diminuir o estoque além do limite");
    }
}
