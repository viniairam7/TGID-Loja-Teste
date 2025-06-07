package lojatgid;

import lojatgid.exceptions.CpfException;
import lojatgid.exceptions.CpfExceptionII;
import lojatgid.exceptions.TelefoneException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String nomeUser;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    
    public Usuario(String nomeUser, String cpf, String email, String telefone, String endereco) 
            throws CpfException, TelefoneException, CpfExceptionII {
        
        
        if (isCpfCadastrado(cpf)) {
            throw new CpfExceptionII("Este CPF já está cadastrado: " + cpf);
        } // verificar se o CPF já está cadastrado (exemplo simplificado)

        
        if (!isCpfValido(cpf)) {
            throw new CpfException("CPF inválido: " + cpf);
        } // validar o CPF

       
        if (!isTelefoneValido(telefone)) {
            throw new TelefoneException ("Telefone inválido: " + telefone);
        }  // validar o telefone

        this.nomeUser = nomeUser;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

   
    private boolean isCpfValido(String cpf) {
        Pattern pattern = Pattern.compile("\\d{11}"); // verificar se tem exatamente 11 dígitos
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches(); // Retorna true se for válido, false se não
    }

    
    private boolean isCpfCadastrado(String cpf) {
        String[] cpfsCadastrados = {"12345678901", "98765432100"};
        
        for (String cpfCadastrado : cpfsCadastrados) {
            if (cpfCadastrado.equals(cpf)) {
                return true;  
            }
        }
        return false; 
    }

    
    private boolean isTelefoneValido(String telefone) {
        Pattern pattern = Pattern.compile("\\(\\d{2}\\) \\d{5}-\\d{4}"); 
        Matcher matcher = pattern.matcher(telefone);
        return matcher.matches(); // validar se o telefone está certo
    }

   
    public String getNomeUser() {
        return nomeUser;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario:" + "nome:'" + nomeUser + '\'' + ", cpf:'" + cpf + '\'' + ", email:'" + email + '\'' + ", telefone:'" + telefone + '\'' + ", residente:'" + endereco + '\'' + '}';
    }
}
