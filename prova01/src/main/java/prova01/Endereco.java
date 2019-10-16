package prova01;

public class Endereco {

    private String logradouro;

    private String bairro;

    private String cep;

    private String municipio;

    private String uf;

    public Endereco(String logradouro, String bairro, String cep, String municipio, String uf) {
        this.logradouro = setLogradouro(logradouro);
        this.bairro = setBairro(bairro);
        this.cep = setCep(cep);
        this.municipio = setMunicipio(municipio);
        this.uf = setUf(uf);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String setLogradouro(String logradouro) {
        verificaLogradouroNuloOuEmBranco(logradouro);
        return this.logradouro = logradouro;
    }

    private void verificaLogradouroNuloOuEmBranco(String logradouro) {
        if (logradouro == null || logradouro.isEmpty() || logradouro.equals(" ")) {
            throw new NullPointerException("O logradouro não deve ser nulo ou vazio.");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public String setBairro(String bairro) {
        verificaBairroNuloOuEmBranco(bairro);
        return this.bairro = bairro;
    }

    private void verificaBairroNuloOuEmBranco(String bairro) {
        if (bairro == null || bairro.isEmpty() || bairro.equals(" ")) {
            throw new NullPointerException("O Bairro não deve ser nulo ou vazio");
        }
    }

    public String getCep() {
        return cep;
    }

    public String setCep(String cep) {
        verificaCepNuloOuEmBranco(cep);
        verificaCepComNumerosIguais(cep);
        verificaCepApenasComNumeros(cep);
        verificaCepTamanhoCorreto(cep);
        return this.cep = cep;
    }

    private void verificaCepTamanhoCorreto(String cep) {
        if (cep.length() != 8) {
            throw new IllegalArgumentException("O Cep deve conter 8 dígitos.");
        }
    }

    private void verificaCepApenasComNumeros(String cep) {
        for(int i = 0 ; i < cep.length() ; i++) {
            if (!Character.isDigit(cep.charAt(i))) {
                throw new IllegalArgumentException("O Cep deve ser composto apenas por números.");
            }
        }
    }

    private void verificaCepComNumerosIguais(String cep) {
        if (cep.equals("00000000") || cep.equals("11111111") || cep.equals("22222222") || cep.equals("33333333") || cep.equals("44444444") || cep.equals("55555555") || cep.equals("66666666") ||
            cep.equals("77777777") || cep.equals("88888888") || cep.equals("99999999")) {
            throw new IllegalArgumentException("O Cep não pode ser composto por números iguais.");
        }
    }

    private void verificaCepNuloOuEmBranco(String cep) {
        if (cep == null || cep.isEmpty() || cep.equals(" ")) {
            throw new NullPointerException("O CEP não deve ser nulo ou vazio");
        }
    }

    public String getMunicipio() {
        return municipio;
    }

    public String setMunicipio(String municipio) {
        verificaMunicipioNuloOuEmBranco(municipio);
        return this.municipio = municipio;
    }

    private void verificaMunicipioNuloOuEmBranco(String municipio) {
        if (municipio == null || municipio.isEmpty() || municipio.equals(" ")) {
            throw new NullPointerException("O Município não deve ser nulo ou vazio");
        }
    }

    public String getUf() {
        return uf;
    }

    public String setUf(String uf) {
        verificaUfNulaOuEmBranco(uf);
        verificaUfApenasComLetras(uf);
        verificaUfTamanhoCorreto(uf);
        return this.uf = uf;
    }

    private void verificaUfTamanhoCorreto(String uf) {
        if (uf.length() != 2) {
            throw new IllegalArgumentException("A UF deve conter dois dígitos.");
        }
    }

    private void verificaUfApenasComLetras(String uf) {
        for(int i = 0 ; i < uf.length() ; i++) {
            if (!Character.isLetter(uf.charAt(i))) {
                throw new IllegalArgumentException("A UF conter apenas letras.");
            }
        }
    }

    private void verificaUfNulaOuEmBranco(String uf) {
        if (uf == null || uf.isEmpty() || uf.equals(" ")) {
            throw new NullPointerException("A UF não deve ser nulo ou vazio");
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        Endereco other = (Endereco) obj;
        if (!logradouro.equals(other.logradouro))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + logradouro.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "Endereco: " + logradouro + ", " + bairro + ", " + cep + ", " + municipio + ", " + uf;
    }
}
