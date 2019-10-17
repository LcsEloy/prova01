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

public class ClienteTest {

    private Cliente clienteTest;

    @BeforeClass
    public static void inicioTestes() {
        System.out.println("Iniciando teste...");
    }

    @Before
    public void antes() {
        String nome = "Lucas";
        String sobrenome = "Eloy";
        String email = "lucaseloy@gmail.com";
        Telefone telefone = new Telefone (11, 29871764, "casa"); 
        String cpf = "41779801882";
        String login = "lcseloy";
        String senha = "123456";
        clienteTest = new Cliente(nome, sobrenome, email, cpf, telefone, login, senha);
    }

    @After
    public void depois() {
        clienteTest = null;
    }

    @AfterClass
    public static void fimTestes() {
        System.out.println("Teste concluído.");
    }

    @Test
    public void deve_apresentar_os_dados_do_cliente_no_console() {
        System.out.println(clienteTest);
    }
    
    @Test
    public void deve_apresentar_os_dados_da_empresa_com_alteracoes() {
        clienteTest.setNome("Sem nome");
        System.out.println(clienteTest);
    }
    
    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = clienteTest.getCpf();
        Telefone telefone = new Telefone (11, 29871764, "casa");
        String login = clienteTest.getLogin();
        String senha = clienteTest.getSenha();
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone, login, senha);
        assertEquals(clienteTest.hashCode(), clienteTest2.hashCode());
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = ("86753910050");
        Telefone telefone = new Telefone (11, 29871764, "casa");
        String login = clienteTest.getLogin();
        String senha = clienteTest.getSenha();
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone, login, senha);
        assertNotEquals(clienteTest.hashCode(), clienteTest2.hashCode());
    }
    
    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = clienteTest.getCpf();
        Telefone telefone = new Telefone (11, 29871764, "casa");
        String login = clienteTest.getLogin();
        String senha = clienteTest.getSenha();
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone, login, senha);
        assertTrue(clienteTest.equals(clienteTest2));
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = ("86753910050");
        Telefone telefone = new Telefone (11, 29871764, "casa");
        String login = clienteTest.getLogin();
        String senha = clienteTest.getSenha();
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone, login, senha);
        assertFalse(clienteTest.equals(clienteTest2));
    }
    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_cnpj_nulo() {
//        clienteTest.setCnpj(null);
//        assertNotNull("should not be null", clienteTest.getCnpj());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_cnpj_vazio() {
//        clienteTest.setCnpj("");
//        assertNotNull("should not be invalid", clienteTest.getCnpj());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_cnpj_em_branco() {
//        clienteTest.setCnpj(" ");
//        assertNotNull("should not be empty", clienteTest.getCnpj());
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numero_e_letras() {
//        clienteTest.setCnpj("6190272200012R");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_apenas_com_letras() {
//        clienteTest.setCnpj("aaaaaaaaaaaaaa");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_zero() {
//        clienteTest.setCnpj("00000000000000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_um() {
//        clienteTest.setCnpj("11111111111111");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_dois() {
//        clienteTest.setCnpj("22222222222222");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_tres() {
//        clienteTest.setCnpj("33333333333333");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_quatro() {
//        clienteTest.setCnpj("44444444444444");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_cinco() {
//        clienteTest.setCnpj("55555555555555");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_seis() {
//        clienteTest.setCnpj("66666666666666");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_sete() {
//        clienteTest.setCnpj("77777777777777");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_oito() {
//        clienteTest.setCnpj("88888888888888");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_numeros_iguais_nove() {
//        clienteTest.setCnpj("99999999999999");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_menos_de_14_digitos() {
//        clienteTest.setCnpj("12");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_cnpj_com_mais_de_14_digitos() {
//        clienteTest.setCnpj("123456789101213");
//    }
//    
//    @Test
//    public void deve_apontar_cnpj_valido() {
//        clienteTest.setCnpj("61902722000126");
//        assertTrue(true);
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void deve_apontar_cnpj_invalido() {
//        clienteTest.setCnpj("61902722000127");
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_cnpj() {
//        assertEquals(clienteTest.getCnpj(), clienteTest.getCnpj());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_cnpj() {
//        assertThat(clienteTest.getCnpj(), is(not("61750345000157")));
//    }
//    
//    @Test
//    public void deve_calcular_cnpj_com_primeiro_validador_zero() {
//        clienteTest.setCnpj("85604499000107");
//    }
//    
//    @Test
//    public void deve_calcular_cnpj_com_segundo_validador_zero() {
//        clienteTest.setCnpj("67230875000150");
//    }
//    
//    @Test
//    public void deve_aceitar_razao_social_valida() {
//        clienteTest.setRazaoSocial("Sport Clube Corinthians Paulista");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_razaoSocial_nula() {
//        clienteTest.setRazaoSocial(null);
//        assertNotNull("should not be null", clienteTest.getRazaoSocial());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_razaoSocial_vazio() {
//        clienteTest.setRazaoSocial("");
//        assertNotNull("should not be invalid", clienteTest.getRazaoSocial());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_razaoSocial_em_branco() {
//        clienteTest.setRazaoSocial(" ");
//        assertNotNull("should not be empty", clienteTest.getRazaoSocial());
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_razaoSocial() {
//        assertEquals("Sport Clube Corinthians Paulista", clienteTest.getRazaoSocial());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_razaoSocial() {
//        assertThat(clienteTest.getRazaoSocial(), is(not("Sociedade Esportiva Palmeiras")));
//    }
//    
//    @Test
//    public void deve_aceitar_nome_fantasia_valido() {
//        clienteTest.setNomeFantasia("Corinthians");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_nulo() {
//        clienteTest.setNomeFantasia(null);
//        assertNotNull("should not be null", clienteTest.getNomeFantasia());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_vazio() {
//        clienteTest.setNomeFantasia("");
//        assertNotNull("should not be invalid", clienteTest.getRazaoSocial());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_nomeFantasia_invalido() {
//        clienteTest.setNomeFantasia(" ");
//        assertNotNull("should not be empty", clienteTest.getNomeFantasia());
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_nomeFantasia() {
//        assertEquals("Corinthians", clienteTest.getNomeFantasia());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_nomeFantasia() {
//        assertThat(clienteTest.getNomeFantasia(), is(not("Palmeiras")));
//    }
//    
//    @Test
//    public void deve_aceitar_area_atuacao_valido() {
//        clienteTest.setAreaAtuacao("Futebol");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_nula() {
//        clienteTest.setAreaAtuacao(null);
//        assertNotNull("should not be null", clienteTest.getAreaAtuacao());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_vazio() {
//        clienteTest.setAreaAtuacao("");
//        assertNotNull("should not be empty", clienteTest.getAreaAtuacao());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_areaAtuacao_invalido() {
//        clienteTest.setAreaAtuacao(" ");
//        assertNotNull("should not be invalid", clienteTest.getAreaAtuacao());
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_areaAtuacao() {
//        assertEquals("Futebol", clienteTest.getAreaAtuacao());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_areaAtuacao() {
//        assertThat(clienteTest.getAreaAtuacao(), is(not("Aviação")));
//    }
//    
//    @Test
//    public void deve_aceitar_telefone_valido() {
//        clienteTest.setTelefone("1122578946");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_nulo() {
//        clienteTest.setTelefone(null);
//        assertNotNull("should not be null", clienteTest.getTelefone());
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_vazio() {
//        clienteTest.setTelefone("");
//        assertNotNull("should not be empty", clienteTest.getTelefone());
//    }
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_telefone_invalido() {
//        clienteTest.setTelefone(" ");
//        assertNotNull("should not be invalid", clienteTest.getTelefone());
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_menos_que_10_digitos() {
//        clienteTest.setTelefone("112095300");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_mais_que_10_digitos() {
//        clienteTest.setTelefone("11209530000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_telefone_com_letras() {
//        clienteTest.setTelefone("XXXXXXXXXX");
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_telefone() {
//        assertEquals("1120953000", clienteTest.getTelefone());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_telefone() {
//        assertThat(clienteTest.getTelefone(), is(not("1120953001")));
//    }
//    
//    @Test
//    public void deve_aceitar_numeroFuncionarios_valido() {
//        clienteTest.setNumeroFuncionarios("45");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_nulo() {
//        clienteTest.setNumeroFuncionarios(null);
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_vazio() {
//        clienteTest.setNumeroFuncionarios("");
//    }
//    
//    @Test(expected = NullPointerException.class)
//    public void nao_deve_aceitar_numumeroFuncionarios_em_branco() {
//        clienteTest.setNumeroFuncionarios(" ");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_letras() {
//        clienteTest.setNumeroFuncionarios("XXXXXX");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_mais_digitos_que_o_permitido() {
//        clienteTest.setNumeroFuncionarios("1234567");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_abaixo_do_permitido() {
//        clienteTest.setNumeroFuncionarios("0");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos() {
//        clienteTest.setNumeroFuncionarios("00");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos2() {
//        clienteTest.setNumeroFuncionarios("000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos3() {
//        clienteTest.setNumeroFuncionarios("0000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos4() {
//        clienteTest.setNumeroFuncionarios("00000");
//    }
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void nao_deve_aceitar_numeroFuncionarios_com_numeros_invalidos5() {
//        clienteTest.setNumeroFuncionarios("000000");
//    }
//    
//    @Test
//    public void deve_apontar_igualdade_numeroFuncionarios() {
//        assertEquals("45", clienteTest.getNumeroFuncionarios());
//    }
//    
//    @Test
//    public void nao_deve_apontar_igualdade_numFuncionarios() {
//        assertThat(clienteTest.getNumeroFuncionarios(), is(not("54")));
//    }
}
