package br.com.entra21.exercicio.pre�o;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer");
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Informe o custo do produto");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto * 60 / 100);
		
		
		
		System.out.println("O pre�o de venda do produto � de R$:"+precoVenda+" ");
		
		}

	

}
