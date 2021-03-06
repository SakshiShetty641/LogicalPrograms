package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - To simulate the stop watch program
 */
public class StopWatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * @start - To start the timer
		 * @stop - To stop the timer
		 */
		System.out.println("Enter 1 to start the clock");
		double start = sc.nextDouble();
		start = System.currentTimeMillis();
		System.out.println("Enter 0 to stop the clock");
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();

		// Converting to seconds and displaying.
		double elapsed_time = (stop - start) / 1000;
		System.out.println("Elapsed time is " + elapsed_time + "seconds");
		sc.close();
	}
}
