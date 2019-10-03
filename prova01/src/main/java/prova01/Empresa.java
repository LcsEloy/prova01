package prova01;

import java.util.InputMismatchException;


/**
 * /** @author lucas.silva /**
 */

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String areaAtuacao;
	private String telefone;
	private int numeroFuncionarios;

	public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String areaAtuacao, String telefone,
			int numeroFuncionarios) {
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
	 
	    try {
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
	    } catch (InputMismatchException erro) {
	        return(false);
	    }
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
		this.nomeFantasia = nomeFantasia;
		if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) {
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
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
		for (int i = 0; i < cnpj.length(); i++) {
			if (!Character.isDigit(cnpj.charAt(i))) {
				throw new IllegalArgumentException("O Telefone deve ser composto apenas por números.");
			}
		}
		if (cnpj.length() != 14) {
			throw new IllegalArgumentException("O Telefone deve conter 10 (xx)xxxx-xxxx dígitos.");
		}
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
		if (numeroFuncionarios < 1) {
			throw new NullPointerException("Deve conter ao menos um funcionário.");
		}
		if (numeroFuncionarios < 0) {
			throw new NullPointerException("Número de Funcionários não pode ser negativo.");
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
		result = prime * result + ((areaAtuacao == null) ? 0 : areaAtuacao.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + numeroFuncionarios;
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (areaAtuacao == null) {
			if (other.areaAtuacao != null)
				return false;
		} else if (!areaAtuacao.equals(other.areaAtuacao))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (numeroFuncionarios != other.numeroFuncionarios)
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}