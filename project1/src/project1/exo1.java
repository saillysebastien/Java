package project1;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 20, i = 0;
		try {
			System.out.println(j/0);
		} catch (ArithmeticException e) {
			System.out.println("Division par zéro !");
			//System.out.println("Division par zéro !" + e.getMessage());
		}
		System.out.println("coucou toi !");
	}
}
