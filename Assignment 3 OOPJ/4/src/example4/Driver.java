package example4;

import java.util.Scanner;



public class Driver {
	static Scanner sc= new Scanner(System.in);
	private static void addSalesPerson() {
		 SalesPerson person = new SalesPerson();
		 
		 sc.nextLine();
		 
		 System.out.println("Enter the num of the sales person");
		 person.setName(sc.nextLine());
		 
		 
		 System.out.println("Enter sales figure for monthly basis : ");
		 
		 for(int i =0 ; i < temp.length ; i++ ) {
			 System.out.println("sales Figure for "+(i+1) +" : ");
			 temp[i] = sc.nextInt(); 
		 }
		 person.setSalesFigure(temp);	
	}

	private static int displayMenu() {
		System.out.println("0.Exit");
		System.out.println("1.Add a New SalesPerson");
		System.out.println("2.Update an existing salesperson");
		System.out.println("3.View total sales for a salesperson");
		System.out.println("4.View total sales for all salespersons");
		return sc.nextInt();
	}
	
	private static void switchMenu() {
		int choice ; 
		
		while( ( choice = displayMenu() ) != 0 ) {
			switch (choice) {
			case 1: addSalesPerson();
				break;
				
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;

			default:
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		switchMenu();
	}

	
	
}