package com.programs;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NullValuesStream {
	
	public static void main(String[] args) {
		Stream<String> language = Stream.of("java", "python",null,"rubby",null,"php");
		
		//List<String> result = language.collect(Collectors.toList());
		// filtering null values below..
		List<String> result = language.filter(x-> x!=null).collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}

}
