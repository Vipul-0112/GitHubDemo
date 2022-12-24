package com.velocity.git_hub;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		System.out.println("Enter the number to check for prime number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("not prime number");
		}
	}
}
