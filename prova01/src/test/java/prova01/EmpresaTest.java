package prova01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EmpresaTest {
	
	private Empresa empTest;
	
	@Before
	public void antes() {
		String cnpj = "61902722000126";
		String razaoSocial = "Sport Clube Corinthians Paulista";
		String nomeFantasia = "Corinthians";
		String areaAtuacao = "Futebol";
		int numeroFuncionarios = 45;
		Integer telefone = 1120953000;
		empTest = new Empresa (cnpj, razaoSocial, nomeFantasia, 
									areaAtuacao, numeroFuncionarios, telefone);
	}
	
	@After
	public void depois() {
		empTest = null;
	}
	
	
	// testes cnpj:
	// teste cnpj vazio
	// teste cnpj invalido
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cnpj_nulo() {
		empTest.setCnpj(null);
		assertNotNull("should not be null", empTest.getCnpj());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cnpj_vazio() {
		empTest.setCnpj("");
		assertNotNull("should not be invalid", empTest.getCnpj());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cnpj_invalido() {
		empTest.setCnpj(" ");
		assertNotNull("should not be empty", empTest.getCnpj());
	}
	
	@Test
	public void deve_apontar_igualdade_cnpj() {
		assertEquals("61902722000126", empTest.getCnpj());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_cnpj() {
		assertEquals("61750345000157", empTest.getCnpj());
	}
	
	@Test
	public void deve_apontar_cnpj_valido() {
	}
	
	@Test
	public void deve_apontar_cnpj_invalido() {
	}
	
	
	
	// teste razao socia:
	// teste razao social vazia
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_razaoSocial_nula() {
		empTest.setRazaoSocial(null);
		assertNotNull("should not be null", empTest.getRazaoSocial());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_razaoSocial_vazio() {
		empTest.setRazaoSocial("");
		assertNotNull("should not be invalid", empTest.getRazaoSocial());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_razaoSocial_invalido() {
		empTest.setRazaoSocial(" ");
		assertNotNull("should not be empty", empTest.getRazaoSocial());
	}
	
	@Test
	public void deve_apontar_igualdade_razaoSocial() {
		assertEquals("Sport Clube Corinthians Paulista", empTest.getRazaoSocial());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_razaoSocial() {
		assertEquals("Sociedade Esportiva Palmeiras", empTest.getRazaoSocial());
	}
	
	// teste nome fantasia:
	// teste nome fantasia vazio
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_nomeFantasia_nulo() {
		empTest.setNomeFantasia(null);
		assertNotNull("should not be null", empTest.getNomeFantasia());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_nomeFantasia_vazio() {
		empTest.setRazaoSocial("");
		assertNotNull("should not be invalid", empTest.getRazaoSocial());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_nomeFantasia_invalido() {
		empTest.setNomeFantasia(" ");
		assertNotNull("should not be empty", empTest.getNomeFantasia());
	}
	
	@Test
	public void deve_apontar_igualdade_nomeFantasia() {
		assertEquals("Corinthians", empTest.getNomeFantasia());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_nomeFantasia() {
		assertEquals("Palmeiras", empTest.getNomeFantasia());
	}
	
//	teste area de atuaçao
//	teste area de atuaçao vazia
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_areaAtuacao_nula() {
		empTest.setAreaAtuacao(null);
		assertNotNull("should not be null", empTest.getAreaAtuacao());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_areaAtuacao_vazio() {
		empTest.setAreaAtuacao("");
		assertNotNull("should not be empty", empTest.getAreaAtuacao());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_areaAtuacao_invalido() {
		empTest.setAreaAtuacao(" ");
		assertNotNull("should not be invalid", empTest.getAreaAtuacao());
	}
	
	@Test
	public void deve_apontar_igualdade_areaAtuacao() {
		assertEquals("Futebol", empTest.getAreaAtuacao());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_areaAtuacao() {
		assertEquals("Aviação", empTest.getAreaAtuacao());
	}
	
	
//	teste telefone
//	teste telefone invalido
//	teste telefone vazio	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_telefone_invalido() {
		empTest.setTelefone(0);
		assertNotNull("should not be invalid", empTest.getTelefone());
	}
	
	@Test
	public void deve_apontar_igualdade_telefone() {
		assertEquals(1120953000, empTest.getTelefone());
	}
	
	@Test(expected = java.lang.AssertionError.class)
	public void nao_deve_apontar_igualdade_telefone() {
		assertEquals(1120953001, empTest.getTelefone());
	}
	
//	teste numero de funcionarios
//	teste numero de funcionarios vazio
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_numumeroFuncionarios_vazio() {
		empTest.setNumeroFuncionarios(0);
		assertNotNull(", object);
	}
	
	@Test
	public void deve_apontar_igualdade_numeroFuncionarios() {
		assertEquals("Futebol", empTest.getNumeroFuncionarios());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_numFuncionarios() {
		assertEquals("Aviação", empTest.getNumeroFuncionarios());
	}
	
}
