package com.learning.core.day1session1;

import java.util.Scanner;

public class WeekDay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int[] inputs = new int[3];
        for (int i = 0; i < 3; i++) 
        {
            inputs[i] = scanner.nextInt();
        }

        
        for (int weekNumber : inputs) {
            if (weekNumber >= 1 && weekNumber <= 7) {
                String weekday;
                if (weekNumber == 1) {
                    weekday = "Monday";
                } else if (weekNumber == 2) {
                    weekday = "Tuesday";
                } else if (weekNumber == 3) {
                    weekday = "Wednesday";
                } else if (weekNumber == 4) {
                    weekday = "Thursday";
                } else if (weekNumber == 5) {
                    weekday = "Friday";
                } else if (weekNumber == 6) {
                    weekday = "Saturday";
                } else {
                    weekday = "Sunday";
                }
                System.out.println(weekday);
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}