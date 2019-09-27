package prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empresa e1 = new Empresa();
		System.out.println("Digite o CNPJ da empresa: ");
		sc.nextLine();
		System.out.println("Digite a Razão Social da empresa: ");
		sc.nextLine();
		System.out.println("Digite o Nome Fantasia da empresa: ");
		sc.nextLine();
		System.out.println("Digite o Endereço da empresa: ");
		sc.nextLine();
		System.out.println("Digite o Telefone da empresa: ");
		sc.nextInt();
		System.out.println("Digite a Area de atuação da empresa: ");
		sc.nextLine();
		System.out.println("Digite o Número de funcionarios da empresa: ");
		sc.nextInt();
		
		System.out.println(e1);
		
		
		sc.close();
	}
}
