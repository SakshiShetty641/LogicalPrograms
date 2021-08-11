package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To print Fibonacci Series
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int n, num1 = 0, num2 = 1, fib;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Fibonacci series are: ");
		System.out.print(num1+ " " +num2);
		/**
		 * Loop starts from 2 because 0 and 1 are already printed
		 */
		for (int i = 2; i < n; ++i) {
			fib = num1 + num2;
			System.out.print(" "+fib);
			num1 = num2;
			num2 = fib;
			}
		sc.close();
	}
}