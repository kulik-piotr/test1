package com.kulik.streams;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import org.junit.Test;

public class StreamsJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream.of(Arrays.asList(1,2), Arrays.asList(3,2)).flatMap(e -> e.stream()).distinct().forEach(System.out::println);
		StreamsJava8 streamsJava8 = new StreamsJava8();
		streamsJava8.test();

        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
	}
	
	@Test
	public void test() {
		Stream.of(Arrays.asList(1,2), Arrays.asList(9,1), Arrays.asList(3,5,2), Arrays.asList(0,1,5)).flatMap(e -> {
			if (e.contains(2))
				return e.stream();
			else if (e.contains(9))
				return Stream.concat(e.stream(), e.stream());
			else
				return Stream.empty();
		}).forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		int i = 123;
		long l = 123;
		assertTrue(i == l);
	}

}
