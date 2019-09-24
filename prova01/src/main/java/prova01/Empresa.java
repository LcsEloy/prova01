package prova01;

/** @author lucas.silva */
public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private int telefone;
	private String areaAtuacao;
	private int numeroFuncionarios;
	private int porte;
	
	public Empresa(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
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
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	
	public int getPorte(int i) {
		this.porte = i;
		if (this.numeroFuncionarios <= 50) {
			System.out.println("Empresa Pequeno Porte.");
		}
		if (this.numeroFuncionarios >= 100) {
			System.out.println("Empresa Médio Porte");
		}
		if (this.numeroFuncionarios > 200) {
			System.out.println("Empresa Grande Porte");
		}
		return i;
	}

	@Override
	public String toString() {
		return "Dados da Empresa:" + "\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial + "\nNome Fantasia: " + nomeFantasia
				+ "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nÁrea de Atuação: " + areaAtuacao
				+ "\nNúmero de Funcionários: " + numeroFuncionarios + "\nPorte da Empresa: " + porte;
	}
	
}
