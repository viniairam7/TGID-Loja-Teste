import lojatgid.Usuario;
import lojatgid.exceptions.CpfException;
import lojatgid.exceptions.CpfExceptionII;
import lojatgid.exceptions.TelefoneException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTestes {

    @Test
    public void testGetters() throws CpfException, TelefoneException, CpfExceptionII {
        
        Usuario usuario = new Usuario("João", "123.456.789-00", "joao@email.com", "11982288228", "Rua Alves de Souza, 22 - Osasco");

        
        assertEquals("Vinicius", usuario.getNomeUser(), "O nome do usuário deve ser Vinicius");
        assertEquals("123.456.789-00", usuario.getCpf(), "O CPF do usuário deve ser 123.456.789-00");
        assertEquals("vini@email.com", usuario.getEmail(), "O email do usuário deve ser vini@email.com");
        assertEquals("Rua Alves de Souza, 22 - Osasco", usuario.getEndereco(), "O endereço do usuário deve ser Rua Alves de Souza, 22 - Osasco");
    }

    @Test
    public void testToString() throws CpfException, TelefoneException, CpfExceptionII {
        // Criando um usuário
        Usuario usuario = new Usuario("Vinicius", "123.456.789-00", "vini@email.com", "11982288228", "Rua Alves de Souza, 22 - Osasco");

        // Verificando se o método toString retorna a string correta
        String expected = "Usuario:" + "nome:'Vinicius', cpf:'123.456.789-00', email:'vini@email.com', residente: 'Rua Alves de Souza, 22 - Osasco'";
        assertEquals(expected, usuario.toString(), "O método toString deve retornar a representação correta do usuário");
    }
}
