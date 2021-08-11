package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To check whether prime number or not
 */

public class PrimeNumber {
	public static void main(String args[]) {
		int i, X = 0, Y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		X = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= X; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					Y = 1;
					break;
				}
			}
			if (Y == 0) {
				System.out.println(n + " is prime number");
				sc.close();
			}
		}
	}
}
