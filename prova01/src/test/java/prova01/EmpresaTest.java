package prova01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpresaTest {
	
	private Empresa empTest;
	
	@BeforeClass
	public static void inicioTestes() {
		System.out.println("Iniciando os testes da classe Empresa...");
	}
	
	@Before
	public void antes() {
		String cnpj = "61902722000126";
		String razaoSocial = "Sport Clube Corinthians Paulista";
		String nomeFantasia = "Corinthians";
		String areaAtuacao = "Futebol";
		String telefone = "(11)20953000";
		int numeroFuncionarios = 45;
		empTest = new Empresa (cnpj, razaoSocial, nomeFantasia, 
									areaAtuacao, telefone, numeroFuncionarios);
	}
	
	@After
	public void depois() {
		empTest = null;
	}
	
	@AfterClass
	public static void fimTestes() {
		System.out.println("Testes da classe Empresa concluídos.");
	}
	
	@Test
	public void deve_apresentar_os_dados_da_empresa_no_console() {
		System.out.println(empTest);
	}
	
	@Test
	public void deve_apresentar_os_dados_da_empresa_com_alteracoes() {
		empTest.setRazaoSocial("Sem nome");
		System.out.println(empTest);
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
	public void nao_deve_aceitar_cnpj_em_branco() {
		empTest.setCnpj(" ");
		assertNotNull("should not be empty", empTest.getCnpj());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_letras() {
		empTest.setCnpj("6190272200012R");
		assertNull("Cnpj Invalido", empTest.getCnpj());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_numeros_iguais() {
		empTest.setCnpj("00000000000000");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_menos_de_14_digitos() {
		empTest.setCnpj("12");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_mais_de_14_digitos() {
		empTest.setCnpj("123456789101213");
	}
	
	@Test
	public void deve_apontar_cnpj_valido() {
		empTest.setCnpj("61902722000126");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deve_apontar_cnpj_invalido() {
		empTest.setCnpj("61902722000127");
	}
	
	@Test
	public void deve_apontar_igualdade_cnpj() {
		assertEquals(empTest.getCnpj(), empTest.getCnpj());
	}
	
	@Test
	public void nao_deve_apontar_igualdade_cnpj() {
		assertThat(empTest.getCnpj(), is(not("61750345000157")));
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
	public void nao_deve_aceitar_razaoSocial_em_branco() {
		empTest.setRazaoSocial(" ");
		assertNotNull("should not be empty", empTest.getRazaoSocial());
	}
	
	@Test
	public void deve_apontar_igualdade_razaoSocial() {
		assertEquals("Sport Clube Corinthians Paulista", empTest.getRazaoSocial());
	}
	
	@Test
	public void nao_deve_apontar_igualdade_razaoSocial() {
		assertThat(empTest.getRazaoSocial(), is(not("Sociedade Esportiva Palmeiras")));
	}
	
	// teste nome fantasia:
	// teste nome fantasia vazio
	@Test(expected = AssertionError.class)
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
	
	@Test
	public void nao_deve_apontar_igualdade_nomeFantasia() {
		assertThat(empTest.getNomeFantasia(), is(not("Palmeiras")));
	}
	
//	teste area de atuaçao
//	teste area de atuaçao vazia
	@Test(expected = AssertionError.class)
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
	
	@Test
	public void nao_deve_apontar_igualdade_areaAtuacao() {
		assertThat(empTest.getAreaAtuacao(), is(not("Aviação")));
	}
	
	
//	teste telefone
//	teste telefone invalido
//	teste telefone vazio
	@Test(expected = AssertionError.class)
	public void nao_deve_aceitar_telefone_nulo() {
		empTest.setTelefone(null);
		assertNotNull("should not be null", empTest.getTelefone());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_telefone_vazio() {
		empTest.setTelefone("");
		assertNotNull("should not be empty", empTest.getTelefone());
	}
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_telefone_invalido() {
		empTest.setTelefone(" ");
		assertNotNull("should not be invalid", empTest.getTelefone());
	}
	
	@Test
	public void deve_aceitar_telefone_com_10_digitos() {
		
	}
	
	
	
	@Test
	public void deve_apontar_igualdade_telefone() {
		assertEquals("(11)20953000", empTest.getTelefone());
	}
	
	@Test
	public void nao_deve_apontar_igualdade_telefone() {
		assertThat(empTest.getTelefone(), is(not("(11)20953001")));
	}
	
//	teste numero de funcionarios
//	teste numero de funcionarios vazio
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_numumeroFuncionarios_vazio() {
		empTest.setNumeroFuncionarios(0);
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_numeroFuncionarios_negativo() {
		empTest.setNumeroFuncionarios(-1);
	}
	
	@Test
	public void deve_apontar_igualdade_numeroFuncionarios() {
		assertEquals(45, empTest.getNumeroFuncionarios());
	}
	
	@Test
	public void nao_deve_apontar_igualdade_numFuncionarios() {
		assertThat(empTest.getNumeroFuncionarios(), is(not(54)));
	}
	
}
