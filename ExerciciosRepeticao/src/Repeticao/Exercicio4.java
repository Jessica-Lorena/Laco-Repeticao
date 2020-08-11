package Repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) 
	{
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * - o número de pessoas calmas; 
		 * - o número de mulheres nervosas; 
		 * - o número de homens agressivos; 
		 * - o número de outros calmos;
		 * - o número de pessoas nervosas com mais de 40 anos; 
		 * - o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner ler = new Scanner (System.in);
		
		int x=1,i,s,op,pc=0,mn=0,ha=0,oc=0,pn40=0,pc18=0;
		/*i = idade, s = sexo, op = opção, pc = pessoas calmas, mn = mulheres nervosas, ha = homens agressivos
		 * oc = outros calmos, pn40 = pessoas nervosas com mais de 40 anos, pc18 = pessoas calmas com menos de 18 anos */
		
		while(x <= 150)
		{
			System.out.printf("Entre com a sua idade: ");
			i = ler.nextInt();
			while(i < 0 || i > 117)
			{
				System.out.printf("Idade inválida\nEntre com a sua idade: ");
				i = ler.nextInt();
			}
			System.out.printf("Entre com a seu sexo: (1-feminino / 2-masculino / 3-Outros) ");
			s = ler.nextInt();
			while(s <1 || s > 3)
			{
				System.out.printf("Opção fora do sistema\nEntre com a seu sexo: (1-feminino / 2-masculino / 3-Outros) ");
				s = ler.nextInt();
			}
			System.out.printf("Selecione como se considera: (1 -calmo(a) / 2 - nervoso(a) / 3 - agressivo(a) ");
			op = ler.nextInt();
			while(op <1 || op > 3)
			{
				System.out.printf("Opção fora do sistema\nSelecione uma como se considera: (1 -calmo(a) / 2 - nervoso(a) / 3 - agressivo(a) ");
				op = ler.nextInt();
			}
			if(op == 1) 
			{
				pc++;
			}
			if(s == 1 && op == 2)
			{
				mn++;
			}
			if(s == 2 && op == 3)
			{
				ha++;
			}
			if(s == 3 && op == 1)
			{
				oc++;
			}
			if(i > 40 && op == 2)
			{
				pn40++;
			}
			if(i < 18 && op == 1)
			{
				pc18++;
			}
			x++;
		}
		System.out.println("Pessoas calmas: " + pc + "\nMulheres nervosas: " + mn + "\nHomens agressivos: " + ha + "\nOutros calmes: " + oc);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + pn40 + "\nPessoas calmas com menos de 18 anos: " + pc18);
	}

}
