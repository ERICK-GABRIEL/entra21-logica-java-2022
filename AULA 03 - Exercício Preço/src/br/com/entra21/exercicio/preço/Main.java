package br.com.entra21.exercicio.preço;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer");
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto");
		nomeProduto = entrada.nextLine();
		
		System.out.println("Informe o custo do produto");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto * 60 / 100);
		
		
		
		System.out.println("O preço de venda do produto é de R$:"+precoVenda+" ");
		
		}

	

}
