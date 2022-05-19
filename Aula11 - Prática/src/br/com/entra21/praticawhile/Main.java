
package br.com.entra21.praticawhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Calculando a soma");
			System.out.println("2 - Repetir 20 vezes");
			System.out.println("3 - Entre 20 pessoas exiba a soma das idades");
			System.out.println("4 - Entre 20 idades pessoas quantas são de maior");
			System.out.println("5 - Leia o nome e a idade de 10 pessoas e exiba o nome da mais nova");
			System.out.println("6 - ");
			System.out.println("7 - ");
			System.out.println("8 - Somar números, e quando digitar número negativo sair");
			System.out.println("9 - Solicite a quantidade de notas e caucule a média do aluno ");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				calculandoASoma();
				break;

			case 2:
				runRepeat20();
				break;

			case 3:
				sumAge();
				break;

			case 4:
				maioresDeIdade();
				break;

			case 5:
				exibirMaisNovo();
				break;

			case 6:
				break;

			case 7:
				break;

			case 8:
				encerrarNegativo();
				break;

			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida");
				break;
			}
		} while (option != 0); // Em quanto o usuário não informar "0" o while vai repetir
		// O "0" é a opção de sair do programa
		System.out.println("Obrigado por executar o programa Lista de Exercícios!");
	}

	private static void mediaAlunos() {

		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;

		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {

			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {

				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();

				if (resposta.equals("sim")) {

					contador--;

				}

			}

			soma = soma + nota;

		} while (contador <= qtd);

		System.out.println("Soma =" + soma);

	}

	private static void encerrarNegativo() {
		Scanner entrada = new Scanner(System.in);
		int number, sum = 0;

		do {
			System.out.println("Qual número você quer somar?");
			number = entrada.nextInt();
			if (number >= 0) {
				sum = sum + number;
			}

		} while (number >= 0);// enquanto o número for maior do que zero, repita

		System.out.println("A soma dos seus números é: " + sum);
	}

	private static void exibirMaisNovo() {
		Scanner entrada = new Scanner(System.in);
		String nome, maisJovem = "";
		byte idade, idadeMenor = 0;

		for (byte contador = 1; contador <= 3; contador++) {
			System.out.println("Digite seu nome: ");
			nome = entrada.next();
			System.out.println("Digite sua idade:");
			idade = entrada.nextByte();

			if (contador == 1) {
				idadeMenor = idade;
				maisJovem = nome;
				System.out.println("Sou o primeiro e por isso sou o mais novo: " + nome + " com " + idade + " anos");
			} else {
				// a partir do segundo laco ja tenho como comparar menorIdade
				System.out.println("Estou no laço " + contador + " e preciso verificar");
				if (idade < idadeMenor) {
					System.out.println(
							"Ainda bem que eu testei porque a pessoa mais nova é: " + nome + " com " + idade + " anos");
					idadeMenor = idade;
					maisJovem = nome;
				}
			}

			System.out.println("\nApós tudo isso o mais novo é o (a) " + maisJovem + " com " + idadeMenor + " anos.");
		}
	}

	private static void maioresDeIdade() {
		System.out.println("Exibir apenas maiores de idade");
		byte maiores = 0;
		byte idade;
		Scanner input = new Scanner(System.in);
		for (byte cont = 1; cont <= 5; cont++) {
			System.out.println("Informe a idade da pessoa 1 " + cont);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
			}
			System.out.println("\nEntre " + cont + " Pessoas apenas " + maiores + " são maiores de idade.");
		}
	}

	private static void sumAge() {

		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 20; count++) {
			System.out.println("No momento a soma está em " + sumAge + "\n");
			System.out.println("Por favor, insira sua idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

			System.out.println("A soma total das idades foi: " + sumAge);
		}
	}

	private static void runRepeat20() {

		for (byte cont = 1; cont < 20; cont++) {
			System.out.println("Eu gosto de algoritmos " + (cont % 5 == 0 ? "\n\n\t" : ""));
			// if(cont%5==0) {
			// System.out.println("\n");
			// }
		}

	}

	public static void calculandoASoma() {
		System.out.println("CALCULANDO A SOMA");
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		System.out.println("Escolha o número inicial da soma sequencial");
		soma = entrada.nextInt();
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println("Soma = soma + counter, " + soma + " = " + soma + "+" + counter + " ==> "
					+ (soma + counter) + "\n");
			soma = soma + counter;
			System.out.println("Número " + counter + " e a soma é : " + soma);
		}
	}

}