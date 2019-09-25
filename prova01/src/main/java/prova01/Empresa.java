package prova01;

/** @author lucas.silva */
public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private Endereco endereco;
	private int telefone;
	private String areaAtuacao;
	private int numeroFuncionarios;
	private String porte;
	
	public Empresa() {
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
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
	
	public int getPorte() {
		int i = numeroFuncionarios;
		if (i <= 50) {
			System.out.println("Empresa Pequeno Porte.");
		}
		if (i >= 100) {
			System.out.println("Empresa Médio Porte");
		}
		if (i > 200) {
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
