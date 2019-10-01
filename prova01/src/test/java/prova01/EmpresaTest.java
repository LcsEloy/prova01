package prova01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpresaTest {
	
	private Empresa empTest;
	
	@Before
	public void antes() {
		String cnpj = "61902722000126";
		String razaoSocial = "Sport Clube Corinthians Paulista";
		String nomeFantasia = "Corinthians";
		String areaAtuacao = "Futebol";
		int numeroFuncionarios = 45;
		int telefone = 1120953000;
		empTest = new Empresa (cnpj, razaoSocial, nomeFantasia, 
									areaAtuacao, numeroFuncionarios, telefone);
	}
	
	
	
	// testes cnpj:
	// teste cnpj vazio
	// teste cnpj invalido
	
	// teste razao socia:
	// teste razao social vazia
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_razaoSocial_nula() {
		empTest.setRazaoSocial(null);
		assertNotNull("should not be null", empTest.getRazaoSocial());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_razaoSocial_invalida() {
		empTest.setRazaoSocial("");
		assertNotNull("should not be null", empTest.getRazaoSocial());
	}
	
	public void nao_deve_aceitar_razaoSocial_em_branco() {
		
	}
	
	// teste nome fantasia:
	// teste nome fantasia vazio
	public void nao_deve_aceitar_nomeFantasia_vazio() {
		
	}
	
//	teste endereço
//	teste endereço vazio
//	teste endereço invalido
	public void nao_deve_aceitar_endereco_invalido() {
		
	}
	
	public void nao_deve_aceitar_endereco_vacio() {
		
	}
	
//	teste telefone
//	teste telefone invalido
//	teste telefone vazio
	public void nao_deve_aceitar_telefone_invalido() {
		
	}
	
	public void nao_deve_aceitar_telefone_vazio() {
		
	}
	
//	teste area de atuaçao
//	teste area de atuaçao vazia
	public void nao_deve_aceitar_areaAtuacao_vazia() {
		
	}
	
//	teste numero de funcionarios
//	teste numero de funcionarios vazio
	public void nao_deve_aceitar_numFun_vazio() {
		
	}
	
}
