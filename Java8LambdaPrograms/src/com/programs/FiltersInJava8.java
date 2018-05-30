package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersInJava8 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("me", "you", "annother");
		List<String> result = lines.stream().filter(line -> !"annother".equals(line)).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
	}

}
