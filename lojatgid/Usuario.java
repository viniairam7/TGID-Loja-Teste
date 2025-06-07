package lojatgid;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;

    public Usuario(String nome, String cpf, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Usuario:" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", email='" + email + '\'' + ", residente='" + endereco + '\'' + '}';
    }
}
