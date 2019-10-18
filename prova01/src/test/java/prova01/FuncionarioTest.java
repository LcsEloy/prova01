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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FuncionarioTest {
    
    private Funcionario funcionarioTest;
    
    @BeforeClass
    public static void inicioTestes() {
        System.out.println("Iniciando teste...");
    }

    @Before
    public void antes() {
        String nome = "Lucas";
        String sobrenome = "Eloy";
        String cargo = "Estagiário";
        Double salario = 2000.00;
        String email = "lucas.silva@contmatic.com.br";
        String cpf = "41779801882";
        Telefone telefone = new Telefone(11, 981549141, "Celular");
        funcionarioTest = new Funcionario(nome, sobrenome, email, cpf, telefone, cargo, salario);
    }

    @After
    public void depois() {
        funcionarioTest = null;
    }

    @AfterClass
    public static void fimTestes() {
        System.out.println("Teste concluído.");
    }

    @Test
    public void deve_apresentar_os_dados_da_funcionario_no_console() {
        System.out.println(funcionarioTest);
    }

    @Test
    public void deve_apresentar_os_dados_da_funcionario_com_alteracoes() {
        funcionarioTest.setNome("Sem nome");
        System.out.println(funcionarioTest);
    }

    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = funcionarioTest.getNome();
        String sobrenome = funcionarioTest.getSobrenome();
        String cargo = funcionarioTest.getCargo();
        Double salario = funcionarioTest.getSalario();
        String email = funcionarioTest.getEmail();
        String cpf = funcionarioTest.getCpf();
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Funcionario funcionarioTest2 = new Funcionario(nome, sobrenome, email, cpf, telefone, cargo, salario);
        assertEquals(funcionarioTest.hashCode(), funcionarioTest2.hashCode());
    }

    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_hashcode() {
        String nome = funcionarioTest.getNome();
        String sobrenome = funcionarioTest.getSobrenome();
        String cargo = funcionarioTest.getCargo();
        Double salario = funcionarioTest.getSalario();
        String email = funcionarioTest.getEmail();
        String cpf = "86753910050";
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Funcionario funcionarioTest2 = new Funcionario(nome, sobrenome, email, cpf, telefone, cargo, salario);
        assertNotEquals(funcionarioTest.hashCode(), funcionarioTest2.hashCode());
    }

    @Test
    public void deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = funcionarioTest.getNome();
        String sobrenome = funcionarioTest.getSobrenome();
        String cargo = funcionarioTest.getCargo();
        Double salario = funcionarioTest.getSalario();
        String email = funcionarioTest.getEmail();
        String cpf = funcionarioTest.getCpf();
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Funcionario funcionarioTest2 = new Funcionario(nome, sobrenome, email, cpf, telefone, cargo, salario);
        assertTrue(funcionarioTest.equals(funcionarioTest2));
    }

    @Test
    public void nao_deve_apontar_igualdade_de_objetos_utilizando_equals() {
        String nome = funcionarioTest.getNome();
        String sobrenome = funcionarioTest.getSobrenome();
        String cargo = funcionarioTest.getCargo();
        Double salario = funcionarioTest.getSalario();
        String email = funcionarioTest.getEmail();
        String cpf = "86753910050";
        Telefone telefone = new Telefone(11, 29871764, "casa");
        Funcionario funcionarioTest2 = new Funcionario(nome, sobrenome, email, cpf, telefone, cargo, salario);
        assertFalse(funcionarioTest.equals(funcionarioTest2));
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cargo_nulo() {
        funcionarioTest.setCargo(null);
        assertNotNull("should not be null", funcionarioTest.getCargo());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cargo_vazio() {
        funcionarioTest.setCargo("");
        assertNotNull("should not be empty", funcionarioTest.getCargo());
    }

    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_cargo_em_branco() {
        funcionarioTest.setCargo(" ");
        assertNotNull("should not be blank", funcionarioTest.getCargo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cargo_com_numero_e_letras() {
        funcionarioTest.setCargo("Es7ag14ri0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cargo_apenas_com_numeros() {
        funcionarioTest.setCargo("45");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_cargo_com_apenas_uma_leta() {
        funcionarioTest.setCargo("sssss");
    }

    @Test
    public void deve_aceitar_cargo_valido() {
        funcionarioTest.setCargo("Desenvolvedor");
        assertTrue(true);
    }
    
    @Test
    public void deve_aceitar_salario_valido() {
        funcionarioTest.setSalario(5000.00);
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_salario_nulo() {
        funcionarioTest.setSalario(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void nao_deve_aceitar_salario_invalido() {
        funcionarioTest.setSalario(0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nao_deve_aceitar_salario_menor_ou_igual_zero() {
        funcionarioTest.setSalario(-1.0);
    }

}
