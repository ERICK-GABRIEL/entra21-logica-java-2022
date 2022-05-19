package br.com.entra21.vertores.pratica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcao;

		do {
			System.out.println(escreverMenu());
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;

			case 1:
				exibirTamanhoVetores();
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				exibirVetoresAndAlimentar();
				break;

			case 4:
				exibirTamanhoParaInincializar();
				break;

			case 5:
				exibirPercorrerVetorInicializadoCrescenteDecrescente();
				break;

			case 6:
				exibirVetorInteirosNaoInicializado();
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDouble tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 1, 3, 5, 7, 9 };
		System.out.println("vetorBytes tamanho = " + vetorBytes.length);

		short vetorShorts[] = { 100, 300, 500, 700, 900 };
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);

		int vetorInts[] = { 1000, 3000, 5000, 7000, 9000 };
		System.out.println("vetorInts tamanho = " + vetorInts.length);

		long vetorLongs[] = { 10000, 30000, 50000, 70000, 90000 };
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);

		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("vetorChars tamanho = " + vetorChars.length);

		float vetorFloats[] = { 100000.10f, 300000.30f, 500000.50f, 700000.70f, 900000.90f };
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);

		double vetorDoubles[] = { 1000000.100d, 3000000.300d, 5000000.500d, 7000000.700d, 9000000.900d };
		System.out.println("vetorDouble tamanho = " + vetorDoubles.length);

		boolean vetorBooleans[] = { true, false, true, true, false };
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);
	}

	public static void exibirVetoresAndAlimentar() {

		byte vetorBytes[] = new byte[5];

		Scanner entrada = new Scanner(System.in);

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("Inicializando a posição " + (contador + 1) + " no indice " + contador);
			vetorBytes[contador] = entrada.nextByte();

		}

	}

	public static void exibirTamanhoParaInincializar() {
		Scanner entrada = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();

		vetorBytes = new byte[tamanho];
		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Informe o valor para o item " + (contador + 1) + " no índice [" + contador + "]");
			vetorBytes[contador] = entrada.nextByte();

		}

	}

	public static void exibirPercorrerVetorInicializadoCrescenteDecrescente() {
		byte vetorByte[] = { 28, 13, 56, 32, 34 };
		for (byte contador = 0; contador < vetorByte.length; contador++) {
			System.out.println(vetorByte[contador]);

		}

		System.out.println("--------------------");

		for (byte contador = (byte) (vetorByte.length - 1); contador >= 0; contador--) {
			// comecando com o valor -1 porque o indice sempre tem um valor a menos
			// condicao de permanencia, enquanto meu contador for maior que 0, comecei com
			// valor alto e pretendo parar ao chegar ao 0,
			// como uma repeticao decrescente utilizo o decremento no contador
			System.out.println(vetorByte[contador]);
		}
	}

	public static void exibirVetorInteirosNaoInicializado() {

		byte vetorBytes[] = new byte[10];
		Scanner entrada = new Scanner(System.in);
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe um valor para o indice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Informe um indice válido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte();// Se o usuario digitar um valor valido esse index sera usado no meu DO
												// principal, onde a logica se repete

				} while (index < 0 || index >= vetorBytes.length);// A posicao escolhida nao pode ser menor do que 0 nem
																	// o tamanho do vetor ou superior
				// Exemplo: O range valido é de 0 a 9, qualquer numero alem disso fica preso
				// nesse loop

			}

		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);

		}

	}

	public static String escreverMenu() {
		String menu = "Escolha uma opção do menu de Práticas\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar um vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer: Do inicio ao fim, Do fim ao inicio, Para exibir os valores\n";
		menu += "6 - Criar um vetor de inteiros não inicializado\n";
		menu += "---------------------------------------------";

		return menu;

	}
}
