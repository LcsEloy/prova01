package prova01;

public class Cliente extends Pessoa {

    private String login;

    private String senha;

    public Cliente(String nome, String sobrenome, String email, String cpf, Telefone telefone, String login, String senha) {
        super(nome, sobrenome, email, cpf, telefone);
        this.login = setLogin(login);
        this.senha = setSenha(senha);
    }

    public String getLogin() {
        return login;
    }

    public String setLogin(String login) {
        verificaTamanhoLoginValido(login);
        verificaLoginApenasNumerosLetras(login);
        return this.login = login;
    }

    private void verificaTamanhoLoginValido(String login) {
        if (login.length() < 3 && login.length() > 12) {
            throw new IllegalArgumentException("O login deve conter entre 3 e 12 caracteres.");
        }
    }

    private void verificaLoginApenasNumerosLetras(String login) {
        for (int i = 0; i < login.length(); i++) {
            if (Character.isAlphabetic(i) || Character.isDigit(i)) {
                throw new IllegalArgumentException("O login deve conter apenas letras e números.");
            }
        }
    }

    public String getSenha() {
        return senha;
    }

    public String setSenha(String senha) {
        verificaTamanhoSenhaValido(senha);
        verificaSenhaApenasNumerosLetras(senha);
        return this.senha = senha;
    }

    private void verificaSenhaApenasNumerosLetras(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (!Character.isAlphabetic(i) && !Character.isDigit(i)) {
                throw new IllegalArgumentException("A senha deve conter letras e números.");
            }
        }
    }

    private void verificaTamanhoSenhaValido(String senha) {
        if (senha.length() < 6 && senha.length() > 10) {
            throw new IllegalArgumentException("A senha deve conter entre 6 e 10 caracteres.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Cliente other = (Cliente) obj;
        if (!getCpf().equals(other.getCpf()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getCpf().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dados do Cliente: " + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nEmail: " + getEmail() + "\nTelefone: " + telefone + "\nCpf: " +
            getCpf();
    }

}
