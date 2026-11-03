package com.conditionalstatements;

import java.util.Scanner;

public class NeastedSwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double totalprice = 0;

		do {
			System.out.println("Enter Catagery Veg starter/Non-veg starter/Sotf Drinkes");
			String catg = sc.nextLine();
			
		

			switch (catg) {

			case ("Veg starter") -> {
				String vsyn = "";
				double veg_total = 0;

				do {
					System.out.println("Enter veg starter_item");
					String vegstarter_item = sc.next();

					switch (vegstarter_item) {

					case ("p65") -> {
						System.out.println("Enter Paneer 65 Price 180/-rs");
						double p65_price = 180;
						veg_total += p65_price;
					}
					case "gm" -> {
						System.out.println("Enter Gobi Manchurian Price 150/-rs");
						double gm_price = 150;
						veg_total += gm_price;
					}
					case "cc" -> {
						System.out.println("Enter Crispy Corn Price 160/-rs");
						double cc_price = 160;
						veg_total += cc_price;
					}
					case "cp" -> {
						System.out.println("Enter Chilli Paneer Price 200/-rs");
						double cp_price = 200;
						veg_total += cp_price;
					}
					case "vm" -> {
						System.out.println("Enter Veg Manchurian Price 140/-rs");
						double vm_price = 140;
						veg_total += vm_price;
					}
					case "pt" -> {
						System.out.println("Enter Paneer Tikka Price 220/-rs");
						double pt_price = 220;
						veg_total += pt_price;
					}

					default -> System.out.println("veg starter item is unavailable");
					}
					System.out.println("Do you want to continue veg stargter click Y for yes N for no ");
					vsyn = sc.next();

				} while (vsyn.equalsIgnoreCase("y"));
				System.out.println("Enter Total Bill of Veg Starters :" + veg_total);
				totalprice += veg_total;

			}

			case ("Non-veg starter") -> {
				double ns_total = 0;
				String nvyn = "";

				do {
					System.out.println(" Enter Non-veg starters Items");
					String Non_veg_staters = sc.next();

					switch (Non_veg_staters) {

					case ("dc") -> {
						System.out.println("Enter Dragon chicken Price 200/-rs");
						double dragon_chicken_price = 200;
						ns_total += dragon_chicken_price;
					}
					case "cl" -> {
						System.out.println("Enter Chicken Lollipop Price 220/-rs");
						double chicken_lollipop_price = 220;
						ns_total += chicken_lollipop_price;
					}
					case "cm" -> {
						System.out.println("Enter Chicken Manchurian Price 200/-rs");
						double chicken_manchurian_price = 200;
						ns_total += chicken_manchurian_price;
					}
					case "chc" -> {
						System.out.println("Enter Chilli Chicken Price 220/-rs");
						double chilli_chicken_price = 220;
						ns_total += chilli_chicken_price;
					}
					case "cp" -> {
						System.out.println("Enter Chicken Pakoda Price 180/-rs");
						double chicken_pakoda_price = 180;
						ns_total += chicken_pakoda_price;
					}
					default -> System.out.println("sir Non-veg starter is unavailable");
					}
					System.out.println("Do you want to continue non veg starters...? click Y for yes NO for no ");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));
				System.out.println(" Total of Non-veg starter :" + ns_total);
				totalprice += ns_total;

			}
			case "soft-drinks" -> {
				double st_total = 0;
				String sdyn = "";

				do {
					System.out.println("Enter  Soft Drink Item ");
					String soft_drinks = sc.next();

					switch (soft_drinks) {

					case "tp" -> {
						System.out.println("Enter Thumsup Price 25/-rs");
						double thumsup = 25;
						st_total += thumsup;

					}
					case "cc" -> {
						System.out.println("Enter Coca-Cola Price 40/-rs");
						double coca_cola = 40;
						st_total += coca_cola;
					}
					case "sp" -> {
						System.out.println("Enter Sprite Price 35/-rs");
						double sprite = 35;
						st_total += sprite;
					}
					case "fa" -> {
						System.out.println("Enter Fanta Price 35/-rs");
						double fanta = 35;
						st_total += fanta;
					}
					case "li" -> {
						System.out.println("Enter Limca Price 30/-rs");
						double limca = 30;
						st_total += limca;
					}
					case "mz" -> {
						System.out.println("Enter Maaza Price 35/-rs");
						double maaza = 35;
						st_total += maaza;
					}
					default -> System.out.println(" Your soft drink item is unavailable");
					}
					System.out.println("Do you want to continue sotf drinks....? Y for yes N for no");
					sdyn = sc.next();

				} while (sdyn.equalsIgnoreCase("y"));
				System.out.println("Enter the total of the Soft Drinks :" + st_total);
				totalprice += st_total;
			}
			default -> System.out.println("Sorry sir order is un unavailable");
			}
			System.out.println("Do you to continue then click Y for Yes N for No");
			yn = sc.next();
			sc.nextLine();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Total Bill Amount :" + totalprice);
	}

}
