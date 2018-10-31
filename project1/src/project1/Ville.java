package project1;

public class Ville {
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	
	//Constructeur par défaut
	public Ville() {
		nbreInstances++;
		nbreInstancesBis++;
		
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
	}
	
	//Constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays) {
		nbreInstances++;
		nbreInstancesBis++;
		
		System.out.println("Création d'une ville avec paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	
	public static int getNombreInstancesBis(){
		return nbreInstancesBis;
	}
	
	// Accesseurs
	public String getNom() {
		return nomVille;
	}
	
	public String getPays() {
		return nomPays;
	}
	
	public int getNombreHabitants() {
		return nbreHabitants;
	}
	
	public char getCategorie() {
	return categorie;	
	}
	
	// Mutateurs
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}
	
	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
	}
	
	private void setCategorie() {
		
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		while(i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;
		
		this.categorie = categories[i];
	}
	//Retourne la description de la ville 
	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " 
		+ this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;
	}
	
	//Retourne une chaîne de caractères selon le résultat
	public String comparer(Ville ville1) {
		String str = new String();
		if(ville1.getNombreHabitants() > this.nbreHabitants)
			str = ville1.getNom() + " est une ville plus peuplée que " + this.nomVille;
		
		else 
			str = this.nomVille + " est une ville plus peuplée que " + ville1.getNom();
		
		return str;
	}
}

class Capitale extends Ville {
	private String monument;
	
	public Capitale() {
		// Ce mot clé appelle le constructeur de la classe mère
		super();
		monument = "Aucun";
	}
	
	public Capitale(String nom, int hab, String pays, String monument) {
		super(nom, hab, pays);
		this.monument = monument;
	}
	
	public String toString(){
	    String str =  super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
	    System.out.println("Invocation de super.decrisToi()");
	    
	    return str;
	}
	
	public String getMonument() {
		return monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}
}
