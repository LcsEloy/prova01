package prova01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class EnderecoTest {
	
	private static Endereco endTest;
	
	@BeforeClass
	public static void antes() {
		String logradouro = "Rua São Jorge, 777";
		String bairro = "Tatuapé";
		String cep = "03087-000";
		String municipio = "São Paulo";
		String uf = "SP";
		endTest = new Endereco (logradouro, bairro, cep, municipio, uf);
	}
	
//	Testes logradouro
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
		assertEquals("Sport Clube Corinthians Paulista", endTest.getLogradouro());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_logradouro() {
		assertEquals("Sociedade Esportiva Palmeiras", endTest.getLogradouro());
	}
	
	
//	testes bairro
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
		assertEquals("Sport Clube Corinthians Paulista", endTest.getBairro());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_bairro() {
		assertEquals("Sociedade Esportiva Palmeiras", endTest.getBairro());
	}
	
	
//	testes cep
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
	public void nao_deve_aceitar_cep_invalido() {
		endTest.setCep(" ");
		assertNotNull("should not be null", endTest.getCep());
	}
	
	@Test
	public void deve_apontar_igualdade_cep() {
		assertEquals("Sport Clube Corinthians Paulista", endTest.getCep());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_cep() {
		assertEquals("0", endTest.getCep());
	}
	
	
//	testes municipio
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
		assertEquals("Sport Clube Corinthians Paulista", endTest.getMunicipio());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_municipio() {
		assertEquals("Sociedade Esportiva Palmeiras", endTest.getMunicipio());
	}
	
//	testes uf
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
	
	@Test
	public void deve_apontar_igualdade_uf() {
		assertEquals("Sport Clube Corinthians Paulista", endTest.getUf());
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void nao_deve_apontar_igualdade_uf() {
		assertEquals("Sociedade Esportiva Palmeiras", endTest.getUf());
	}

}
