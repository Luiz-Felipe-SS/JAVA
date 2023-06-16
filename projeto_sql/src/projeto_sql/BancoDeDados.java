package projeto_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDeDados {
	
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	
	public void conectar() {
		
		String servidor = "jdbc:mysql://localhost:3309/agenda";
		String usuario = "root";
		String senha = "cursomysql";
		
		try {
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		}
		catch(Exception e) {
			System.out.println("Erro na conexão com o Banco de Dados. ");
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void inserirContato(String nome, String telefone) {
		String query;
		
		try {
			query = "insert into contato (nome, telefone) values (" + "'"  + nome + "' , '" + telefone + "' );";
			System.out.println(query);
			this.statement.execute(query);
			
		} catch (Exception e) {
			System.out.println("Erro na inserção");
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	
	
	
	
	

}




