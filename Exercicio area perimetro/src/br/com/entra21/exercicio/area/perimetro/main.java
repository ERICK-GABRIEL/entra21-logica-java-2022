package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fa�a um programa que solicite a base e a altura de um ret�ngulo e informe sua �rea e per�metro.");
			System.out.println("Sabendo que a �rea � cauculada com base e altura.");
			System.out.println("O per�metro � obtido ao somar todos os vertices do ret�ngulo");
			
			//criar variaveis
			float base,altura,area,perimetro;//boas praticas de nomeclatura
			
			Scanner entrada= new Scanner(System.in);
			
			//definir valores as variaveis
			
			System.out.println("Informe a base do retangulo");
			base = entrada.nextFloat();
			
			System.out.println("Informe a altura do retangulo");
			altura= entrada.nextFloat();
			
			//momento de processamentos...
			area= base * altura;
			perimetro = base * 2 + altura * 2;
			
			System.out.println("O resultado da �rea �: "+area+" , o resultado do preimetro �: "+perimetro+".");
			
		
		

	}

}