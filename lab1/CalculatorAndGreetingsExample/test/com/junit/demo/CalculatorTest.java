package com.junit.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class CalculatorTest {
 
 private Calculator calc;
  
 @Before
 public void setUp() throws Exception {
  calc = new Calculator();
 }
 
 @After
 public void tearDown() throws Exception {
  calc = null;
 }
 
 @Test
 public void testMultiply() {
  double result = calc.multiply(2.5, 100);
  assertEquals(250, result, 0);
 }
 
 @Test
 public void testDivide() {
  double result = calc.divide(100, 10);
  assertEquals(10, result, 0);
   
 }
 
 @Test
 public void testDivideWithTolerance() {
  double result = calc.divide(345, 100);
  assertEquals(3.4, result, 0.1);
   
 }
  
 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
  calc.divide(100.5, 0);
 }
 @Test
 public void testSuma(){
	 double result = calc.suma(2,3);
	 assertEquals(5,result,0);
 }
 @Test
 public void testResta(){
	 double result = calc.resta(2,3);
	 assertEquals(-1,result,0);
 }
 
 @Test
 public void testFactorialGeneral(){
	 int result = calc.factorial(5);
	 assertEquals(120,result,0);
 }
 
 @Test
 public void testFactorialZero() {
	 int result = calc.factorial(0);
	 assertEquals(1, result, 0);
 }
 
 @Test
 public void testFactorialUn() {
	 int result = calc.factorial(1);
	 assertEquals(1, result, 0);
 }
 @Test(expected = ArithmeticException.class)
 public void testFactorialNegatiu() {
  calc.factorial(-2);
 }
 
}
