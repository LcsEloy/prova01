package prova01;

public class TestaEmpresa {
	
	public static void main(String[] args) {
		Empresa e1 = new Empresa("a", "02121");
		e1.setAreaAtuacao("Varejo");
		e1.setTelefone(12121212);
		e1.setNumeroFuncionarios(50);
		e1.getPorte(50);
		System.out.println(e1 + "\n" + e1.getPorte(e1.getNumeroFuncionarios()) );
	}
}
