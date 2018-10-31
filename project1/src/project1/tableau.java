package project1;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tab[][]= {{"toto", "titi", "tutu", "tata", "tete"}, {"1", "2", "3", "4"}};
		int i = 0, j = 0;
		
		for(String sousTab[] : tab) {
			i = 0;
			for(String str : sousTab) {
				System.out.println("La valeur de la nouvelle boucle est : " + str);
				System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
				i++;
			}
			j++;
		}
		
		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, k = 0, l = 0;
		 
		while (k < 2)
		{
		  l = 0;
		  while(l < 5)
		  {
		    System.out.print(premiersNombres[k][l]);
		    l++;
		  }
		  System.out.println("");
		  k++;
		}
	}

}
