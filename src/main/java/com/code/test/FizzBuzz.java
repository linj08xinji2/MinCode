package com.code.test;

import org.junit.Test;

/**
 * 
 * @author linj 
 * date:20190423 
 * jdk version :1.8
 *  maven version:3.3.9 
 *  ide:eclipse-jee-kepler
 */
public class FizzBuzz {

	@Test
	public void fizzBuzzTest() {
		// the numbers of 1 to 100
		for (int i = 1; i <= 100; i++) {
			// the result of the number divisible by 3
			// and number divisible by 5
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				// the number only divisible by 3
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
				// the number only divisible by 5
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
				// other condition
			} else {
				System.out.println(i);
			}
		}
	}

}
