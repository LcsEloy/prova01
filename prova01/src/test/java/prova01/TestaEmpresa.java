package prova01;

public class TestaEmpresa {
	
	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		e1.setCnpj("45487875421654668466");
		e1.setRazaoSocial("Empresa Alguma Coisa LTDA.");
		e1.setNomeFantasia("Empresa Teste");
		e1.setEndereco("Av. Joao Das Neves, 75");
		e1.setTelefone(1122554466);
		e1.setAreaAtuacao("Varejo");
		e1.setNumeroFuncionarios(50);
		System.out.println(e1);
	}
}
