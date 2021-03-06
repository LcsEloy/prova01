package br.com.contmatic.empresa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {

    private static final String FORMATO_DE_EMAIL_VALIDO = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";

    private static final int TAMANHO_MAXIMO_SOBRENOME = 30;

    private static final int TAMANHO_MAXIMO_NOME = 15;

    private String nome;

    private String sobrenome;

    private String email;

    private String cpf;

    private Telefone telefone;

    public Cliente(String nome, String sobrenome, String email, String cpf, Telefone telefone) {
        this.nome = setNome(nome);
        this.sobrenome = setSobrenome(sobrenome);
        this.email = setEmail(email);
        this.cpf = setCpf(cpf);
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        verificaNomeNuloOuEmBranco(nome);
        verificaNomeTamanhoValido(nome);
        verificaNomeCompostoApenasPorLetras(nome);
        verificaNomeCompostoApenasPorUmaLetraRepetida(nome);
        return this.nome = nome;
    }

    private void verificaNomeNuloOuEmBranco(String nome) {
        if (nome == null || nome.isEmpty() || nome.equals(" ")) {
            throw new IllegalArgumentException("O Nome não deve ser nulo ou vazio.");
        }
    }

    private void verificaNomeTamanhoValido(String nome) {
        if (nome.length() > TAMANHO_MAXIMO_NOME) {
            throw new IllegalArgumentException("O nome contém muitos caracteres.");
        }
    }

    private void verificaNomeCompostoApenasPorLetras(String nome) {
        for(int i = 0 ; i < nome.length() ; i++) {
            if (Character.isDigit(nome.charAt(i))) {
                throw new IllegalArgumentException("O Nome deve ser composto apenas por letras.");
            }
        }
    }

    private void verificaNomeCompostoApenasPorUmaLetraRepetida(String nome) {
        String temp = nome.toLowerCase();
        char primeiraLetra = temp.charAt(0);
        int letrasRepetidas = 0;
        letrasRepetidas = veirficaLetrasRepetidas(nome, temp, primeiraLetra, letrasRepetidas);
        lancaExcecaoCasoLetrasForemRepetidas(nome, letrasRepetidas);
    }

    private void lancaExcecaoCasoLetrasForemRepetidas(String nome, int letrasRepetidas) {
        if (letrasRepetidas == nome.length() - 1) {
            throw new IllegalArgumentException("Não pode ser composto unicamente pelo mesmo caractere.");
        }
    }

    private int veirficaLetrasRepetidas(String nome, String temp, char primeiraLetra, int letrasRepetidas) {
        for(int i = 0 ; i < nome.length() - 1 ; i++) {
            if (primeiraLetra == temp.charAt(i + 1))
                letrasRepetidas++;
        }
        return letrasRepetidas;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String setSobrenome(String sobrenome) {
        verificaSobrenomeNuloOuEmBranco(sobrenome);
        verificaSobrenomeTamanhoValido(sobrenome);
        verificaSobrenomeCompostoApenasPorLetras(sobrenome);
        verificaSobrenomeCompostoApenasPorUmaLetraRepetida(sobrenome);
        return this.sobrenome = sobrenome;
    }

    private void verificaSobrenomeNuloOuEmBranco(String sobrenome) {
        if (sobrenome == null || sobrenome.isEmpty() || sobrenome.equals(" ")) {
            throw new IllegalArgumentException("O sobrenome não deve ser nulo ou vazio.");
        }
    }

    private void verificaSobrenomeTamanhoValido(String sobrenome) {
        if (sobrenome.length() > TAMANHO_MAXIMO_SOBRENOME) {
            throw new IllegalArgumentException("O sobrenome contém muitos caracteres.");
        }
    }

    private void verificaSobrenomeCompostoApenasPorLetras(String sobrenome) {
        for(int i = 0 ; i < sobrenome.length() ; i++) {
            if (Character.isDigit(sobrenome.charAt(i))) {
                throw new IllegalArgumentException("O sobrenome deve ser composto apenas por letras.");
            }
        }
    }

    private void verificaSobrenomeCompostoApenasPorUmaLetraRepetida(String sobrenome) {
        String temp = sobrenome.toLowerCase();
        char primeiraLetra = temp.charAt(0);
        int letrasRepetidas = 0;
        letrasRepetidas = veirficaLetrasRepetidas(sobrenome, temp, primeiraLetra, letrasRepetidas);
        lancaExcecaoCasoLetrasForemRepetidas(sobrenome, letrasRepetidas);
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        verificaEmailNuloOuEmBranco(email);
        verificaEmailValido(email);
        return this.email = email;
    }

    private void verificaEmailValido(String email) {
        if (!isEmailValido(email)) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    private void verificaEmailNuloOuEmBranco(String email) {
        if (email == null || email.isEmpty() || email.equals(" ")) {
            throw new IllegalArgumentException("O Email não deve ser nulo ou vazio.");
        }
    }

    public static boolean isEmailValido(String email) {
        boolean emailValido = false;
        String enderecoEmailValido = FORMATO_DE_EMAIL_VALIDO;
        Pattern modeloEmail = Pattern.compile(enderecoEmailValido, Pattern.CASE_INSENSITIVE);
        Matcher validaCombinacao = modeloEmail.matcher(email);
        emailValido = confirmaEmailValido(emailValido, validaCombinacao);
        return emailValido;
    }

    private static boolean confirmaEmailValido(boolean emailValido, Matcher validaCombinacao) {
        if (validaCombinacao.matches()) {
            emailValido = true;
        }
        return emailValido;
    }

    public String getCpf() {
        return cpf;
    }

    public String setCpf(String cpf) {
        verificaCpfInvalido(cpf);
        verificaCpfValido(cpf);
        return this.cpf = cpf;
    }

    private void verificaCpfInvalido(String cpf) {
        if (!ValidadorCpfCnpj.isCpfValido(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    private void verificaCpfValido(String cpf) {
        ValidadorCpfCnpj.isCpfValido(cpf);
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
        return "Dados do Cliente: " + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nEmail: " + getEmail() + "\nTelefone: " + telefone + "\nCpf: " + getCpf();
    }

}
