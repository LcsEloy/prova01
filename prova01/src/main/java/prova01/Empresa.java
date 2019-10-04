package prova01;

/**
 * /** @author lucas.silva /**
 */

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String areaAtuacao;
	private String telefone;
	private String numeroFuncionarios;

	public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String areaAtuacao, String telefone,
			String numeroFuncionarios) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.areaAtuacao = areaAtuacao;
		this.telefone = telefone;
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
		if (cnpj == null || cnpj.isEmpty() || cnpj.equals(" ")) {
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
		for (int i = 0; i < cnpj.length(); i++) {
			if (!Character.isDigit(cnpj.charAt(i))) {
				throw new IllegalArgumentException("O Cnpj Deve ser composto apenas por números.");
			}
		}
		if (cnpj.length() != 14) {
			throw new IllegalArgumentException("O Cnpj Deve conter 14 dígitos.");
		}
		if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
				|| cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
				|| cnpj.equals("99999999999999")) {
			throw new IllegalArgumentException("O Cnpj Não pode ser composto por números iguais.");
		}
		if (!isValido(cnpj)) {
			throw new IllegalArgumentException("Cnpj inválido.");
		}
	}

	private boolean isValido(String cnpj) {
		char dig13;
		char dig14;
	    int sm;
	    int i; 
	    int r;
	    int num; 
	    int peso;
	 
	      sm = 0;
	      peso = 2;
	      for (i=11; i>=0; i--) {
	        num = (cnpj.charAt(i) - 48);
	        sm = sm + (num * peso);
	        peso = peso + 1;
	        if (peso == 10) {
	           peso = 2;
	        }
	      }
	 
	      r = sm % 11;
	      if ((r == 0) || (r == 1)) {
	         dig13 = '0';
	      } else dig13 = (char)((11-r) + 48);
	      
	      sm = 0;
	      peso = 2;
	      for (i=12; i>=0; i--) {
	        num = (cnpj.charAt(i)- 48);
	        sm = sm + (num * peso);
	        peso = peso + 1;
	        if (peso == 10) {
	           peso = 2;
	        }
	      }
	 
	      r = sm % 11;
	      if ((r == 0) || (r == 1)) {
	         dig14 = '0';
	      } else dig14 = (char)((11-r) + 48);
	 
	      if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
	         return(true);
	      } else return(false);

	    }

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) {
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia == null || nomeFantasia.isEmpty() || nomeFantasia.equals(" ")) {
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
		this.nomeFantasia = nomeFantasia;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
		if (areaAtuacao == null || areaAtuacao.isEmpty() || areaAtuacao.equals(" ")) {
			throw new NullPointerException("A Área de Atuação não deve ser nula ou vazia.");
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
		if (telefone == null || telefone.isEmpty() || telefone.equals(" ")) {
			throw new NullPointerException("O Telefone não deve ser nulo ou vazio.");
		}
		for (int i = 0; i < telefone.length(); i++) {
			if (!Character.isDigit(telefone.charAt(i))) {
				throw new IllegalArgumentException("O Telefone deve ser composto apenas por números.");
			}
		}
		if (telefone.length() != 10) {
			throw new IllegalArgumentException("O Telefone deve conter 10 (xx)xxxx-xxxx dígitos.");
		}
	}

	public String getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(String numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
		if (numeroFuncionarios == null || numeroFuncionarios.isEmpty() || numeroFuncionarios.equals(" ")) {
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
		
		for (int i = 0; i < numeroFuncionarios.length(); i++) {
			if (!Character.isDigit(numeroFuncionarios.charAt(i))) {
				throw new IllegalArgumentException("O Número de funcionários deve ser composto apenas por números.");
			}
		}
		
		if (numeroFuncionarios.equals("0") || numeroFuncionarios.equals("00") || numeroFuncionarios.equals("000")
			|| numeroFuncionarios.equals("0000") || numeroFuncionarios.equals("00000") || numeroFuncionarios.equals("000000")) {
			throw new IllegalArgumentException("Deve conter ao menos um funcionário.");
		}
		if (numeroFuncionarios.length() > 6 || numeroFuncionarios.length() < 0) {
			throw new IllegalArgumentException("Número de funcionários inválido");
		}
	}

	@Override
	public String toString() {
		return "Dados da Empresa: " + "\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial + "\nNome Fantasia: "
				+ nomeFantasia + "\nÁrea de Atuação: " + areaAtuacao + "\nTelefone: " + telefone
				+ "\nNúmero de Funcionários: " + numeroFuncionarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaAtuacao.hashCode();
		result = prime * result + cnpj.hashCode();
		result = prime * result + nomeFantasia.hashCode();
		result = prime * result + numeroFuncionarios.hashCode();
		result = prime * result + razaoSocial.hashCode();
		result = prime * result + telefone.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		Empresa other = (Empresa)obj;		
		if(!cnpj.equals(other.cnpj) || !areaAtuacao.equals(other.areaAtuacao)
			|| !nomeFantasia.equals(other.nomeFantasia) || !razaoSocial.equals(other.razaoSocial) 
			|| !telefone.equals(other.telefone) || !numeroFuncionarios.equals(other.numeroFuncionarios))
			return false;
		return true;
	}
	
}