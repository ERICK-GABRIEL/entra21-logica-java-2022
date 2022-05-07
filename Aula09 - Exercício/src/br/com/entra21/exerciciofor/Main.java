package br.com.entra21.exerciciofor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("BEM VINDO A AULA SOBRE LA�OS DE REPETI��O!\n");
		System.out.println("ESCOLHA UMA OP��O DO MENU:");
		byte opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 = Contador at� numro limite informado");
		System.out.println("2 = Contador de n�mero inicial at� n�mero final informado");
		System.out.println("3 = Contagem regressiva");
		System.out.println("4 = Caucular tabuada");
		System.out.println("5 = Tabuada at� n�mero informado");
		opcao = entrada.nextByte();
		
		switch (opcao) {
		
		case 1: 
			Veropcao1();
			break;
			
		case 2:
			Veropcao2(); 
			break;
		
		case 3:
			Veropcao3();
			break;
			
		case 4:
			Veropcao4();
			
		case 5:
			veropcao5();
			break;
			
			default :
				System.out.println("Programa encerrado. Verifique sua ortografia e tente novamente, e lembre-se, digite apenas n�meros :)!");
		     break;
		}
			

	}

	private static void veropcao5() {
		byte tbinicial;
		byte tbfinal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Eu quero ver a tabuada do n�mero:");
		tbinicial = entrada.nextByte();
		System.out.println("At�  a tabuada do n�mero:");
		tbfinal = entrada.nextByte();
		for(int numero=tbinicial; numero<=tbfinal;numero++) {
			System.out.println("\nTABUADA DO "+numero+"\n");
			for(int contador=1;contador<=10;contador++) {
				System.out.println(numero+" x "+contador+" = " + (contador*numero));
			}
		
		}
	}

	private static void Veropcao4() {
		Scanner entrada = new Scanner(System.in);
		
		int opcaonumero;
		int contador;
		System.out.println("Escolha o n�mero que deseja saber a tabuada:\n");
		opcaonumero = entrada.nextInt();
	    System.out.println("Tabuada do "+opcaonumero);
		for(contador = 1; contador <=10; contador ++) {
			System.out.println(+opcaonumero+ "x" +contador+ " = " + (contador*opcaonumero));
		
		}
	}

	private static void Veropcao3() {
		Scanner entrada = new  Scanner(System.in);
		byte inicial;
		byte fim=0;
		System.out.println("Informe o n�mero inicial de sua contagem regressiva:");
		inicial = entrada.nextByte();
		
		for(int contador = inicial; contador >=0;contador--) {
			System.out.println("Contando... "+contador);
		}
		
	}

	private static void Veropcao2() {
		
	Scanner entrada = new Scanner(System.in);
		byte inicial;
		byte limite;
		System.out.println("Qual n�mero inicial de sua contagem?");
		inicial = entrada.nextByte();
		System.out.println("Qual n�mero final de sua contagem?");
		limite = entrada.nextByte();
		for(int contador = inicial; contador <= limite; contador ++) {
			System.out.println("Contando... "+contador);
			
		}
		
		
	}

	private static void Veropcao1() {
		
Scanner inPut = new Scanner(System.in);
byte limite;
System.out.println("At� qual n�mero voc� quer contar?");
limite = inPut.nextByte();
		for(int contador = 1; contador <= limite; contador ++ ) {
			
		System.out.println("Contando... "+contador);
		}
	}

}
