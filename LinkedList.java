package collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		List<Integer> Values = new ArrayList<Integer>();
		
		
		Values.add(2);
		Values.add(3);
		Values.add(8);
		Values.add(1);
		Values.add(9);
		
		Comparator<Integer> com = new ComImpl();
		Collections.sort(Values,com);
		
		for(int i: Values) {
			System.out.println(i);
		}
		
		
		
		

	}

}
