package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		
		Scanner ler = new Scanner(System.in);
		
		int x,n,p=0,i=0;
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			
			if(n%2 == 0)
			{
				p++;
			}
			else if(n%2 != 0)
			{
				i++;
			}
		}
		System.out.println("Foram digitados " + p + " n�meros pares e " + i + " n�meros �mpares");
	}

}
