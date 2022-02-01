package banco;

public class ContaBusiness {
	private int agencia;
	private int numeroConta;
	private double balanco;
	

	public ContaBusiness(int agencia, int numeroConta) {
		
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}


	public ContaBusiness(int agencia, int numeroConta, double depositoInicial) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getBalanco() {
		return balanco;
	}


	public void deposito(double amount) {
		balanco += amount;
	}
	public void saque(double amount) {
		balanco -= amount + 10.0;
	}
	
	public String toString() {
		return "Ag�ncia: "
				+ agencia
				+ ", N�mero da conta: "
				+ numeroConta
				+ ", Saldo: $"
				+ String.format("%.2f", balanco);
	}
}