package com.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamtoList {

	public static void main(String[] args) {
		
		Stream<String> lanlist = Stream.of("java", "python", "rubby");
				
		//convert a stream to list
		List<String> list = lanlist.collect(Collectors.toList());
		
		list.forEach(System.out::println);

	}

}
