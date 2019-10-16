package prova01;

public class Telefone {
    
    private Integer ddd;
    private Long numero;
    private String tipo;
    
    public Telefone(Integer ddd, Long numero, String tipo) {
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
    public Long getNumero() {
        return numero;
    }
    public Long setNumero(Long numero) {
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
    
}
