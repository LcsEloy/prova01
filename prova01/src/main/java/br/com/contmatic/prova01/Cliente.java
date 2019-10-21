package br.com.contmatic.prova01;

public class Cliente extends Pessoa {

    public Cliente(String nome, String sobrenome, String email, String cpf, Telefone telefone) {
        super(nome, sobrenome, email, cpf, telefone);
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
