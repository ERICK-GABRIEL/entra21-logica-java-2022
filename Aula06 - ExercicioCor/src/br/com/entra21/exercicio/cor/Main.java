package br.com.entra21.exercicio.cor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Qual sua cor favorita?");
		Scanner entrada = new Scanner(System.in);
		String resultado;
		
		System.out.println("VERDE");
		System.out.println("AZUL");
		System.out.println("AMARELO");
		System.out.println("VERMELHO");
		resultado = entrada.next();
		
		switch (resultado) {
	
		case "VERDE":
			System.out.println("Wow, verde é minha cor favorita também");
		break;
		case "AZUL": 
			System.out.println("Que legal, azul é uma cor bem atraente");
			break;
			
		case "AMARELO":
			System.out.println("Amrelo é bonito");
			break;
			
		case "VERMELHO":
			System.out.println("Cor muito bonita");
			
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
