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
		System.out.println("Muito bem " + nome + ", agora informe o mês que você nasceu:");

		System.out.println(
				"1-JANEIRO\n2-FEVEREIRO\n3-MARÇO\n4-ABRIL\n5-MAIO\n6-JUNHO\n7-JULHO\n8-AGOSTO\n9-SETEMBRO\n10-OUTUBRO\n11-NOVEMBRO\n12-DEZEMBRO\n");
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
		case "março":
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
			System.out.println("Este mês não existe, Verifique se sua ortografia está correta e tente novamente.");
			break;
		}
	}

	public static void VerJaneiro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo é AQUÁRIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é CÁPRICORNIO!");
		}
	}

	public static void VerFevereiro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 19) {
			System.out.println("Legal " + nome + ", seu signo é PEIXES!");

		} else {
			System.out.println("Legal " + nome + ", seu signo é AQUÁRIO!");
		}
	}

	public static void VerMarco(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo é ÁRIES!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é PEIXES!");
		}
	}

	public static void VerAbril(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo é TOURO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é ÁRIES!");
		}
	}

	public static void VerMaio(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo é GÊMEOS!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é TOURO!");
		}
	}

	public static void VerJunho(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 21) {
			System.out.println("Legal " + nome + ", seu signo é CÂNCER!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é GÊMEOS!");
		}

	}

	public static void VerJulho(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo é LEÃO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é CÂNCER!");
		}
	}

	public static void VerAgosto(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo é VIRGEM!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é LEÃO!");

		}

	}

	public static void VerSetembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo é LIBRA!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é VIRGEM!");

		}
	}

	public static void VerOutubro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 23) {
			System.out.println("Legal " + nome + ", seu signo é ESCORPIÃO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é LIBRA!");
		}
	}

	public static void VerNovembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 22) {
			System.out.println("Legal " + nome + ", seu signo é SAGITÁRIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é ESCORPIÃO!");

		}
	}

	public static void VerDezembro(byte escolhadia, String nome) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Muito bem, agora informe o dia do seu nascimento:");
		escolhadia = entrada.nextByte();
		if (escolhadia >= 22) {
			System.out.println("Legal " + nome + ", seu signo é CAPRICÓRNIO!");
		} else {
			System.out.println("Legal " + nome + ", seu signo é SAGITÁRIO!");

		}
	}
}
