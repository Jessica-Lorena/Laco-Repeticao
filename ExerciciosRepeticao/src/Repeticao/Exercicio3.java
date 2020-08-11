package Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) 
	{
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		
		int idade,in=0,menos21=0,e21e50=0,mais50=0,GB=0; 
		/*in representa idade negativa, e21e50 representa entre 21 e 50, 
		 * GB representa novas pessoas mais velhas do mundo que merecem estar no Guinness Book*/
		
		System.out.printf("Entre com a sua idade: (Para finalizar o programa digite \"-99\") ");
		idade = ler.nextInt();
		
		while(idade != -99)
		{
			if(idade < 0)
			{
				in++;
			}
			if(idade >= 0 && idade < 21)
			{
				menos21++;
			}
			else if (idade >= 21 && idade <= 50)
			{
				e21e50++;
			}
			else if (idade > 50 && idade <= 117)
			{
				mais50++;
			}
			else if (idade > 117)
			{
				GB++;
			}
			System.out.printf("\nEntre com a sua idade: (Para finalizar o programa digite \"-99\") ");
			idade = ler.nextInt();
		}
		System.out.println("\nTotal de pessoas com idade negativa: " + in + "\nTotal de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Total de pessoas com idade entre 21 e 50 anos: " + e21e50 + "\nTotal de pessoas com mais de 50 anos: " + mais50);
		System.out.println("Total de novas pessoas mais velhas do mundo que merecem estar no Guinness Book: " + GB);
	}

}
