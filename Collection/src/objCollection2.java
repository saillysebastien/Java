import java.util.Enumeration;
import java.util.Hashtable;

import java.util.HashSet;
import java.util.Iterator;

public class objCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();
		ht.put(1, "Printemps");
		ht.put(10, "Eté");
		ht.put(20, "Automne");
		ht.put(30, "Hiver");
		
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements())
		System.out.println(e.nextElement());
		
		//---------------------------------------
		HashSet hs = new HashSet();
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		
		Iterator it = hs.iterator();
		System.out.println("--------------------------------------");
		
		while(it.hasNext())
			System.out.println(it.next());
			
		System.out.println("\nParcours avec un tableau d'objet");
		System.out.println("--------------------------------------");
		
		Object[] obj = hs.toArray();
		for(Object o : obj)
			System.out.println(o);
			
	}

}
