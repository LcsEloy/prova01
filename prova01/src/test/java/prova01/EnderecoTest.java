package prova01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * /** @author lucas.silva /**
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {
	
	private Endereco endTest;
	
//	Exibe uma mensagem antes do inicio dos testes.	
	@BeforeClass
	public static void inicioTestes() {
		System.out.println("Iniciando o teste...");
	}
	
//	Atribue valores antes de cada teste unitário.
	@Before
	public void antes() {
		String logradouro = "Rua São Jorge, 777";
		String bairro = "Tatuapé";
		String cep = "03087000";
		String municipio = "São Paulo";
		String uf = "SP";
		endTest = new Endereco (logradouro, bairro, cep, municipio, uf);
	}
	
//	Deixa os valores nulos após cada teste.
	@After
	public void depois() {
		endTest = null;
	}
	
//	Exibe uma mensagem ao final após os testes serem concluidos.
	@AfterClass
	public static void fimTestes() {
		System.out.println("Teste concluído.");
	}
	
//	Testa se valores estão sendo iniciados corretamente.
	@Test
	public void deve_apresentar_os_dados_do_endereco_no_console() {
		System.out.println(endTest);
	}
	
//	Testa alterações nos valores via método set.
	@Test
	public void deve_apresentar_os_dados_do_endereco_com_alteracoes() {
		endTest.setLogradouro("Rua Sem Nome");
		System.out.println(endTest);
	}
	
//--------------Testes hashCode--------------//
	@Test
	public void deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
		String logradouro = endTest.getLogradouro();
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = endTest.getMunicipio();
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertEquals(endTest.hashCode(), endTest2.hashCode());
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
		String logradouro = endTest.getLogradouro();
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = "Guarulhos";
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertNotEquals(endTest.hashCode(), endTest2.hashCode());
	}
	
//--------------Testes Equals--------------//
	@Test
	public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
		String logradouro = endTest.getLogradouro();
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = endTest.getMunicipio();
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertTrue(endTest.equals(endTest2));
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
		String logradouro = endTest.getLogradouro();
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = "Guarulhos";
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertFalse(endTest.equals(endTest2));
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals2() {
		String logradouro = "Rua Não Exstente, 17";
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = endTest.getMunicipio();
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertFalse(endTest.equals(endTest2));
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals3() {
		String logradouro = endTest.getLogradouro();
		String bairro = "Guaianazes";
		String cep = endTest.getCep();
		String municipio = endTest.getMunicipio();
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertFalse(endTest.equals(endTest2));
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals4() {
		String logradouro = endTest.getLogradouro();;
		String bairro = endTest.getBairro();
		String cep = "02564897";
		String municipio = endTest.getMunicipio();
		String uf = endTest.getUf();
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertFalse(endTest.equals(endTest2));
	}
	
	@Test
	public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals5() {
		String logradouro = endTest.getLogradouro();
		String bairro = endTest.getBairro();
		String cep = endTest.getCep();
		String municipio = endTest.getMunicipio();
		String uf = "SC";
		Endereco endTest2 = new Endereco (logradouro, bairro, cep, municipio, uf);
		assertFalse(endTest.equals(endTest2));
	}
	
	
//--------------Testes Logradouro--------------//
	@Test
	public void deve_aceitar_logradouro_valido() {
		endTest.setLogradouro("Rua São Jorge, 777");
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_logradouro_nulo() {
		endTest.setLogradouro(null);
		assertNotNull("should not be null", endTest.getLogradouro());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_logradouro_vazio() {
		endTest.setLogradouro("");
		assertNotNull("should not be null", endTest.getLogradouro());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_logradouro_invalido() {
		endTest.setLogradouro(" ");
		assertNotNull("should not be null", endTest.getLogradouro());
	}
	
	@Test
	public void deve_apontar_igualdade_logradouro() {
		assertEquals("Rua São Jorge, 777", endTest.getLogradouro());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_logradouro() {
		assertEquals("Rua Palestra Itália, 214", endTest.getLogradouro());
	}
	
	
//--------------Testes Bairro--------------//
	@Test
	public void deve_aceitar_bairro_valido() {
		endTest.setBairro("Vila Maria");
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_bairro_nulo() {
		endTest.setBairro(null);
		assertNotNull("should not be null", endTest.getBairro());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_bairro_vazio() {
		endTest.setBairro("");
		assertNotNull("should not be null", endTest.getBairro());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_bairro_invalido() {
		endTest.setBairro(" ");
		assertNotNull("should not be null", endTest.getBairro());
	}
	
	@Test
	public void deve_apontar_igualdade_bairro() {
		assertEquals("Tatuapé", endTest.getBairro());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_bairro() {
		assertEquals("Perdizes", endTest.getBairro());
	}
	
	
//--------------Testes Cep--------------//
	@Test
	public void deve_aceitar_cep_valido() {
		endTest.setCep("02135664");
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cep_nulo() {
		endTest.setCep(null);
		assertNotNull("should not be null", endTest.getCep());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cep_vazio() {
		endTest.setCep("");
		assertNotNull("should not be null", endTest.getCep());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cep_em_branco() {
		endTest.setCep(" ");
		assertNotNull("should not be null", endTest.getCep());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numero_e_letras() {
		endTest.setCep("0213600E");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_apenas_com_letras() {
		endTest.setCep("abcdefgh");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais() {
		endTest.setCep("00000000");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais1() {
		endTest.setCep("11111111");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais2() {
		endTest.setCep("22222222");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais3() {
		endTest.setCep("33333333");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais4() {
		endTest.setCep("44444444");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais5() {
		endTest.setCep("55555555");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais6() {
		endTest.setCep("66666666");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais7() {
		endTest.setCep("77777777");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais8() {
		endTest.setCep("88888888");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_numeros_iguais9() {
		endTest.setCep("99999999");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cep_com_menos_de_8_digitos() {
		endTest.setCep("87");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_mais_de_8_digitos() {
		endTest.setCep("123456789");
	}
	
	@Test
	public void deve_apontar_igualdade_cep() {
		assertEquals("03087000", endTest.getCep());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_cep() {
		assertEquals("05092031", endTest.getCep());
	}
	
	
//--------------Testes Municipio--------------//
	@Test
	public void deve_aceitar_municipio_valido() {
		endTest.setMunicipio("São Paulo");
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_municipio_nulo() {
		endTest.setMunicipio(null);
		assertNotNull("should not be null", endTest.getMunicipio());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_municipio_vazio() {
		endTest.setMunicipio("");
		assertNotNull("should not be null", endTest.getMunicipio());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_municipio_invalido() {
		endTest.setMunicipio(" ");
		assertNotNull("should not be null", endTest.getMunicipio());
	}
	
	@Test
	public void deve_apontar_igualdade_municipio() {
		assertEquals("São Paulo", endTest.getMunicipio());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_municipio() {
		assertEquals("Rio de Janeiro", endTest.getMunicipio());
	}
	
//--------------Testes UF--------------//
	@Test
	public void deve_aceitar_uf_valido() {
		endTest.setUf("SP");
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_uf_nulo() {
		endTest.setUf(null);
		assertNotNull("should not be null", endTest.getUf());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_uf_vazio() {
		endTest.setUf("");
		assertNotNull("should not be null", endTest.getUf());
	}
	
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_uf_invalido() {
		endTest.setUf(" ");
		assertNotNull("should not be null", endTest.getUf());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cnpj_com_numero_e_letras() {
		endTest.setUf("R1");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uf_apenas_com_numeros() {
		endTest.setUf("11");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uf_com_menos_de_2_digitos() {
		endTest.setUf("A");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uf_com_mais_de_2_digitos() {
		endTest.setUf("GRU");
	}
	
	@Test
	public void deve_apontar_igualdade_uf() {
		assertEquals("SP", endTest.getUf());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_uf() {
		assertEquals("RJ", endTest.getUf());
	}

}
