package prova01;

public class Cliente extends Pessoa {

    private String id;

    private String login;

    private String senha;

    public Cliente(String nome, String sobrenome, String email, String cpf, String id, String login, String senha) {
        super(nome, sobrenome, email, cpf);
        this.id = setId(id);
        this.login = setLogin(login);
        this.senha = setSenha(senha);
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        return this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String setLogin(String login) {
        return this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public String setSenha(String senha) {
        return this.senha = senha;
    }

    @Override
    public boolean equals(Object obj) {
        Cliente other = (Cliente) obj;
        if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dados do Cliente: " + "\nLogin: " + login + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nEmail: " + getEmail() + "\nCpf: " +
            getCpf();
    }

}
