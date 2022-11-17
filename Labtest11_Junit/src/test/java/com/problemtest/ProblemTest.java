package com.problemtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.problem.Problem;

public class ProblemTest {
	Problem p1=new Problem();
@DisplayName (value="Addition")
@Test
public void Addtest() {
	assertEquals(30,p1.add(20, 10));
}
@DisplayName (value="Multiplication")
@Test
public void multiplyTest() {
	assertEquals(200,p1.multiply(20, 10));
}
@DisplayName (value="Check if Palindrome")
@ParameterizedTest
@ValueSource(strings = {"Dad","Navavan","Mom","Sis"})
public void isPalindromeTest(String s) {
	assertTrue(p1.isPalindrome(s));
}
@DisplayName (value="test if list is empty and its size")
@Test
public void ListTest() {
	p1.fillList();
	assertFalse(Problem.l1.isEmpty());
	System.out.println(Problem.l1.size());
	assertEquals(5,Problem.l1.size());
}

}
