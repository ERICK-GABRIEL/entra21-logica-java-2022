package br.com.entra21.exercicio.estacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		System.out.println("Qual sua esta��o do ano favorita?");
		System.out.println("1 = ver�o");
		System.out.println("2 = outono");
		System.out.println("3 = inverno");
		System.out.println("4 = primavera");
		byte resposta;
		Scanner entrada = new Scanner(System.in);

	    resposta = entrada.nextByte();
		
		
		switch (resposta) {
		
		case 1:
			System.out.println("Que legal! �timo para pegar um bronze!");
			break;
			
		case 2:
			System.out.println("�timo, tamb�m gosto do outono!");
		break;
		
		case 3:
			System.out.println("Wow, Minha esta��o favorita tamb�m!");
		break;
		
		case 4:
			System.out.println("Que legal, esta��o das flores");
		break;
		
		}
	}

}
