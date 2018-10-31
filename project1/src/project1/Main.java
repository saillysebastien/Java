package project1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Langage lang : Langage.values()) {
			if(Langage.Java.equals(lang))
				System.out.println("J'aime le " + lang);
			else
				System.out.println(lang);
		}
	}

}
