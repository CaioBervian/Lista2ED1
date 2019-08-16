package Lista3;

import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Exercicio3 contato = new Exercicio3();
		int comando;
		boolean on = true;
		while(on) {
			System.out.println("Digite 1 para inserir um novo contato");
			System.out.println("Digite 2 para consultar os contatos");
			System.out.println("Digite 3 para excluir um contato");
			System.out.println("Digite 4 para consultar contatos com renda mensal acima da média");
			System.out.println("Digite 5 para consultar os contatos que nasceram entre 1980 e 2000");
			System.out.println("Digite 6 para sair");
			System.out.println("\n");
			comando = entrada.nextInt();
			contato.Exercicio3(comando);
			if(comando==6) {
				on = false;
			}
			
		}
		entrada.close();
	}

}
