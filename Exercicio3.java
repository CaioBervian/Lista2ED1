package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	final int TAM = 10;
	Scanner entrada = new Scanner(System.in);
	String nome[] = new String[TAM];
	int nascimento[] = new int[TAM];
	float renda[] = new float[TAM];
	int num = 0, num5 = 0, num4=0;
	float rendat = 0;
	
	public void Exercicio3 (int n1) {
		
		if(num>TAM) {
			System.out.println("Número de contatos máximo atingido");
		} else {
		if(n1==1) {
			System.out.println("Digite o nome");
			nome[num] = entrada.next();
			System.out.println("Digite a data de nascimento");
			nascimento[num] = entrada.nextInt();
			System.out.println("Digite a renda mensal");
			renda[num] = entrada.nextFloat();
			num+=1;
			
		} else if(n1==2) {
			for(int x=0; x<num; x++) {
				System.out.println("Contato "+x+" "+ nome[x]);
				System.out.println("Contato "+x+" "+ nascimento[x]);
				System.out.println("Contato "+x+" "+ renda[x]);
				System.out.println("\n");
			}
		} else if(n1==3) {
			System.out.println("Qual contato deseja excluir?");
			int n2 = entrada.nextInt();
			nome[n2] = null;
			nascimento[n2] = 0;
			renda[n2] = 0;
			System.out.println("\n");
		} else if(n1==4) {
			for(int x=0; x<num;x++) {
				rendat = rendat + renda[x];
			}
			rendat = rendat/num;
			for(int x=0; x<num; x++) {
				if(renda[x]>rendat) {
					num4++;
				}
			}
			System.out.println(num4 + " Pessoas tem renda acima da média \n");
			
		} else if(n1==5) {
			for(int x=0; x<num; x++) {
				if(nascimento[x]>=1980 && nascimento[x]<=2000) {
					num5 = num5+1;
				}
			}
			System.out.println(num5 + " Pessoas nasceram entre 1980 e 2000 \n");
		}
		
		
		
	}
		}
}
