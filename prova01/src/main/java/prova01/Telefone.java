package prova01;

public class Telefone {
    
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
        return this.ddd = ddd;
    }
    public Integer getNumero() {
        return numero;
    }
    public Integer setNumero(Integer numero) {
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
        if (!numero.equals(other.numero))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero + " / Tipo: " + tipo;
    }  
    
}
