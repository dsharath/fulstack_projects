package com.programs;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapJava8 {

	public static void main(String[] args) {
		List<Developer> friend = Arrays.asList(
				new Developer("santosh", 30, 10000),
				new Developer("sharath", 27, 15),
				new Developer("irfan", 27, 20));
				
		//java8
		
		//List<String> collect = Developer.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(friend);
		
		
	}

}
