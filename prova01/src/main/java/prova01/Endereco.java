package prova01;

/**
 * /** @author lucas.silva /**
 */

public class Endereco {

	private String logradouro;
	private String bairro;
	private String cep;
	private String municipio;
	private String uf;

	public Endereco(String logradouro, String bairro, String cep, 
					String municipio, String uf) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.municipio = municipio;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
		if (logradouro == null || logradouro.isEmpty() || logradouro.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio.");
		}
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
		if (bairro == null || bairro.isEmpty() || bairro.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
		if (cep == null || cep.isEmpty() || cep.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
		
		if (cep.equals("00000000") || cep.equals("11111111") || cep.equals("22222222")
			|| cep.equals("33333333") || cep.equals("44444444") || cep.equals("55555555")
			|| cep.equals("66666666") || cep.equals("77777777") || cep.equals("88888888")
			|| cep.equals("99999999")) {
			throw new IllegalArgumentException("O Cep não pode ser composto por números iguais.");
		}
		
		for (int i = 0; i < cep.length(); i++) {
			if (!Character.isDigit(cep.charAt(i))) {
				throw new IllegalArgumentException("O Cep deve ser composto apenas por números.");
			}
		}
		
		if (cep.length() != 8) {
			throw new IllegalArgumentException("O Cep deve conter 8 dígitos.");
		}
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
		if (municipio == null || municipio.isEmpty() || municipio.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
		if (uf == null || uf.isEmpty() || uf.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
		
		for (int i = 0; i < uf.length(); i++) {
			if (!Character.isLetter(uf.charAt(i))) {
				throw new IllegalArgumentException("UF conter apenas letras.");
			}
		}
		if (uf.length() != 2) {
			throw new IllegalArgumentException("UF deve conter dois dígitos.");
		}
	}

	@Override
	public String toString() {
		return "Endereco: "
				+ logradouro
				+ ", "
				+ bairro
				+ ", "
				+ cep
				+ ", "
				+ municipio
				+ ", "
				+ uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + logradouro.hashCode();
		result = prime * result + bairro.hashCode();
		result = prime * result + cep.hashCode();
		result = prime * result + municipio.hashCode();
		result = prime * result + uf.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		Endereco other = (Endereco)obj;		
		if(!logradouro.equals(other.logradouro) || !bairro.equals(other.bairro)
		   || !cep.equals(other.cep) || !municipio.equals(other.municipio) 
		   || !uf.equals(other.uf))
			return false;
		return true;
	}
}