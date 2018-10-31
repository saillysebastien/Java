package project1;

class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Vous essayer d'instancier une ville avec un nombre d'habitants négatifs !");
	}
}
