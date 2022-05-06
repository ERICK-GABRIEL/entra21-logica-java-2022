package br.com.entra21.avaliacao.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		System.out.println("CALCULADORA");
		calculadora();
		
	}
	
	public static void calculadora() {
		String opcaoCalculo;
		float numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Você escolheu calcular, digite o primeiro número:");
		numeroA = entrada.nextFloat();
		
		System.out.println("Digite o segundo número:");
		numeroB = entrada.nextFloat();
	

		System.out.println("Selecione uma operação matemática:");
		System.out.println("1 - Soma\n2 - Subtraca\n3 - Divisao\n4 - Multiplicacao\n");
		opcaoCalculo = entrada.next();
		

		switch (opcaoCalculo.toLowerCase()) {
		case "1":
		case "soma":
			System.out.println("O resultado da soma  entre " + numeroA + " e " + numeroB + " é " + somar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "2":
		case "subtracao":
			System.out.println("O resultado da subtração  entre " + numeroA + " e " + numeroB + " é "
					+ subtrair(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "3":
		case "divisao":
			System.out.println("O resultado da divisão  entre " + numeroA + " e " + numeroB + " é " + dividir(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "4":
		case "multiplicacao":
			System.out.println("O resultado da subtração  entre " + numeroA + " e " + numeroB + " é "
					+ multiplicar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		
		}
	}
	
	public static float somar(float numeroA, float numeroB) {
		return numeroA + numeroB;
	}

	public static float subtrair(float numeroA, float numeroB) {
		return numeroA - numeroB;
	}

	public static float dividir(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}

	public static float multiplicar(float numeroA, float numeroB) {
		return numeroA * numeroB;
	}
	


	}


