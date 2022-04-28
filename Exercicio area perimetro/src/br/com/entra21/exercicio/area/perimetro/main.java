package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Faça um programa que solicite a base e a altura de um retângulo e informe sua área e perímetro.");
			System.out.println("Sabendo que a área é cauculada com base e altura.");
			System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo");
			
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
			
			System.out.println("O resultado da área é: "+area+" , o resultado do preimetro é: "+perimetro+".");
			
		
		

	}

}
