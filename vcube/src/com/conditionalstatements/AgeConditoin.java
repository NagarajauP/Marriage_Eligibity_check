package com.conditionalstatements;

import java.util.Scanner;

public class AgeConditoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		double age = sc.nextDouble();

		if (age < 0 || age > 100) {
			System.out.println("Not cosnsidered");
		} else if (age <= 5) {
			System.out.println("Consider as a Baby child");
		} else if (age <= 10) {
			System.out.println("consider as Child ");
		} else if (age <= 20) {
			System.out.println("Cosider as Teen Age");

		} else if (age <= 35) {
			System.out.println("Consider as a Young ");
		} else if (age <= 60) {
			System.out.println("Consider as a Middle Age ");
		} else {
			System.out.println("consider as a Old Age");
		}

	}

}
