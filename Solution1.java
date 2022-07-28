package by.epam.tr.solution1;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		/* 1. Даны два действительных числа х и у. Вычислить их сумму,
		   разность, произведение и частное. */
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any two numbers, each on a new line.");
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			System.out.println("x + y = " + (x + y));
			System.out.println("x - y = " + (x - y));
			System.out.println("x * y = " + x * y);
			System.out.println("x / y = " + x / y);
		}

	}

}
