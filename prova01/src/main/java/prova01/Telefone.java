package prova01;

public class Telefone {

    private static final int MAIOR_NUMERO_DDD = 99;

    private static final int MENOR_NUMERO_DDD = 11;

    private Integer ddd;

    private Integer numero;

    private String tipo;

    public Telefone(Integer ddd, Integer numero, String tipo) {
        this.ddd = setDdd(ddd);
        this.numero = setNumero(numero);
        this.tipo = setTipo(tipo);
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer setDdd(Integer ddd) {
        if (ddd == null) {
            throw new NullPointerException("O DDD não deve ser nulo.");
        }
        if (!(ddd >= MENOR_NUMERO_DDD && ddd <= MAIOR_NUMERO_DDD)) {
            throw new IllegalArgumentException("O DDD deve ser entre os números 11 e 99");
        }
        if (ddd.equals(20) || ddd.equals(23) || ddd.equals(25) || ddd.equals(26) || ddd.equals(29) || ddd.equals(30) || ddd.equals(36) || ddd.equals(39) || ddd.equals(40) || ddd.equals(50) ||
            ddd.equals(52) || ddd.equals(56) || ddd.equals(57) || ddd.equals(58) || ddd.equals(59) || ddd.equals(60) || ddd.equals(70) || ddd.equals(72) || ddd.equals(76) || ddd.equals(78) ||
            ddd.equals(80) || ddd.equals(90)) {
            throw new IllegalArgumentException("DDD inválido.");
        }
        return this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer setNumero(Integer numero) {
        if (numero == null) {
            throw new NullPointerException("O número não deve ser nulo.");
        }
        if (numero < 10000000 || numero > 999999999) {
            throw new IllegalArgumentException("O número deve conter entre 8 e 9 números.");
        }
        return this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        verificaTipoNuloOuEmBranco(tipo);
        return this.tipo = tipo;
    }

    private void verificaTipoNuloOuEmBranco(String tipo) {
        if (tipo == null || tipo.isEmpty() || tipo.equals(" ")) {
            throw new NullPointerException("O Tipo não deve ser nulo ou vazio.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Telefone other = (Telefone) obj;
        if (!ddd.equals(other.ddd)) {
            return false;
        }
        if (!numero.equals(other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ddd.hashCode();
        result = prime * result + numero.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero + " / Tipo: " + tipo;
    }

}
