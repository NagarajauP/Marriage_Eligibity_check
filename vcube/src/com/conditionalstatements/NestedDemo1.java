package com.conditionalstatements;

import java.util.Scanner;

public class NestedDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("How much of assets do you have :");
		double assets = sc.nextDouble();
		if (assets >= 50000000) {
			System.out.println("wow good to  hear :");

			System.out.println("What about your Anual Package");
			double salary = sc.nextDouble();

			if (salary >= 2000000) {
				System.out.println("Thats good  ");

				System.out.println("Enter your Age :");
				int age = sc.nextInt();

				if (age >= 25 && age <= 28) {
					System.out.println("oh nice !! good to go");

					System.out.println("Enter your Height && Weight :");
					float height = sc.nextFloat();
					int weight = sc.nextInt();

					if ((height >= 5.4 && height <= 6) && (weight >= 60 && weight <= 80)) {
						System.out.println("ok alright ");

						System.out.println("Do you have siblings :");
						boolean sib = sc.nextBoolean();

						if (!sib) {
							System.out.println("Oh ok Greate to Know");
						} else {
							System.out.println("OMG");
						}
					} else {
						System.out.println("My suggestion you need join in Gym :");
					}
				} else {
					System.out.println("your is not matching to our Profile");
				}
			} else {
				System.out.println(" First concentrate on career ");
			}
		} else {
			System.out.println("We are searching for assets who have 50000000 !! Not for you :");
		}

	}

}
