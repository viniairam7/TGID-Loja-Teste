package lojatgid;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import lojatgid.exceptions.CpfException;
import lojatgid.exceptions.CpfExceptionII;
import lojatgid.exceptions.EstoqueException;
import lojatgid.exceptions.ProdutoException;
import lojatgid.exceptions.TelefoneException;

public class Tgid {

    public static void main(String[] args) throws CpfException, TelefoneException, CpfExceptionII, ProdutoException, EstoqueException {
        
        // dados para conexão de banco de dados
        String url = "jdbc:mysql://localhost:3306/loja_tgid"; 
        String usuario = "root";  
        String senha = "xxxxxxxxx"; 
        
      
        try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

          
            String sqlInsert = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sqlInsert)) {
                stmt.setString(1, "Produto A");
                stmt.setDouble(2, 100.0);
                stmt.setInt(3, 10);
                stmt.executeUpdate();
                System.out.println("Produto inserido com sucesso.");
            } //intrução para adicionar

            
            String sqlSelect = "SELECT * FROM produtos";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sqlSelect)) {
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    double preco = rs.getDouble("preco");
                    int quantidade = rs.getInt("quantidade");
                    System.out.println("Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
                } // como consultar
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //O CÓDIGO APÓS CONEXÃO COMEÇA AQUI
        Loja loja = new Loja("Loja TGID");
        System.out.println("Bem-vindo à " + loja.getNome());

        // Adicionar produtos 
        Produto produto1 = new Produto("Produto A", 100.0, 10);
        Produto produto2 = new Produto("Produto B", 50.0, 20);
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        // Cadastrar usuário
        Usuario usuario1 = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "(11)98228-8228", "Rua Alves de Souza, 22 - Osasco");
        loja.cadastrarUsuario(usuario1);

        // Criar itens
        ItemVenda item1 = new ItemVenda(produto1.getNome(), produto1.getPrecoRS(), produto1.getQuantidade(), 2);  // 2 unidades do Produto A
        ItemVenda item2 = new ItemVenda(produto2.getNome(), produto2.getPrecoRS(), produto2.getQuantidade(), 1);  // 1 unidade do Produto B

        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(item1);
        itensVenda.add(item2);

        // Realizar a venda
        loja.realizarVenda(usuario1, itensVenda);

        // Resultados da venda
        loja.exibirResumoVendas();

        // Exibir estoque
        loja.exibirEstoque();
    }
}

