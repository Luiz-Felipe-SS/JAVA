package Trabalho;

public class Principal {
	
	//estou criando o corpo principal do meu código 
	public static void main(String[] args) {
		//instanciei minhas variáveis com valores usando 3 tipos diferente de construtores
	Conta conta_01 = new Conta(23196, 50, 1);	
	Conta conta_02 = new Conta(23085, 2);
	Conta conta_03 = new Conta(); 
		conta_03.setNumero(22145);
		conta_03.setSaldo(100);
		conta_03.setTipo(3);
		
	//chamo o método toString para visualizar os meus inserts
	System.out.println(conta_01.toString());
	System.out.println(conta_02.toString());
	System.out.println(conta_03.toString());
	
	System.out.println("====================================");
	
	//Para finalizar meu codigo vou fazer uma condicional local para verificar se o meu comando (setSaldo) está de acordo com as condicionais que fiz a ele na classe (CONTA)
	//E vou repetir isso nas 3 contas diferentes para ver se tudo está de acordo
	conta_01.setSaldo(-20);
	if (conta_01.getSaldo() != 50) {
		System.out.println("o saldo foi alterado com sucesso " + conta_01.toString());
	}
	
	else {
		System.out.println("Saldo não foi alterado " + conta_01.toString());
	}
	
	System.out.println("====================================");
	
	conta_01.setSaldo(90);
	if (conta_01.getSaldo() != 50) {
		System.out.println("o saldo foi alterado com sucesso " + conta_01.toString());
	}
	
	else {
		System.out.println("Saldo não foi alterado " + conta_01.toString());
	}
	
	System.out.println("====================================");
	
	conta_02.setSaldo(-10);
	if (conta_02.getSaldo() != 0) {
		System.out.println("o saldo foi alterado com sucesso " + conta_02.toString());
	}
	
	else {
		System.out.println("Saldo não foi alterado " + conta_02.toString());
	}
	
	System.out.println("====================================");
	
	conta_02.setSaldo(400);
	if (conta_02.getSaldo() != 0) {
		System.out.println("o saldo foi alterado com sucesso " + conta_02.toString());
	}
	
	else {
		System.out.println("Saldo não foi alterado " + conta_02.toString());
	}
	
	System.out.println("====================================");
	
	conta_03.setSaldo(-150);
	if (conta_02.getSaldo() != 0) {
		System.out.println("o saldo foi alterado com sucesso " + conta_03.toString());
	}
	
	else {
		System.out.println("Saldo não foi alterado " + conta_03.toString());
	}
	
	
	
	 
	}

}
