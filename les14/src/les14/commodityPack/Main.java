package les14.commodityPack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Commodity> arrList = new ArrayList<Commodity>();
		int menu;
		while (true) {
			System.out.println("1 - to add a commodity");
			System.out.println("2 - to remove a commodity");
			System.out.println("3 - to replace a commodity");
			System.out.println("4 - to sort by title of commodity");
			System.out.println("5 - to sort by length of commodity");
			System.out.println("6 - to sort by width of commodity");
			System.out.println("7 - to sort by weight of commodity");
			System.out.println("8 - to show a i-th element of collection");
			System.out.println("9 - to exit");
			menu = in.nextInt();
			in.nextLine();
			switch(menu) {
			case 1:
				System.out.print("Enter commodity title: ");
				String title = in.nextLine();
				System.out.print("Enter commodity length: ");
				int length = in.nextInt();
				System.out.print("Enter commodity width: ");
				int width = in.nextInt();
				System.out.print("Enter commodity weight: ");
				int weight = in.nextInt();
				in.nextLine();
				Commodity.addCommodity(arrList, new Commodity(title, length, width, weight));
				System.out.println(arrList);
				break;
			case 2:
				System.out.print("Enter commodity title: ");
				String title1 = in.nextLine();
				Commodity.removeCommodity(arrList, title1);
				System.out.println(arrList);
				break;
			case 3:
				System.out.print("Enter old commodity title: ");
				String title2 = in.nextLine();
				System.out.print("Enter new commodity title: ");
				String title3 = in.nextLine();
				System.out.print("Enter new commodity length: ");
				int length1 = in.nextInt();
				System.out.print("Enter new commodity width: ");
				int width1 = in.nextInt();
				System.out.print("Enter new commodity weight: ");
				int weight1 = in.nextInt();
				in.nextLine();
				arrList = (ArrayList<Commodity>) Commodity.replaceCommodity(arrList, title2, 
						new Commodity(title3, length1, width1, weight1));
				System.out.println(arrList);
				break;
			case 4:
				Commodity.sortByTitle(arrList);
				System.out.println(arrList);
				break;
			case 5:
				Commodity.sortByLength(arrList);
				System.out.println(arrList);
				break;
			case 6:
				Commodity.sortByWidth(arrList);
				System.out.println(arrList);
				break;
			case 7:
				Commodity.sortByWeight(arrList);
				System.out.println(arrList);
				break;
			case 8:
				System.out.print("Enter index of element: ");
				int i = in.nextInt();
				in.nextLine();
				Commodity.showElement(arrList, i);
				break;
			case 9:
				Commodity.exit();
				break;
			}
		}
	}

}
