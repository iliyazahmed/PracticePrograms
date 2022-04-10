package org.technoelevate.groceryapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	          static ArrayList<BussinessLogicClass> arr = new ArrayList<BussinessLogicClass>();
              public static  void main(String[] args) {
               
               
				System.out.println("Welcome to Groceries Shopping Cart..........");
				System.out.println();
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter 1. For Add Groceries...");
				System.out.println("Enter 2. For View Groceries...");
				System.out.println("Enter 3. For Modify Groceries...");
				System.out.println("Enter 4. For Remove Groceries...");
				System.out.println("Enter 5. to Exit Application......");
				int choice=scan.nextInt();
			     
				
				switch(choice) {
				case 1: 
					        BussinessLogicClass.addGroceries(null);
					        break;
				case 2:
					       BussinessLogicClass.viewGroceries();
					       break;
				case 3:
					      BussinessLogicClass.modifyGroceries();
					      break;
				case 4:
					      BussinessLogicClass.removeGroceries(); 
					      break;
				case 5:
					      System.exit(choice);
					      System.out.println("Thank You.... Visit Again.!!!!!!!!!!!");
				}
				choice=scan.nextInt();
			}
}
