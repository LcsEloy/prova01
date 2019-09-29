package prova01;

public class TestaEmpresa {
	
	public void antes() {
		
	}
	
	// testes cnpj:
	// teste cnpj vazio
	// teste cnpj invalido
	public void nao_deve_aceitar_cnpj_invalido() {
		Empresa a = new Empresa();
	}
	
	public void nao_deve_aceitar_cnpj_vazio() {
		Empresa a = new Empresa();
	}
	
	// teste razao socia:
	// teste razao social vazia
	public void nao_deve_aceitar_razaoSocial_invalida() {
		Empresa a = new Empresa();
	}
	
	public void nao_deve_aceitar_razaoSocial_vazia() {
		Empresa a = new Empresa();
	}
	
	// teste nome fantasia:
	// teste nome fantasia vazio
	public void nao_deve_aceitar_nomeFantasia_vazio() {
		Empresa a = new Empresa();
	}
	
//	teste endereço
//	teste endereço vazio
//	teste endereço invalido
	public void nao_deve_aceitar_endereco_invalido() {
		Empresa a = new Empresa();
	}
	
	public void nao_deve_aceitar_endereco_vacio() {
		Empresa a = new Empresa();
	}
	
//	teste telefone
//	teste telefone invalido
//	teste telefone vazio
	public void nao_deve_aceitar_telefone_invalido() {
		Empresa a = new Empresa();
	}
	
	public void nao_deve_aceitar_telefone_vazio() {
		Empresa a = new Empresa();
	}
	
//	teste area de atuaçao
//	teste area de atuaçao vazia
	public void nao_deve_aceitar_areaAtuacao_vazia() {
		Empresa a = new Empresa();
	}
	
//	teste numero de funcionarios
//	teste numero de funcionarios vazio
	public void nao_deve_aceitar_numFun_vazio() {
		Empresa a = new Empresa();
		a.setNumeroFuncionarios();
	}
	
}
