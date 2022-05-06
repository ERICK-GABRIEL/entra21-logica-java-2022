package br.com.entra21.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("VAMOS DESCOBRIR SEU SIGNO");

		String opcao;
		String nome;
		byte dia = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Primeiro informe seu nome:");
		nome = entrada.nextLine();
		System.out.println("Muito bem " + nome + ", agora informe o m�s que voc� nasceu:");

		System.out.println(
				"1-JANEIRO\n2-FEVEREIRO\n3-MAR�O\n4-ABRIL\n5-MAIO\n6-JUNHO\n7-JULHO\n8-AGOSTO\n9-SETEMBRO\n10-OUTUBRO\n11-NOVEMBRO\n12-DEZEMBRO\n");
		opcao = entrada.next();
		opcao = opcao.toLowerCase();
		switch (opcao) {

		case "1":
		case "janeiro":
			VerJaneiro(dia, nome);
			break;

		case "2":
		case "fevereiro":
			VerFevereiro(dia, nome);
			break;

		case "3":
		case "marco":
		case "mar�o":
			VerMarco(dia, nome);
			break;

		case "4":
		case "abril":
			VerAbril(dia, nome);
			break;

		case "5":
		case "maio":
			VerMaio(dia, nome);
			break;

		case "6":
		case "junho":
			VerJunho(dia, nome);
			break;

		case "7":
		case "julho":
			VerJulho(dia, nome);
			break;

		case "8":
		case "agosto":
			VerAgosto(dia, nome);
			break;

		case "9":
		case "setembro":
			VerSetembro(dia, nome);
			break;

		case "10":
		case "outubro":
			VerOutubro(dia, nome);
			break;

		case "11":
		case "novembro":
			VerNovembro(dia, nome);
			break;

		case "12":
		case "dezembro":
			VerDezembro(dia, nome);
			break;

		default:
			System.out.println("Este m�s n�o existe, Verifique se sua ortografia est� correta e tente novamente.");
			break;
		}
	}

	public static void VerJaneiro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo � AQU�RIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � C�PRICORNIO!");
		}
	}

	public static void VerFevereiro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 19) {
			System.out.println("Legal " + nome + ", seu signo � PEIXES!");

		} else {
			System.out.println("Legal " + nome + ", seu signo � AQU�RIO!");
		}
	}

	public static void VerMarco(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo � �RIES!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � PEIXES!");
		}
	}

	public static void VerAbril(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo � TOURO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � �RIES!");
		}
	}

	public static void VerMaio(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo � G�MEOS!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � TOURO!");
		}
	}

	public static void VerJunho(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo � C�NCER!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � G�MEOS!");
		}

	}

	public static void VerJulho(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo � LE�O!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � C�NCER!");
		}
	}

	public static void VerAgosto(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo � VIRGEM!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � LE�O!");

		}

	}

	public static void VerSetembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo � LIBRA!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � VIRGEM!");

		}
	}

	public static void VerOutubro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo � ESCORPI�O!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � LIBRA!");
		}
	}

	public static void VerNovembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 22) {
			System.out.println("Legal " + nome + ", seu signo � SAGIT�RIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � ESCORPI�O!");

		}
	}

	public static void VerDezembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 22) {
			System.out.println("Legal " + nome + ", seu signo � CAPRIC�RNIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo � SAGIT�RIO!");

		}
	}
}
