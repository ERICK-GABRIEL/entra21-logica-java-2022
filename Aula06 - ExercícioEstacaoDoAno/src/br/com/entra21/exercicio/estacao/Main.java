package br.com.entra21.exercicio.estacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		System.out.println("Qual sua estação do ano favorita?");
		System.out.println("1 = verão");
		System.out.println("2 = outono");
		System.out.println("3 = inverno");
		System.out.println("4 = primavera");
		byte resposta;
		Scanner entrada = new Scanner(System.in);

	    resposta = entrada.nextByte();
		
		
		switch (resposta) {
		
		case 1:
			System.out.println("Que legal! Ótimo para pegar um bronze!");
			break;
			
		case 2:
			System.out.println("Ótimo, também gosto do outono!");
		break;
		
		case 3:
			System.out.println("Wow, Minha estação favorita também!");
		break;
		
		case 4:
			System.out.println("Que legal, estação das flores");
		break;
		
		}
	}

}
