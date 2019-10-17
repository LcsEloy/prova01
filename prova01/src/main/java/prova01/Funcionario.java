package prova01;

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
        return this.cargo = cargo;
    }

    private void verificaCargoNuloOuEmBranco(String cargo) {
        if (cargo == null || cargo.isEmpty() || cargo.equals(" ")) {
            throw new NullPointerException("O cargo não deve ser nulo ou vazio.");
        }
    }

    public Double getSalario() {
        return salario;
    }

    public Double setSalario(Double salario) {
        return this.salario = salario;
    }

}
