package com.conditionalstatements;

import java.util.Scanner;

public class NestedDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Shopping Billing Details*******");

		System.out.println("Enter Customer Name : ");
		String Name = sc.nextLine();

		System.out.println("Enter Amount Shopping detals :");
		double amount = sc.nextDouble();

		if (amount > 0) {
			double discount = 0;
			double discPerc = amount / 100;
			System.out.println("Are you member :");
			String member = sc.next();

			if (member.equalsIgnoreCase("yes")) {
				discount = amount * discPerc/100;
				System.out.println("your member Discount is Available ");

			} else {

				System.out.println("Your not a member ");

			}
			double TotalBill = amount - discount;
			System.out.println("Enter Customer Name :" + Name);
			System.out.println("Enter amount :" + amount);
			System.out.println("Enter TotalBill :" + TotalBill);

		} else {
			System.out.println("Discount is not applicable !! your amount is below 1000");
		}

	}

}
