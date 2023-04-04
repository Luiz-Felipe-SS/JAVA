package trabalho;

public class Conta {
	
	int numero;
	Double saldo;
	
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	public void debitaSaldo(double debita) {
		this.saldo = this.saldo + debita;	
	}
	
	public void creditaSaldo(double credita) {
		 this.saldo = this.saldo - credita;
		
	}
	
	
}
