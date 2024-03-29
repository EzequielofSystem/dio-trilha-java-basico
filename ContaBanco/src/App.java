import java.util.Scanner;

import cadastro.ContaTerminal;;

public class App {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		ContaTerminal cliente = new ContaTerminal();
		
		System.out.println("Por favor, informe seu nome");
		cliente.setNome(dados.nextLine());
		
		System.out.println("Por favor, informe o número da Agência!");
		cliente.setAgencia(dados.nextLine());
		
		System.out.println("Por favor, informe o número da Conta");
		cliente.setConta(dados.nextInt());
		
		System.out.println("Por favor, informe o saldo");
		cliente.setSaldo(dados.nextDouble());
		
		System.out.println("Olá " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é: " + cliente.getAgencia() + ", conta: " + cliente.getConta() + ", e seu saldo: " + cliente.getSaldo() + ", já está disponível para saque.");
		
	}
}
