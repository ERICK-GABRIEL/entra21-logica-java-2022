package br.com.entra21.exercicio.menu;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("BEM VINDO AO RESTAURANTE JAPAN FOOD :)");
		System.out.println("Para agilizar seu atendimento informe o que deseja pedir:\n");
		System.out.println("Sashimi");
		System.out.println("Sushi");
		System.out.println("Gyoza");
		System.out.println("Harumaki");
		System.out.println("Temaki");
		Scanner entrada = new Scanner(System.in);
		
		String pedido1;
		String pedido2;
		pedido1 = entrada.next();
		
		switch (pedido1) {
		
		case "Sashimi":
			System.out.println("Anotado!");
			break;
		
		case "Sushi":
			System.out.println("Anotado!");
			break;
			
		case "Gyoza":
			System.out.println("Anotado!");
			break;
			
		case "Harumaki":
			System.out.println("Anotado!");
			break;
			
		case "Temaki": 
			System.out.println("Anotado!");
			break;
			
			default:
				System.out.println("Desculpe, estamos em falta.");
				break;
		}
	

				
			
			
			
			
			
			
			
			
			
			
			
		
		

	}

}
