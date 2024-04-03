package com.learning.core.day1session1;

import java.util.Scanner;



public class StudentGrade3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Percentage: ");

		int marks = sc.nextInt();

		String grade;

     if (marks >= 60) {

			grade = "A Grade";

		} else if (marks >= 40) {

			grade = "B Grade";

		} else if (marks >= 35) {

			grade = "C Grade";

		} else {

			grade = "Fail";

		}



		System.out.println(grade + " Grade");

	}



}
