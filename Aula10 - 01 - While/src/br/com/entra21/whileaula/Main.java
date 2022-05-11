package br.com.entra21.whileaula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aprendendo sobre WHILE e DO WHILE
		System.out.println("Escolha uma op��o para aprender hoje:\n");
		System.out.println("\t0 - Sair\n\t1 - While\n\t2 - Do While");

		// instanciando um obnjeto da classe Scanner e j� utilzando o metodo next
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "socorro":
			System.exit(1);
		case "0", "sair":
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("OP��O INV�LIDA!");
			main(null);
			break;
		}
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender DO WHILE aqui.");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs PITA e REPITA, PITA morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("repita"));

		byte dia;

		do {
			System.out.println("Informe o dia de seu anivers�rio (1 � 31):");
			dia = entrada.nextByte();
		} while (dia > 31);// repetir enquanto informar algo maior que 31
		System.out.println("Espero que n�o tenha errado muito...\n");

		byte mes;
		byte contador=0;

		do {
			System.out.println(contador+" Erros at� o momento");
			System.out.println("Informe o mes de seu anivers�rio (1 � 12):");
			mes = entrada.nextByte();
			contador++;

		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);
		System.out.println("Finalmente vc digitou corretamente "+dia+"/"+mes+" errou "+--contador+" vezes!");

		main(null);

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender WHILE aqui.\n");
		byte contagem = 1;
		while (contagem <= 10) {// condi��o de permanencia //// enquanto contagem for menor ou igual a 10
								// execute
			System.out.println("\tContando..." + contagem);
			contagem++;
		}
		// para fazer uam repeti��o com base em quantidade � gerado muito c�digo
		System.out.println("\nAcabei!\n");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repeti��o?");
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("continuar")) {
			System.out.println("Vc respondeu: " + resposta);
			System.out.println("\nDeseja continuar?");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while com base em decis�o\n");
		main(null);
	}
}
