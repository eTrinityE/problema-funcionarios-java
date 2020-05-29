import java.util.Locale;
import java.util.Scanner;

public class avaliacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horastrab, valorhr, custototal, custoparcial, totalhrs, opcaomenu;
		char escolha;
		String nome;
		
		
		totalhrs = 0;
		
		System.out.println("Nome: ");
		nome = sc.next();
		
		System.out.println("Horas trabalhadas: ");
		horastrab = sc.nextInt();
		
		System.out.println("Valor por hora: ");
		valorhr = sc.nextInt();
		
		System.out.println("Digitar outro (S/N)?");
		escolha = sc.next().charAt(0);
		
		custoparcial = horastrab * valorhr;
		custototal = 0;
		custototal = custototal + custoparcial;
		
		totalhrs = totalhrs + horastrab;
		
	
		while (escolha == 'S' || escolha == 's') {
			System.out.println("Nome: ");
			nome = sc.next();
			
			System.out.println("Horas trabalhadas: ");
			horastrab = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			valorhr = sc.nextInt();
			
			System.out.println("Digitar outro (S/N)?");
			escolha = sc.next().charAt(0);
			
			custoparcial = horastrab * valorhr;
			custototal = custototal + custoparcial;
			
			totalhrs = totalhrs + horastrab;
		}
		
		opcaomenu = 0;
		
		while (opcaomenu != 4) {
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opcão: ");
			opcaomenu = sc.nextInt();
			
			if (opcaomenu == 1) {
				System.out.println("Total de horas = " + totalhrs);
			}
			else if (opcaomenu == 2) {
				System.out.println("Custo total = R$ " + custototal);
			}
			else if (opcaomenu == 3) {
				System.out.println("Pessoa que ganhou mais: " + nome);
			}
			else if (opcaomenu == 4) {
				System.out.println("FIM DO PROGRAMA!");
			}
		}
		
		sc.close();
		
	}

}
