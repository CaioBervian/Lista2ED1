package Lista3;

import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Exercicio1 {

		static int d = 0;
		static int m = 0;
		static int a = 0;
		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			int tamanho = 0;
			String data = "";
			do {
				System.out.println("Informe uma data no formato (DD/MM/AAAA)");
				data = entrada.nextLine();
				tamanho = data.length();
			} while (tamanho < 6);

			String vetor[] = new String[3];
			char letra = data.charAt(2);
			char letra2 = data.charAt(5);
			if (letra == '/' || letra2 == '/') {
				vetor = data.split("/");
				d = Integer.parseInt(vetor[0]);
				m = Integer.parseInt(vetor[1]);
				a = Integer.parseInt(vetor[2]);

				if (dataValida() == true)
					System.out.println("A data é válida");
				else {
					System.out.println("A data não é válida");
				}
			} else {
				System.out.println("Sintaxe incorreta!");
			}
			if (anobissexto() == true)
				System.out.println("É ano bissexto");
			else
				System.out.println("Não é ano bissexto");
			
			
			dataextenso();
			entrada.close();
		}

		public static boolean dataValida() {
			if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
				if (d > 0 && d <= 30)
					return true;
				else {
					return false;
				}
			} else {
				if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12)) {
					if (d > 0 && d <= 31)
						return true;
					else {
						return false;
					}
				} else {
					if (m == 2) {
						if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
							if (d > 0 && d <= 29)
								return true;
							else {
								return false;
							}
						} else {
							if (d > 0 && d <= 28)
								return true;
							else {
								return false;
							}
						}
					} else {
						return false;
					}
				}
			}}
		
		
	
		public static boolean anobissexto() {
				if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
						return true;
							
			}
			return false;}

		public static void dataextenso() {

		        // PEGO AQUI A DATA ATUAL
		        Date data = new Date();

		        // CRIO AQUI UM FORMATADOR
		        // PASSANDO UM ESTILO DE FORMATAÇÃO : DateFormat.FULL
		        // E PASSANDO UM LOCAL DA DATA : new Locale("pt", "BR")
		        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));

		        // FORMATO A DATA, O FORMATADOR ME RETORNA 
		        // A STRING DA DATA FORMATADA 
		        String dataExtenso = formatador.format(data);


		        // MOSTRA A DATA
		        System.out.println("Data com o dia da semana : " + dataExtenso);


		        // AQUI É CASO VOCÊ QUEIRA TIRAR
		        // O DIA DA SEMANA QUE APARECE NO 
		        // PRIMEIRO EXEMPLO
		        int index  = dataExtenso.indexOf(",");
		        int lenght = dataExtenso.length();


		        // MOSTRA A DATA
		        System.out.println("Data sem o dia da semana :  " + dataExtenso.substring(++index, lenght));

		    }
		
		}