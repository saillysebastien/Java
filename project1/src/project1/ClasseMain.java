package project1;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville = new Ville();
		System.out.println("Ville : " +ville.getNom() + "\n" + "Pays : " + ville.getPays() + "\n" + "Nombre d'habitants : " + ville.getNombreHabitants());
		Ville ville1 = new Ville("Paris", 123456789, "France");
		System.out.println("Ville : " +ville1.getNom() + "\n" + "Pays : " + ville1.getPays() + "\n" + "Nombre d'habitants : " + ville1.getNombreHabitants());
		
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 1236, "France");       
		Ville v2 = new Ville("Rio", 321654, "Brésil");
		        
		System.out.println("\n\n"+v1.toString());
		System.out.println(v.toString());
		System.out.println(v2.toString()+"\n\n");
		System.out.println(v1.comparer(v2));
		
		Ville v3 = new Ville();                
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
			                        
		Ville v4 = new Ville("Marseille", 1236, "France");        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
		                
		Ville v5 = new Ville("Rio", 321654, "Brésil");        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
		
		Capitale cap = new Capitale();
		System.out.println(cap.toString());
		Capitale cap2 = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println("\n"+cap2.toString());
		
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		        
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++){
		  if (i < 3){
		    Ville V = new Ville(tab[i], tab2[i], "France");
		    tableau[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab[i], tab2[i], "France", "La tour Eiffel");
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Ville V : tableau){
		  System.out.println(V.toString()+"\n");
		}
		
		//Définition d'un tableau de villes null
		Ville[] tableau2 = new Ville[6];
		        
		//Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
		String[] tab3 = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab4 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des Villes
		//et le reste des capitales
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    Ville V = new Ville(tab3[i], tab4[i], "france");
		    tableau2[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab3[i], tab4[i], "france", "la tour Eiffel");
		    tableau2[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){
		  System.out.println(obj.toString()+"\n");
		}		
	}

}
