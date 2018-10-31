package project1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loup l = new Loup("Gris bleuté", 20);
		l.boire();
		l.crier();
		l.manger();
		l.deplacement();
		System.out.println(l.toString());
		System.out.println("------------------------------");
		
		Chien c = new Chien("Sable", 14);
		c.boire();
		c.crier();
		c.manger();
		c.deplacement();
		System.out.println(c.toString());
		
		System.out.println("------------------------------");
		// Les méthodes de l'interface
		c.faireCalin();
		c.faireLechouille();
		c.faireLeBeau();
		
		System.out.println("------------------------------");
		Rintintin r = new Chien();
		r.faireCalin();
		r.faireLechouille();
		r.faireLeBeau();
		System.out.println("------------------------------");
		
		Chat y = new Chat("Blanche", 8);
		y.boire();
		y.crier();
		y.manger();
		y.deplacement();
		System.out.println(y.toString());

	}

}
