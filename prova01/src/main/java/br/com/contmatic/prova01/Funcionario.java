package br.com.contmatic.prova01;

public class Funcionario extends Pessoa {

    private String cargo;

    private Double salario;

    public Funcionario(String nome, String sobrenome, String email, String cpf, Telefone telefone, String cargo, Double salario) {
        super(nome, sobrenome, email, cpf, telefone);
        this.cargo = setCargo(cargo);
        this.salario = setSalario(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {
        verificaCargoNuloOuEmBranco(cargo);
        verificaCargoLetrasIguais(cargo);
        verificaCargoComNumeros(cargo);
        return this.cargo = cargo;
    }

    private void verificaCargoComNumeros(String cargo) {
        for(int i = 0 ; i < cargo.length() ; i++) {
            if (Character.isDigit(cargo.charAt(i))) {
                throw new IllegalArgumentException("O Cargo deve ser composto apenas por letras.");
            }
        }
    }

    private void verificaCargoNuloOuEmBranco(String cargo) {
        if (cargo == null || cargo.isEmpty() || cargo.equals(" ")) {
            throw new NullPointerException("O cargo não deve ser nulo ou vazio.");
        }
    }

    private void verificaCargoLetrasIguais(String cargo) {
        String temp = cargo.toLowerCase();
        char primeiraLetra = temp.charAt(0);
        int letrasRepetidas = 0;
        for(int i = 0 ; i < cargo.length() - 1 ; i++) {
            if (primeiraLetra == temp.charAt(i + 1))
                letrasRepetidas++;
        }
        if (letrasRepetidas == cargo.length() - 1) {
            throw new IllegalArgumentException("O Cargo não pode ser composto unicamente pelo mesmo caractere.");
        }
    }

    public Double getSalario() {
        return salario;
    }

    public Double setSalario(Double salario) {
        verificaSalarioNuloOuZerado(salario);
        verificaSalarioNegativo(salario);
        return this.salario = salario;
    }

    private void verificaSalarioNegativo(Double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que 0.");
        }
    }

    private void verificaSalarioNuloOuZerado(Double salario) {
        if (salario == null || salario.equals(0.0)) {
            throw new NullPointerException("O salário não deve ser nulo ou vazio.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Funcionario other = (Funcionario) obj;
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
        return "Dados do Funcionario: " + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nCargo: " + cargo + "\nSalário: " + salario + "\nEmail: " + getEmail() + "\nTelefone: " +
            telefone;
    }

}
