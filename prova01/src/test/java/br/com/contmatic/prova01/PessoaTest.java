package br.com.contmatic.prova01;

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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contmatic.prova01.Pessoa;
import br.com.contmatic.prova01.Telefone;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
        String cpf = "41779801882";
        Telefone telefone = new Telefone(11, 981549141, "Celular");
        pessoaTest = new Pessoa(nome, sobrenome, email, cpf, telefone);
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

    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = pessoaTest.getCpf();
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Pessoa pessoaTest2 = new Pessoa(nome, sobrenome, email, cpf, telefone);
        assertEquals(pessoaTest.hashCode(), pessoaTest2.hashCode());
    }

    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = "86753910050";
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Pessoa pessoaTest2 = new Pessoa(nome, sobrenome, email, cpf, telefone);
        assertNotEquals(pessoaTest.hashCode(), pessoaTest2.hashCode());
    }

    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = pessoaTest.getCpf();
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Pessoa pessoaTest2 = new Pessoa(nome, sobrenome, email, cpf, telefone);
        assertTrue(pessoaTest.equals(pessoaTest2));
    }

    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = pessoaTest.getNome();
        String sobrenome = pessoaTest.getSobrenome();
        String email = pessoaTest.getEmail();
        String cpf = "86753910050";
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Pessoa pessoaTest2 = new Pessoa(nome, sobrenome, email, cpf, telefone);
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

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_nulo() {
        pessoaTest.setSobrenome(null);
        assertNotNull("should not be null", pessoaTest.getSobrenome());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_vazio() {
        pessoaTest.setSobrenome("");
        assertNotNull("should not be empty", pessoaTest.getSobrenome());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_sobrenome_em_branco() {
        pessoaTest.setSobrenome(" ");
        assertNotNull("should not be blank", pessoaTest.getSobrenome());
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
    public void deve_aceitar_email_valido() {
        pessoaTest.setEmail("lucas.silva@contmatic.com.br");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_email_invalido() {
        pessoaTest.setEmail("luc@s@contmatic.com.br");
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_email_nulo() {
        pessoaTest.setEmail(null);
        assertNotNull("should not be null", pessoaTest.getEmail());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_email_vazio() {
        pessoaTest.setEmail("");
        assertNotNull("should not be empty", pessoaTest.getEmail());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_email_em_branco() {
        pessoaTest.setEmail(" ");
        assertNotNull("should not be blank", pessoaTest.getEmail());
    }

    @Test
    public void deve_apontar_igualdade_email() {
        assertEquals("lucas.silva@contmatic.com.br", pessoaTest.getEmail());
    }

    @Test
    public void nao_deve_apontar_igualdade_email() {
        assertThat(pessoaTest.getEmail(), is(not("lucaseloy70@hotmail.com")));
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cpf_nulo() {
        pessoaTest.setCpf(null);
        assertNotNull("should not be null", pessoaTest.getCpf());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cpf_vazio() {
        pessoaTest.setCpf("");
        assertNotNull("should not be empty", pessoaTest.getCpf());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cpf_em_branco() {
        pessoaTest.setCpf(" ");
        assertNotNull("should not be blank", pessoaTest.getCpf());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numero_e_letras() {
        pessoaTest.setCpf("4177980188r");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_apenas_com_letras() {
        pessoaTest.setCpf("aaaaaaaaaaa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_zero() {
        pessoaTest.setCpf("00000000000");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_um() {
        pessoaTest.setCpf("11111111111");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_dois() {
        pessoaTest.setCpf("22222222222");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_tres() {
        pessoaTest.setCpf("33333333333");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_quatro() {
        pessoaTest.setCpf("44444444444");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_cinco() {
        pessoaTest.setCpf("55555555555");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_seis() {
        pessoaTest.setCpf("66666666666");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_sete() {
        pessoaTest.setCpf("77777777777");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_oito() {
        pessoaTest.setCpf("88888888888");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_numeros_iguais_nove() {
        pessoaTest.setCpf("99999999999");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_menos_de_11_digitos() {
        pessoaTest.setCpf("12");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cpf_com_mais_de_11_digitos() {
        pessoaTest.setCpf("123456789101");
    }

    @Test
    public void deve_apontar_cpf_valido() {
        pessoaTest.setCpf("41779801882");
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deve_apontar_cpf_invalido() {
        pessoaTest.setCpf("49739801582");
    }

    @Test
    public void deve_apontar_igualdade_cpf() {
        assertEquals(pessoaTest.getCpf(), pessoaTest.getCpf());
    }

    @Test
    public void nao_deve_apontar_igualdade_cpf() {
        assertThat(pessoaTest.getCpf(), is(not("45896542355")));
    }

}
