package prova01;

import prova01.ValidaCpnj;

/** @author lucas.silva */

public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private int telefone;
	private String areaAtuacao;
	private int numeroFuncionarios;
	
	public Empresa () {
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (ValidaCnpj.isValid() == true) {
			this.cnpj = cnpj;
		} else {
			System.out.println("CNPJ invalido!");
		}
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
	

	@Override
	public String toString() {
		return "Dados da Empresa:" + "\nCNPJ: " + cnpj + "\nRazão Social: " 
				+ razaoSocial + "\nNome Fantasia: " + nomeFantasia
				+ "\nEndereço: " + endereco + "\nTelefone: " + telefone 
				+ "\nÁrea de Atuação: " + areaAtuacao
				+ "\nNúmero de Funcionários: " + numeroFuncionarios;
	}

}
