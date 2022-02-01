package banco;

public class ContaCorrente {
	private int agencia;
	private int numeroConta;
	private double balanco;
	

	public ContaCorrente(int agencia, int numeroConta) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}


	public ContaCorrente(int agencia, int numeroConta, double depositoInicial) {
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
		balanco -= amount + 5.0;
	}
	
	public String toString() {
		return "Agência: "
				+ agencia
				+ ", Número da conta: "
				+ numeroConta
				+ ", Saldo: $"
				+ String.format("%.2f", balanco);
	}
}