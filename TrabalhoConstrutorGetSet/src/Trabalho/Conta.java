package Trabalho;

public class Conta {
	
	//Especifiquei os meus atributos do tipo (private) 
	private int numero;
	private double saldo;
	private int tipo;
	
	//Gerei meu construtor com todos os atributos acima  
	public Conta(int numero, double saldo, int tipo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	//Gerei meu construtor com apenas 2 atributos
	public Conta(int numero, int tipo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
	}
	
	
	// Gerei um construtor vazio para depois populalo
	public Conta() {
		
	}
	
	//Gerei um método (toString) para a visualização
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	//Gerei meus (gets / sets) para acessar posteriormente
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Estou passando para o meu comando (setSaldo) duas condições para a validação do meu saldo dependendo do tipo de conta que tenho
	public boolean setSaldo(double saldo) {
			if(tipo == 1 || tipo == 2) {
				if(saldo >= 0) {
					this.saldo = saldo;
					return true;
				}
			}
			
			else if(tipo == 3) {
				this.saldo = saldo;
				return true;
			}
			
		return false;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
