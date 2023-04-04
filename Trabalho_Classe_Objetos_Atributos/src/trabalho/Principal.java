package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		
		Conta conta_01 = new Conta();
		Cliente Cliente_01 = new Cliente();
		
		System.out.println("Digite seu CPF: ");
		Cliente_01.cpf = entrada.nextLine();
		System.out.println("Digite o Ano de nascimento: ");
		Cliente_01.anoNascimento = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite seu nome: ");
		Cliente_01.nome = entrada.nextLine();
		System.out.println("Digite seu e-mail: ");
		Cliente_01.email = entrada.nextLine();
		
		
		
		System.out.println("informe conta");
		conta_01.numero = entrada.nextInt();
		System.out.println("informe saldo");
		conta_01.saldo = entrada.nextDouble();
		System.out.println("Informe Depitado: ");
		conta_01.debitaSaldo(entrada.nextFloat());	
		System.out.println(conta_01.toString());
		System.out.println("Informe Cretido: ");
		conta_01.creditaSaldo(entrada.nextFloat());
		
		
		System.out.println(Cliente_01.toString());
		System.out.println(conta_01.toString());
		
		
		
		
			
		}
				
			
	}

