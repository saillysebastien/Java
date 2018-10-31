package project1;

import java.util.Scanner;

public class boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		
		while (reponse == 'O' || reponse == 'o') {
			System.out.println("Donnez un prénom :");
			prenom = sc.nextLine();
			System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
			
			reponse = ' ';
			while((reponse != 'O' && reponse != 'N') && (reponse != 'o' && reponse != 'n')) {
				System.out.println("Voulez vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}
		}
		
		System.out.println("Au revoir ...");
	}
}
