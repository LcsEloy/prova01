package prova01;

//import prova01.ValidaCpnj;

/**
/** @author lucas.silva 
/**
*/

public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String areaAtuacao;
	private int numeroFuncionarios;
	private int telefone;
	
	public Empresa (String cnpj, String razaoSocial, String nomeFantasia, 
					String areaAtuacao, int numeroFuncionarios, int telefone) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.areaAtuacao = areaAtuacao;
		this.numeroFuncionarios = numeroFuncionarios;
		this.telefone = telefone;
	}


	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getRazaoSocial() {
			return razaoSocial;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
	}



	public String getNomeFantasia() {
		return nomeFantasia;
	}



	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
		if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
	}



	public String getAreaAtuacao() {
		return areaAtuacao;
	}



	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
		if (razaoSocial == null || razaoSocial.isEmpty() || razaoSocial.equals(" ")) { 
			throw new NullPointerException("O valor não deve ser nulo ou vazio");
		}
	}



	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}



	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		return "Dados da Empresa: " 
				+ "\nCNPJ: " + cnpj 
				+ "\nRazão Social: " + razaoSocial 
				+ "\nNome Fantasia: " + nomeFantasia
				+ "\nÁrea de Atuação: " + areaAtuacao 
				+ "\nNúmero de Funcionários: " + numeroFuncionarios
				+ "\nTelefone: " + telefone;
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
		result = prime * result + telefone;
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
		if (telefone != other.telefone)
			return false;
		return true;
	}

}