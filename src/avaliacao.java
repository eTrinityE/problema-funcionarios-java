import java.util.Locale;
import java.util.Scanner;

public class avaliacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horastrab, valorhr;
		char escolha;
		String nome;
		
		
		System.out.println("Nome: ");
		nome = sc.next();
		
		System.out.println("Horas trabalhadas: ");
		horastrab = sc.nextInt();
		
		System.out.println("Valor por hora: ");
		valorhr = sc.nextInt();
		
		System.out.println("Digitar outro (S/N)?");
		escolha = sc.next().charAt(0);
		
		while (escolha == 'S') {
			System.out.println("Nome: ");
			nome = sc.next();
			
			System.out.println("Horas trabalhadas: ");
			horastrab = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			valorhr = sc.nextInt();
			
			System.out.println("Digitar outro (S/N)?");
			escolha = sc.next().charAt(0);
		}
		
	}

}
