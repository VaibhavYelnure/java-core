package com.learning.core.day1session1;

import java.util.Scanner;

public class FactorialNumber5 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
       
    	if (n == 0 || n == 1) {
            return 1;
        }
    	else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
