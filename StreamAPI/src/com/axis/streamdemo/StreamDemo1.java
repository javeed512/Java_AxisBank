package com.axis.streamdemo;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {


		Integer  nums[] = {1000,4000,5000,3000,7000,2000,10000};
		
			Stream<Integer> stream1 =  Arrays.stream(nums);
			
		Consumer<Integer>  consumer 	= (n1)->{ System.out.println(n1);};
			
				//stream1.forEach(consumer);
		
			stream1.filter((n1)->{ return n1 > 3000;}).forEach(consumer);
		

	}

}
