package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operadores relacionais");
		
		System.out.println("Menor < ( dica voltando ou apagando <<<<<----- )");
		
		byte idadeA=30, idadeB=50; //(Outra forma de dar valor a variavel)
		boolean resultado;
		
		idadeA = 30;
		idadeB = 50;
		
		resultado = idadeA < idadeB; // idadeA é menor que idadeB?;
		
		System.out.println("idadeA é menor que idadeB ? " +resultado);
		
		System.out.println("idadeA é menor que idadeB ?" + (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println(idadeA+ " é menor ou igual que "+ idadeB+ " ?" +resultado);
		
		System.out.println("Maior > ( dica é sempre em frente ----->>>>>>)_");

		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+" é maior (>) que " +idadeB+" ? "+resultado );
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+ " é maior ou igual (>=) que "+idadeB+" ? "+resultado );
	}

}
