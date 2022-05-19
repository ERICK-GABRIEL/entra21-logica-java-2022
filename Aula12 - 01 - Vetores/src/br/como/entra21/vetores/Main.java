package br.como.entra21.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcaomenu;

		do {

			System.out.println("ESCOLHA UMA OP��O DA AULA SOBRE VETORES\n");
			System.out.println("0 - Exit");
			System.out.println("1 - Declarando Vetores");
			System.out.println("2 - Acessando �ndices");
			System.out.println("3 - Atribuiondo valores nos �ndices");
			System.out.println("4 - M�dias com vetores");
			opcaomenu = entrada.nextByte();

			switch (opcaomenu) {

			case 0:
				// S� para n�o cair na opcao default
				break;

			case 1:
				declararVetores();
				break;

			case 2:
				acessarIndices();
				break;

			case 3:
				atribuirValor();
				break;

			case 4:
				mediaVetores();
				break;

			default:
				System.out.println("Informe uma op��o v�lida:");
				break;
			}
		} while (opcaomenu != 0);// condicao de permanencia em quanto o usuario nao digitar zero

		// ----------------------------------------------------------------------------

	}

	public static void declararVetores() {
		byte idades[]; // Primeiro criar a variavel que � valor de algum tipo

		idades = new byte[15]; // Segundo definir um tamanho

		System.out.println("O tamanho � " + idades.length);// Depois usar ou atualizar

		float notas[] = { 1, 3.5f, 8 }; // 1 criei a variavel e defini o tamanho e o valo respectivamente
		// [1][3.5][8]
		System.out.println("Quantas notas tem nas lista? " + notas.length);

	}

	public static void acessarIndices() {
		byte idades[]; // Primeiro criar a variavel que � valor de algum tipo
		idades = new byte[15]; // Segundo definir um tamanho

		System.out.println("O que tem no �ndice [1] " + idades[1]);
		System.out.println("O que tem na ultima posi��o de notas? " + idades[2]);
//		System.out.println("Consigo acessar o �ndice 10 de notas? "+notas[10]);
//		N�o � possivel acessar um �ndice que n�o existe CUIDADO!

	}

	public static void atribuirValor() {
		byte idades[] = new byte[10];
		idades[0] = 33;
		idades[9] = 12;

	}

	public static void mediaVetores() {
		Scanner entrada = new Scanner(System.in);
		float notas[] = new float[2];

		for (byte contador = 0; contador < notas.length; contador++) {
			// System.out.println("Contagem em "+contador);
			System.out.println("Informe a " + (contador + 1) + "� nota:");
			notas[contador] = entrada.nextFloat();

		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		for (byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];
		}
		System.out.println("Soma = " + soma);
		System.out.println("M�dia = " + soma / notas.length);
	}
}
