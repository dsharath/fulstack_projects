package collections.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsGenerics {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int values[] = new int[4];
		Object values1[]= new Object[4];
		values1[0] = "navin";
		values1[1] =3;
		*/
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(44);
		values.add(88);
		values.add(55);
		values.add(1,6);
		
		values.forEach(System.out::println);
		//Collection.sort(values);
		//Iterator i = values.iterator();
		
		/*while(i.hasNext()) {
			System.out.println(i);
		}*/
		
	
		
	}

}
