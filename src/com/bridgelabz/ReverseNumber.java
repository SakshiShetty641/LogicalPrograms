package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To print the reverse of a number
 */

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
		sc.close();
	}
}
