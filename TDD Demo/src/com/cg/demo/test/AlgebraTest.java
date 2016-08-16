package com.cg.demo.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.cg.demo.Algebra;

public class AlgebraTest {

	// 1. Zero factorial is one
	// 2. One factorial is one
	// 3. Five factorial is One Twenty
	// 4. Negative numbers factorial cannot be computed.
	
	
	@Test
	public void zero_factorial_is_one() {
		Algebra a = new Algebra();
		assertEquals(1, a.factorial(0));
	}

	@Test
	public void one_factorial_is_one() {
		Algebra a = new Algebra();
		assertEquals(1, a.factorial(1));
	}
	
	@Test
	public void five_factorial_is_one_twenty() {
		Algebra a = new Algebra();
		assertEquals(120, a.factorial(5));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void negative_numbers_factorial_cannot_be_computed() {
		Algebra a = new Algebra();
		a.factorial(-234);
	}

	//1. Leap years are divisible by four
	//2. If the year is divisible by 100 then it is not a leap year if it is not divisible by 400
	//3. If the year is divisible by 100 and 400 then it is a leap year
	//4. years are not negative
	
	@Test
	public void leap_years_are_divisible_by_four() {
		Algebra a = new Algebra();
		assertTrue(a.isLeapYear(2000));
	}
	
	@Test
	public void leap_years_are_divisible_by_100_as_well_as_400() {
		Algebra a = new Algebra();
		assertTrue(a.isLeapYear(2000));
	}

	@Test
	public void year_is_not_leap_year_if_it_is_not_divisible_by_100_as_well_as_400() {
		Algebra a = new Algebra();
		assertFalse(a.isLeapYear(1900));
	}

	@Test(expected=java.lang.IllegalArgumentException.class)
	public void years_are_not_negative() {
		Algebra a = new Algebra();
		a.isLeapYear(-876);
	}

}
























