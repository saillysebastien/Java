package project1;

public class AvantEnumeration {
	
	public void fait(Langage param) {
		if(param.equals(Langage.Java))
			System.out.println("Fait à la façon 1");
		if(param.equals(Langage.PHP))
			System.out.println("Fait à la façon 2");			
	}
	
	public static void main(String args[]) {
		AvantEnumeration ae = new AvantEnumeration();
		ae.fait(Langage.Java);
		ae.fait(Langage.PHP);
	}
}
