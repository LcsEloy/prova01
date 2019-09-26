package prova01;

import org.junit.Test;

public class TestaEmpresa {
	// testes cnpj:
	// teste cnpj vazio
	// teste cnpj invalido
	public void nao_deve_aceitar_cnpj_invalido() {
		
	}
	
	public void nao_deve_aceitar_cnpj_vazio() {
		
	}
	
	// teste razao socia:
	// teste razao social vazia
	public void nao_deve_aceitar_razaoSocial_invalida() {
	
	}
	
	public void nao_deve_aceitar_razaoSocial_vazia() {
		
	}
	
	// teste nome fantasia:
	// teste nome fantasia vazio
	public void nao_deve_aceitar_nomeFantasia_vazio() {
		
	}
	
//	teste endereço
//	teste endereço vazio
//	teste endereço invalido
	
//	teste telefone
//	teste telefone invalido
//	teste telefone vazio
	public void nao_deve_aceitar_telefone_invalido() {
		
	}
	
	public void nao_deve_aceitar_telefone_vazio() {
		
	}
	
//	teste area de atuaçao
//	teste area de atuaçao vazia
	
//	teste numero de funcionarios
//	teste numero de funcionarios vazio
	public void nao_deve_aceitar_numFun_vazio() {
		Empresa a = new Empresa();
		a.setNumeroFuncionarios();
	}
	
//	teste porte
//	teste porte funciona
	
}
