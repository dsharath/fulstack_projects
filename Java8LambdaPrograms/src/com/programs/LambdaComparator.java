package com.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
	
	//List.sort() since Java 8
		

	public static void main(String[] args) {
		List<Developer> list= getDevelopers();
		list.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {
				return d2.getAge() - d1.getAge();
			}
		});	
		
		System.out.println("Before test");
		for ( Developer developer: list) {
			System.out.println(developer);
			
		}
		
		System.out.println("after sorting");
		
		// using lambda expressions for sorting
		list.sort((Developer d1, Developer d2)-> d1.getAge()-d2.getAge());
		
		//java 8 to print list using for each
		
		list.forEach((developer)->System.out.println(developer));
	}
	
	private static List<Developer> getDevelopers(){
		
		List<Developer> result = new ArrayList<Developer>();
		
		result.add(new Developer("sharath",2323231, 24));
		result.add(new Developer("irfan", 2323232, 26));
		result.add(new Developer("santosh",44342424, 28));
		
		return result;

	}

}

