package project1;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// Notre objet Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// initialisation des variables
		double aConvertir, convertit=0;
		char reponse = ' ', mode = ' ';
		
		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		
		do {
			do {
				mode = ' ';
				System.out.println("Choisissez le mode de conversion : ");
				System.out.println("1 - Convertisseur Celsius en Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit en Celsius");
				mode = sc.nextLine().charAt(0);
			if(mode != '1' && mode != '2')
				System.out.println("Mode inconnu, veuillez réitérez votre choix");
				
			}while(mode != '1' && mode != '2');
				
				//Saisie de la température à convertir
				
			System.out.println("Température à convertir");
			aConvertir = sc.nextDouble();
			sc.nextLine();
			
			// Selon le mode, on calcule différemment et on affiche le résultat
			if(mode == '1') {
				convertit = ((9.0/5.0) * aConvertir) + 32.0;
				System.out.print(aConvertir + " °C correspond à : ");
				System.out.println(arrondi(convertit, 2) + "°F");
			}
			else {
				convertit = ((aConvertir - 32.0) * 5 / 9);
				System.out.print(aConvertir + " °F correspond à : ");
				System.out.println(arrondi(convertit, 2) + "°C");
			}
			
			// On invite l'utilisateur à recommencer
			do {
				System.out.println("Voulez vous recommencer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
				
			}while(reponse == 'O' && reponse != 'N');
			
		} while(reponse == 'O');
		
		System.out.println("Au revoir, à bientôt");
	}
	
	public static double arrondi(double A, int B) {
		return(double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
