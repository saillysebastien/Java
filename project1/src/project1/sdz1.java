package project1;

import java.util.Scanner;

public class sdz1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world !");
		System.out.println("My name is");
		System.out.println("SEB");
		
		double nbre1 = 10, nbre2 = 3;
		int resultat = (int)(nbre1 / nbre2);
		System.out.println("Le résultat est = " + resultat);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		
		System.out.println("Saisissez un nombre :");
		Scanner sf = new Scanner(System.in);
		String stf= sf.nextLine();
		char carac = stf.charAt(0);
		System.out.println("Vous avez saisi le caractère :" + stf);
	}

}
