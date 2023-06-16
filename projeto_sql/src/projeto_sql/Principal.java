package projeto_sql;

public class Principal {
	
	public static void main(String[] args) {
		
		BancoDeDados bancoDB = new BancoDeDados();
		
		bancoDB.conectar();
		
		if(bancoDB.estaConectado() == true) {
			System.out.println("Banco de dados conectado");
		}
		else {
			System.out.println("Banco de dados não conectado");
		}
		
		bancoDB.inserirContato("Senac PR", "0800 643 6 346");
		
		
		
	}

}
