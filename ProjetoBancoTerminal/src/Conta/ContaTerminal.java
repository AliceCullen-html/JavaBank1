package Conta;

import java.util.Scanner;

public class ContaTerminal {

	
	public static void main(String[] args) {
		
		
		String WELCOME_MESSAGE = "Bem vindo ao HunterBank! Para seguir com o seu cadastro siga as etapas: ";
		
		System.out.println(WELCOME_MESSAGE);
		
		
		System.out.println("Digite sua conta: ");
		var s = new Scanner(System.in);
		//Variavel name recebe valor do tipo String e armazena
		var conta = s.nextInt();
		System.out.println("Digite sua agencia: ");
		var agencia = s.next();
		System.out.println("Digite seu nome: ");
		var nome = s.next();
		System.out.println("Digite seu saldo: ");
		var saldo = s.nextDouble();
		System.out.println(saldo);
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s , conta %s e seu saldo %s já está disponível para saque.", nome, agencia, conta, saldo);
		
		
	}
	
}
