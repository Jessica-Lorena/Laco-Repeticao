package Repeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) 
	{
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		
		int m3=0; //m3 = M�ltiplo de 3
		float media,x,soma=0; 
		
		System.out.printf("Entre com um n�mero (Para finalizar o programa digite \"0\") ");
		x = ler.nextInt();
		do
		{
			if(x%3 == 0)
			{
				++m3;
				soma = soma + x;
			}
			System.out.printf("Entre com um n�mero (Para finalizar o programa digite \"0\") ");
			x = ler.nextInt();
		}while(x != 0);
		media = soma /(m3);
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 digitados �: " + media);
	}

}
