package prova01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PessoaTest {
    
private Pessoa pessoaTest;
    
    @BeforeClass 
    public static void inicioTestes() {
        System.out.println("Iniciando teste...");
    }
    
    @Before
    public void antes() {
        String nome = "Lucas";
        String sobrenome = "Eloy";
        String email = "lucas.silva@contmatic.com.br";
        String cpf = "1234567888";
        Telefone telefone = null;
        pessoaTest = new Pessoa (nome, sobrenome, email, cpf, telefone);
    }
    
    @After
    public void depois() {
        pessoaTest = null;
    }
    
    @AfterClass
    public static void fimTestes() {
        System.out.println("Teste concluído.");
    }
    
    @Test
    public void deve_apresentar_os_dados_da_pessoa_no_console() {
        System.out.println(pessoaTest);
    }
    
    @Test
    public void deve_apresentar_os_dados_da_pessoa_com_alteracoes() {
        pessoaTest.setNome("Sem nome");
        System.out.println(pessoaTest);
    }
    
    @Ignore
    @Test
    public void deve_ignorar_este_teste() {
        System.out.println("Isso não deve ser impresso!");
    }
    
    @Test (timeout = 100)
    public void nao_deve_exceder_o_tempo_proposto() {
        String nome = "Lucas";
        String sobrenome = "Eloy";
        String email = "lucas.silva@contmatic.com.br";
        String cpf = "1234567888";
        Telefone telefone = null;
        pessoaTest = new Pessoa (nome, sobrenome, email, cpf, telefone);
    }
    
    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = pessoaTest.getCpf();
        Telefone telefone = null;
        Pessoa pessoaTest2 = new Pessoa (nome, sobrenome, email, cpf, telefone);
        assertEquals(pessoaTest.hashCode(), pessoaTest2.hashCode());
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = "458799415";
        Telefone telefone = null;
        Pessoa pessoaTest2 = new Pessoa (nome, sobrenome, email, cpf, telefone);
        assertNotEquals(pessoaTest.hashCode(), pessoaTest2.hashCode());
    }
    
    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = pessoaTest.getCpf();
        Telefone telefone = null;
        Pessoa pessoaTest2 = new Pessoa (nome, sobrenome, email, cpf, telefone);
        assertTrue(pessoaTest.equals(pessoaTest2));
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = "458799415";
        Telefone telefone = null;
        Pessoa pessoaTest2 = new Pessoa (nome, sobrenome, email, cpf, telefone);
        assertFalse(pessoaTest.equals(pessoaTest2));
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_nome_nulo() {
        pessoaTest.setNome(null);
        assertNotNull("should not be null", pessoaTest.getNome());
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_nome_vazio() {
        pessoaTest.setNome("");
        assertNotNull("should not be empty", pessoaTest.getNome());
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_nome_em_branco() {
        pessoaTest.setNome(" ");
        assertNotNull("should not be blank", pessoaTest.getNome());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_com_numero_e_letras() {
        pessoaTest.setNome("Luc4s");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_apenas_com_numeros() {
        pessoaTest.setNome("456465");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_com_apenas_uma_leta() {
        pessoaTest.setNome("llllll");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_nome_maior_que_15_caracteres() {
        pessoaTest.setNome("Lucas Oliveira Eloy");
    }
    
    @Test
    public void deve_aceitar_nome_valido() {
        pessoaTest.setNome("Grace");
        assertTrue(true);
    }
    
    @Test
    public void deve_apontar_igualdade_nome() {
        assertEquals(pessoaTest.getNome(), pessoaTest.getNome());
    }
    
    @Test
    public void nao_deve_apontar_igualdade_nome() {
        assertThat(pessoaTest.getNome(), is(not("Grace")));
    }
    
//    ---- TESTES SOBRENOME ----
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_nulo() {
        pessoaTest.setSobrenome(null);
        assertNotNull("should not be null", pessoaTest.getSobrenome());
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_vazio() {
        pessoaTest.setSobrenome("");
        assertNotNull("should not be invalid", pessoaTest.getSobrenome());
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_em_branco() {
        pessoaTest.setSobrenome(" ");
        assertNotNull("should not be empty", pessoaTest.getSobrenome());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_sobrenome_com_numero_e_letras() {
        pessoaTest.setSobrenome("El0y");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_sobrenome_apenas_com_numeros() {
        pessoaTest.setSobrenome("456465");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_sobrenome_com_apenas_uma_leta() {
        pessoaTest.setSobrenome("llllll");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_sobrenome_maior_que_30_caracteres() {
        pessoaTest.setSobrenome("Oliveira Eloy da Silva Sousa Castro Alves Barbosa");
    }
    
    @Test
    public void deve_apontar_igualdade_sobrenome() {
        assertEquals("Eloy", pessoaTest.getSobrenome());
    }
    
    @Test
    public void nao_deve_apontar_igualdade_sobrenome() {
        assertThat(pessoaTest.getSobrenome(), is(not("Sousa")));
    }
    
    @Test
    public void deve_apontar_cpf_valido() {
        pessoaTest.setCpf("21084834030");
        assertTrue(true);
    }
    
//   ---- TESTES EMAIL ----  
//    @Test
//    public void deve_aceitar_nome_fantasia_valido() {
//        empTest.setNomeFantasia("Corinthians");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_nulo() {
//        empTest.setNomeFantasia(null);
//        assertNotNull("should not be null", empTest.getNomeFantasia());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_vazio() {
//        empTest.setNomeFantasia("");
//        assertNotNull("should not be invalid", empTest.getRazaoSocial());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_invalido() {
//        empTest.setNomeFantasia(" ");
//        assertNotNull("should not be empty", empTest.getNomeFantasia());
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_nomeFantasia() {
//        assertEquals("Corinthians", empTest.getNomeFantasia());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_nomeFantasia() {
//        assertThat(empTest.getNomeFantasia(), is(not("Palmeiras")));
//    }
    
    
//    ---- TESTES CPF ----  
//    @Test
//    public void deve_aceitar_area_atuacao_valido() {
//        empTest.setAreaAtuacao("Futebol");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_nula() {
//        empTest.setAreaAtuacao(null);
//        assertNotNull("should not be null", empTest.getAreaAtuacao());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_vazio() {
//        empTest.setAreaAtuacao("");
//        assertNotNull("should not be empty", empTest.getAreaAtuacao());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_invalido() {
//        empTest.setAreaAtuacao(" ");
//        assertNotNull("should not be invalid", empTest.getAreaAtuacao());
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_areaAtuacao() {
//        assertEquals("Futebol", empTest.getAreaAtuacao());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_areaAtuacao() {
//        assertThat(empTest.getAreaAtuacao(), is(not("Aviação")));
//    }
//    
//    @Test
//    public void deve_aceitar_telefone_valido() {
//        empTest.setTelefone("1122578946");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_nulo() {
//        empTest.setTelefone(null);
//        assertNotNull("should not be null", empTest.getTelefone());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_vazio() {
//        empTest.setTelefone("");
//        assertNotNull("should not be empty", empTest.getTelefone());
//    }
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_invalido() {
//        empTest.setTelefone(" ");
//        assertNotNull("should not be invalid", empTest.getTelefone());
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_menos_que_10_digitos() {
//        empTest.setTelefone("112095300");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_mais_que_10_digitos() {
//        empTest.setTelefone("11209530000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_letras() {
//        empTest.setTelefone("XXXXXXXXXX");
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_telefone() {
//        assertEquals("1120953000", empTest.getTelefone());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_telefone() {
//        assertThat(empTest.getTelefone(), is(not("1120953001")));
//    }
//    
//    @Test
//    public void deve_aceitar_numeroFuncionarios_valido() {
//        empTest.setNumeroFuncionarios("45");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_nulo() {
//        empTest.setNumeroFuncionarios(null);
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_vazio() {
//        empTest.setNumeroFuncionarios("");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_em_branco() {
//        empTest.setNumeroFuncionarios(" ");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_letras() {
//        empTest.setNumeroFuncionarios("XXXXXX");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_mais_digitos_que_o_permitido() {
//        empTest.setNumeroFuncionarios("1234567");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_abaixo_do_permitido() {
//        empTest.setNumeroFuncionarios("0");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos() {
//        empTest.setNumeroFuncionarios("00");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos2() {
//        empTest.setNumeroFuncionarios("000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos3() {
//        empTest.setNumeroFuncionarios("0000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos4() {
//        empTest.setNumeroFuncionarios("00000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos5() {
//        empTest.setNumeroFuncionarios("000000");
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_numeroFuncionarios() {
//        assertEquals("45", empTest.getNumeroFuncionarios());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_numFuncionarios() {
//        assertThat(empTest.getNumeroFuncionarios(), is(not("54")));
//    }

}
