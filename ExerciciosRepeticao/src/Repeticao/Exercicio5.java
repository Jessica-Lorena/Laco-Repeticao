package Repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) 
	{
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		
		int x, soma=0;
		
		System.out.printf("Entre com um n�mero");
		x = ler.nextInt();
		
		do
		{
			soma = soma + x;
			System.out.printf("Entre com um n�mero");
			x = ler.nextInt();
		}while(x != 0);
		
		System.out.println("Soma dos n�meros digitados: " + soma);
	}

}
