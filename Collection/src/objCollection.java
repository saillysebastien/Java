import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;

public class objCollection {
	
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);
		
		for(int i = 0; i < l.size(); i++)
			System.out.println("Elément à l'index " + i + " = " + l.get(i));
		
			System.out.println("\n \tParcours avec un itérateur ");
			System.out.println("-----------------------------------------------");
			ListIterator li = l.listIterator();
			
			while(li.hasNext())
				System.out.println(li.next());
			//---------------------------------
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une chaîne de caractère !");
		al.add(12.20f);
		al.add('d');
		
		System.out.println("-----------------------------------------------");
		for(int j = 0; j < al.size(); j++) {
			System.out.println("donnée à l'indice " + j + " = " + al.get(j));
		}
			
	}
}
