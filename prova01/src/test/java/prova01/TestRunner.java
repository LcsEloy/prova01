package prova01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (Suite.class)
@Suite.SuiteClasses ({
  ClienteTest.class,  
  EmpresaTest.class,
  EnderecoTest.class,
  FuncionarioTest.class,
  PessoaTest.class,
  TelefoneTest.class
})

public class TestRunner {
}
