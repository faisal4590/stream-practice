package com.faisal.StreamPractice.Stream_Practice;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamIntermediateOperations {
	/*
	 * stream operation mainly 2 types er : 1)Intermediate operations, 2) Terminal
	 * operation.
	 */

	/*
	 * Intermediate operations: Intermediate operations return a stream so we can
	 * chain multiple intermediate operations without using semicolons.
	 */

	/*
	 * Terminal operations: Terminal operations are either void or return a
	 * non-stream result.
	 */
	
	//example of intermediate Streams
	
	public void StreamIntermediateOperationsMethod()
	{
		List<String> myList = Arrays.asList("faisal","tamim","sakib");
		
		myList
			.stream()
			.filter(s->s.startsWith("fai"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		Stream.of("Faisal", "Aziz", "Tamim")//Direct evabe jekono stream banate parbo
			.findFirst()
			.ifPresent(System.out::println); ///etar mane 3 ta stream of data theke jodi 1st item present thake tahole ota return koro
	
		//transforming a regular object stream to a primitive stream
		
		Stream.of("a1", "a2", "a3")
	    .map(s -> s.substring(1))//a gulake bad diye dicci
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println); //string stream ke integer e convert kore then max call korlam
	
		//Primitive streams can be transformed to object streams via mapToObj():
		
		IntStream.range(1, 4)
	    .mapToObj(i -> "a" + i)
	    .forEach(System.out::println);
		
		//multiple mapping
		
		Stream.of(1.0, 2.0, 3.0)
	    .mapToInt(Double::intValue)
	    .mapToObj(i -> "multiple mapping " + i)
	    .forEach(System.out::println);//1st e double to integer, then integer to string

		
	}
	
	
}
