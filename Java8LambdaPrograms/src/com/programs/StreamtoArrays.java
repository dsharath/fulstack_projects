package com.programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamtoArrays {

	public static void main(String[] args) {
		
		String[] array = {"ant", "cat", "bat", "dog","elephant"};
		
		//array->stream
		
		Stream<String> stream1 = Arrays.stream(array);
		
		stream1.forEach(x -> System.out.println(x));
		
		//stream of
		
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(x-> System.out.println(x));
		

	}

}
