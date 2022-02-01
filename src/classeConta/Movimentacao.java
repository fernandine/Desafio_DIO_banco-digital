package classeConta;

import java.util.Scanner;

import banco.ContaBusiness;
import banco.ContaCorrente;
import banco.ContaPoupanca;


public class Movimentacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		ContaPoupanca cP;
		ContaCorrente cC ;
		ContaBusiness cB ;
		
		System.out.print("Entre com o número da agência: ");
		int agencia = sc.nextInt();
		
		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();
		
		
		System.out.print("Qual o tipo de conta?  (0 = Conta Poupança, 1 = Conta Corrente, 2 = Conta Empresa) ");
		char tipoConta = sc.next().charAt(0);
		
		if(tipoConta == '0' ) {
			
			cP = new ContaPoupanca(agencia, numeroConta);
			System.out.print("Entre com o valor do depósito: ");
			double depositoValor = sc.nextDouble();
			cP.deposito(depositoValor);
			System.out.println();
			System.out.println("Extrato: ");
			System.out.println(cP);
			System.out.println();
			System.out.print("Entre com o valor do saque: (SEM TAXA)");
			double saqueValor = sc.nextDouble();
			cP.saque(saqueValor);
			System.out.println("Saldo atual: ");
			System.out.println(cP);
			
			
		} else if (tipoConta == '1') {
			cC = new ContaCorrente(agencia, numeroConta);
			System.out.print("Entre com o valor do depósito: ");
			double depositoValor = sc.nextDouble();
			cC.deposito(depositoValor);
			System.out.println();
			System.out.println("Extrato: ");
			System.out.println(cC);
			System.out.println();
			System.out.print("Entre com o valor do saque: (TAXA: R$5,00) ");
			double saqueValor = sc.nextDouble();
			cC.saque(saqueValor);
			System.out.println("Saldo atual: ");
			System.out.println(cC);
			
			
		} else if (tipoConta == '2') {
			cB = new ContaBusiness(agencia, numeroConta);
			System.out.print("Entre com o valor do depósito: ");
			double depositoValor = sc.nextDouble();
			cB.deposito(depositoValor);
			System.out.println();
			System.out.println("Extrato: ");
			System.out.println(cB);
			System.out.println();
			System.out.print("Entre com o valor do saque: (TAXA: R$10,00)");
			double saqueValor = sc.nextDouble();
			cB.saque(saqueValor);
			System.out.println("Saldo atual: ");
			System.out.println(cB);
			
		} else {
			System.out.println("Número da conta inválida!");
		}
		
		
		sc.close();

	}
}
