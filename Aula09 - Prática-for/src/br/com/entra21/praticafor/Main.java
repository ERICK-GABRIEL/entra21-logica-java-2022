package br.com.entra21.praticafor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------PRATICANDO TABUADA COM CONTADOR----------\n");
		Scanner entrada = new Scanner(System.in);
		
		int opcaonumero;
		int contador;
		System.out.println("Escolha o número que deseja saber a tabuada:\n");
		opcaonumero = entrada.nextInt();
	    System.out.println("Tabuada do "+opcaonumero);
		for(contador = 1; contador <=10; contador ++) {
			System.out.println(+opcaonumero+ "x" +contador+ " = " + (contador*opcaonumero));
		
		}
		
		
		
	}

}
