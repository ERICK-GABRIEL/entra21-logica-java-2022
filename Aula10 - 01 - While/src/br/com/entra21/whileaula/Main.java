package br.com.entra21.whileaula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aprendendo sobre WHILE e DO WHILE
		System.out.println("Escolha uma opção para aprender hoje:\n");
		System.out.println("\t0 - Sair\n\t1 - While\n\t2 - Do While");

		// instanciando um obnjeto da classe Scanner e já utilzando o metodo next
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
			System.out.println("OPÇÃO INVÁLIDA!");
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
			System.out.println("Informe o dia de seu aniversário (1 à 31):");
			dia = entrada.nextByte();
		} while (dia > 31);// repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenha errado muito...\n");

		byte mes;
		byte contador=0;

		do {
			System.out.println(contador+" Erros até o momento");
			System.out.println("Informe o mes de seu aniversário (1 à 12):");
			mes = entrada.nextByte();
			contador++;

		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);
		System.out.println("Finalmente vc digitou corretamente "+dia+"/"+mes+" errou "+--contador+" vezes!");

		main(null);

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender WHILE aqui.\n");
		byte contagem = 1;
		while (contagem <= 10) {// condição de permanencia //// enquanto contagem for menor ou igual a 10
								// execute
			System.out.println("\tContando..." + contagem);
			contagem++;
		}
		// para fazer uam repetição com base em quantidade é gerado muito código
		System.out.println("\nAcabei!\n");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repetição?");
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("continuar")) {
			System.out.println("Vc respondeu: " + resposta);
			System.out.println("\nDeseja continuar?");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while com base em decisão\n");
		main(null);
	}
}
