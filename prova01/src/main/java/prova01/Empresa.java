package prova01;

public class Empresa {

    private static final int TAMANHO_NUMERO_TELEFONE = 10;

    private static final int TAMANHO_PADRAO_DIGITOS_CNPJ = 14;

    private String cnpj;

    private String razaoSocial;

    private String nomeFantasia;

    private String areaAtuacao;

    private String telefone;

    private String numeroFuncionarios;

    public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String areaAtuacao, String telefone, String numeroFuncionarios) {
        this.cnpj = setCnpj(cnpj);
        this.razaoSocial = setRazaoSocial(razaoSocial);
        this.nomeFantasia = setNomeFantasia(nomeFantasia);
        this.areaAtuacao = setAreaAtuacao(areaAtuacao);
        this.telefone = setTelefone(telefone);
        this.numeroFuncionarios = setNumeroFuncionarios(numeroFuncionarios);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String setCnpj(String cnpj) {
        verificaCnpjNuloOuEmBranco(cnpj);
        verificaCnpjApenasNumeros(cnpj);
        verificaCnpjTamanhoValido(cnpj);
        verificaCnpjComNumerosIguais(cnpj);
        verificaCnpjValido(cnpj);
        return this.cnpj = cnpj;
    }

    private void verificaCnpjValido(String cnpj) {
        if (!isCnpjValido(cnpj)) {
            throw new IllegalArgumentException("Cnpj inválido.");
        }
    }

    private void verificaCnpjComNumerosIguais(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222") || cnpj.equals("33333333333333") || cnpj.equals("44444444444444") ||
            cnpj.equals("55555555555555") || cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888") || cnpj.equals("99999999999999")) {
            throw new IllegalArgumentException("O Cnpj Não pode ser composto por números iguais.");
        }
    }

    private void verificaCnpjTamanhoValido(String cnpj) {
        if (cnpj.length() != TAMANHO_PADRAO_DIGITOS_CNPJ) {
            throw new IllegalArgumentException("O Cnpj Deve conter 14 dígitos.");
        }
    }

    private void verificaCnpjApenasNumeros(String cnpj) {
        for(int i = 0 ; i < cnpj.length() ; i++) {
            if (!Character.isDigit(cnpj.charAt(i))) {
                throw new IllegalArgumentException("O Cnpj Deve ser composto apenas por números.");
            }
        }
    }

    private void verificaCnpjNuloOuEmBranco(String cnpj) {
        if (cnpj == null || cnpj.isEmpty() || cnpj.equals(" ")) {
            throw new NullPointerException("O CNPJ não deve ser nulo ou vazio.");
        }
    }

    private boolean isCnpjValido(String cnpj) {

        char primeiroDigitoVerificador;

        char segundoDigitoVerificador;

        int soma;

        int i;

        int resultado;

        int numeroCnpj;

        int peso;

        soma = 0;
        peso = 2;
        for(i = 11 ; i >= 0 ; i--) {
            numeroCnpj = (cnpj.charAt(i) - 48);
            soma = soma + (numeroCnpj * peso);
            peso = peso + 1;
            if (peso == 10) {
                peso = 2;
            }
        }
        resultado = soma % 11;
        if ((resultado == 0) || (resultado == 1)) {
            primeiroDigitoVerificador = '0';
        } else
            primeiroDigitoVerificador = (char) ((11 - resultado) + 48);
        soma = 0;
        peso = 2;
        for(i = 12 ; i >= 0 ; i--) {
            numeroCnpj = (cnpj.charAt(i) - 48);
            soma = soma + (numeroCnpj * peso);
            peso = peso + 1;
            if (peso == 10) {
                peso = 2;
            }
        }
        resultado = soma % 11;
        if ((resultado == 0) || (resultado == 1)) {
            segundoDigitoVerificador = '0';
        } else
            segundoDigitoVerificador = (char) ((11 - resultado) + 48);
        if ((primeiroDigitoVerificador == cnpj.charAt(12)) && (segundoDigitoVerificador == cnpj.charAt(13))) {
            return (true);
        } else
            return (false);

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String setRazaoSocial(String razaoSocial) {
        verificaRazaoSocialNulaOuEmBranco(razaoSocial);
        return this.razaoSocial = razaoSocial;
    }

    private void verificaRazaoSocialNulaOuEmBranco(String razaoSocial) {
        if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) {
            throw new NullPointerException("A Razão Social não deve ser nula ou vazia.");
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String setNomeFantasia(String nomeFantasia) {
        verificaNomeFantasiaNuloOuEmBranco(nomeFantasia);
        return this.nomeFantasia = nomeFantasia;
    }

    private void verificaNomeFantasiaNuloOuEmBranco(String nomeFantasia) {
        if (nomeFantasia == null || nomeFantasia.isEmpty() || nomeFantasia.equals(" ")) {
            throw new NullPointerException("O Nome Fantasia não deve ser nulo ou vazio.");
        }
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public String setAreaAtuacao(String areaAtuacao) {     
        verificaAreaAtuacaoNulaOuEmBranco(areaAtuacao);
        return this.areaAtuacao = areaAtuacao;
    }

    private void verificaAreaAtuacaoNulaOuEmBranco(String areaAtuacao) {
        if (areaAtuacao == null || areaAtuacao.isEmpty() || areaAtuacao.equals(" ")) {
            throw new NullPointerException("A Área de Atuação não deve ser nula ou vazia.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public String setTelefone(String telefone) {
        verificaTelefoneNuloOuEmBranco(telefone);
        verificaTelefoneApenasNumeros(telefone);
        verificaTamanhoTelefoneValido(telefone);
        return this.telefone = telefone;
    }

    private void verificaTamanhoTelefoneValido(String telefone) {
        if (telefone.length() != TAMANHO_NUMERO_TELEFONE) {
            throw new IllegalArgumentException("O Telefone deve conter 10 (xx)xxxx-xxxx dígitos.");
        }
    }

    private void verificaTelefoneApenasNumeros(String telefone) {
        for(int i = 0 ; i < telefone.length() ; i++) {
            if (!Character.isDigit(telefone.charAt(i))) {
                throw new IllegalArgumentException("O Telefone deve ser composto apenas por números.");
            }
        }
    }

    private void verificaTelefoneNuloOuEmBranco(String telefone) {
        if (telefone == null || telefone.isEmpty() || telefone.equals(" ")) {
            throw new NullPointerException("O Telefone não deve ser nulo ou vazio.");
        }
    }

    public String getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public String setNumeroFuncionarios(String numeroFuncionarios) {
        verificaNumeroFuncionariosVazioOuEmBranco(numeroFuncionarios);
        verificaNumeroFuncionariosApenasNumeros(numeroFuncionarios);
        verificaSeContemAoMenosUmFuncionario(numeroFuncionarios);
        verificaNumeroFuncionariosValido(numeroFuncionarios);
        return this.numeroFuncionarios = numeroFuncionarios;
    }

    private void verificaNumeroFuncionariosValido(String numeroFuncionarios) {
        if (numeroFuncionarios.length() > 6) {
            throw new IllegalArgumentException("Número de funcionários inválido");
        }
    }

    private void verificaSeContemAoMenosUmFuncionario(String numeroFuncionarios) {
        if (numeroFuncionarios.equals("0") || numeroFuncionarios.equals("00") || numeroFuncionarios.equals("000") || numeroFuncionarios.equals("0000") || numeroFuncionarios.equals("00000") ||
            numeroFuncionarios.equals("000000")) {
            throw new IllegalArgumentException("Deve conter ao menos um funcionário.");
        }
    }

    private void verificaNumeroFuncionariosApenasNumeros(String numeroFuncionarios) {
        for(int i = 0 ; i < numeroFuncionarios.length() ; i++) {
            if (!Character.isDigit(numeroFuncionarios.charAt(i))) {
                throw new IllegalArgumentException("O Número de funcionários deve ser composto apenas por números.");
            }
        }
    }

    private void verificaNumeroFuncionariosVazioOuEmBranco(String numeroFuncionarios) {
        if (numeroFuncionarios == null || numeroFuncionarios.isEmpty() || numeroFuncionarios.equals(" ")) {
            throw new NullPointerException("O Número de Funcionarios não deve ser nulo ou vazio.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Empresa other = (Empresa) obj;
        if (!cnpj.equals(other.cnpj))
            return false;
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cnpj.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "Dados da Empresa: " + "\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial + "\nNome Fantasia: " + nomeFantasia + "\nÁrea de Atuação: " + areaAtuacao + "\nTelefone: " + telefone +
            "\nNúmero de Funcionários: " + numeroFuncionarios;
    }

}
