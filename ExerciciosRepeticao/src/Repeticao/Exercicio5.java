package Repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) 
	{
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		
		int x, soma=0;
		
		System.out.printf("Entre com um número");
		x = ler.nextInt();
		
		do
		{
			soma = soma + x;
			System.out.printf("Entre com um número");
			x = ler.nextInt();
		}while(x != 0);
		
		System.out.println("Soma dos números digitados: " + soma);
	}

}
