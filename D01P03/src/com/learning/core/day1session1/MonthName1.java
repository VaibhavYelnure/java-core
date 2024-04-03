package com.learning.core.day1session1;

import java.util.Scanner;

public class MonthName1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            int monthNumber = scanner.nextInt();

            String monthName = getMonthName(monthNumber);

         if (monthName != null) {
                System.out.println(monthName);
            } else {
                System.out.println(" Invalid Input");
            }
        }
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
          
        }
		return null;
        
    }
}