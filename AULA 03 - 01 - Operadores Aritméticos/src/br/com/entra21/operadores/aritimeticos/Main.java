package br.com.entra21.operadores.aritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Realizando uma soma " +  (1+7));
		System.out.println(4+10);
		
		
		float numeroA,numeroB;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Informe o numero A");
		numeroA = entrada.nextFloat();
		
		System.out.println("Informe o numero B");
		numeroB = entrada.nextFloat();
		
		System.out.println("A soma entre esses 2 numeros é " + (numeroA+numeroB) );
		
		

		
	}

}
