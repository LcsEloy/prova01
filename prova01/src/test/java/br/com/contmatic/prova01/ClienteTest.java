package br.com.contmatic.prova01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.prova01.Cliente;
import br.com.contmatic.prova01.Telefone;

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
        clienteTest = new Cliente(nome, sobrenome, email, cpf, telefone);
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
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone);
        assertEquals(clienteTest.hashCode(), clienteTest2.hashCode());
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = ("86753910050");
        Telefone telefone = new Telefone (11, 29871764, "casa");
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone);
        assertNotEquals(clienteTest.hashCode(), clienteTest2.hashCode());
    }
    
    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = clienteTest.getCpf();
        Telefone telefone = new Telefone (11, 29871764, "casa");
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone);
        assertTrue(clienteTest.equals(clienteTest2));
    }
    
    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = clienteTest.getNome();
        String sobrenome = clienteTest.getSobrenome();
        String email = clienteTest.getEmail();
        String cpf = ("86753910050");
        Telefone telefone = new Telefone (11, 29871764, "casa");
        Cliente clienteTest2 = new Cliente(nome, sobrenome, email, cpf, telefone);
        assertFalse(clienteTest.equals(clienteTest2));
    }
    
}
