package com.junit.demo;


public class Calculator {
		  
		 public double multiply(double a, double b) {
		  return a * b;
		 }
		  
		 public double divide(double a, double b) { 
		  if(esZero(b)) {
		   throw new ArithmeticException();
		  }
		  return a / b;
		 }

		private boolean esZero(double b) {
			return b == 0;
		}

		public double suma(double i, double j) {
			// TODO Auto-generated method stub
			return i+j;
		} 
		
		public double resta(double i, double j) {
			// TODO Auto-generated method stub
			return i-j;
		}
		
		public int factorial(int n){
			if(n < 0) throw new ArithmeticException();
			int res = 1;
			for(int i = 1; i <= n; ++i){
				res *= i;
			}
			return res;
		}
		
		
		}
