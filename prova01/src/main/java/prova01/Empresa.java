package prova01;

/** @author lucas.silva */

public class Empresa {
	
	private Cnpj cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private Endereco endereco;
	private int telefone;
	private String areaAtuacao;
	private int numeroFuncionarios;
	
	public Empresa() {
	}

	public Cnpj getCnpj() {
		return cnpj;
	}

	public void setCnpj(Cnpj string) {
		this.cnpj = string;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco string) {
		this.endereco = string;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	

	@Override
	public String toString() {
		return "Dados da Empresa:" + "\nCNPJ: " + cnpj + "\nRazão Social: " 
				+ razaoSocial + "\nNome Fantasia: " + nomeFantasia
				+ "\nEndereço: " + endereco + "\nTelefone: " + telefone 
				+ "\nÁrea de Atuação: " + areaAtuacao
				+ "\nNúmero de Funcionários: " + numeroFuncionarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaAtuacao == null) ? 0 : areaAtuacao.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
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
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
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
