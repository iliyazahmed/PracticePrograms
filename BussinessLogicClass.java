package org.technoelevate.groceryapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BussinessLogicClass {
	   
	    private String itemName;
	    private double itemPrice;
	    private int itemQuantity;
	    
	     static Scanner scan = new Scanner(System.in);
	    

		public String getItemName() {
			return itemName;
		}
        
		public double getItemPrice() {
			return itemPrice;
		}

		public int getItemQuantity() {
			return itemQuantity;
		}
        
	    static ArrayList list = new ArrayList();
	    
      	public static  void addGroceries(ArrayList<String> list) {
      		System.out.println("-------------------------");
            System.out.println("Enter the Groceries : ");
            int num=scan.nextInt();
            if(num<2)
            {
                System.out.println("enter the item names");
                list.add(scan.next());
            }
            else
            {
                System.out.println("  ");
                System.out.println("Enter the item names");
                for(int i=0;i<num;i++)
                {
                    list.add(scan.next());
                }
            }
            
            System.out.println("know what you have added to the list");
            System.out.println("press 2 print the items");
              int p=scan.nextInt();
                if(p==2)
    	           {
    	               addGroceries(list);
    	           }
    	           else 
    	           return ;
            
        }
    
		public static void viewGroceries(ArrayList<String>list) {
			System.out.println("");
	        System.out.println("");
	        System.out.println("items in your list are:");
	        Iterator itr = list.iterator();
	        while (itr.hasNext())
	        {
	            System.out.println(itr.next()+" ");
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("press 3 to enter the item to particular position");
	         System.out.println("enter any other number to exit");
	        int pos=scan.nextInt();
	        if(pos==3)
	         {
		        viewGroceries(list);   
		     }
	        else
	            return;
        	
        }
        public static void modifyGroceries() {
			
        	
        }
        public static void removeGroceries(ArrayList<String>list) {
        	Iterator itr = list.iterator();
            while (itr.hasNext())
            {
                System.out.println(itr.next()+" ");
            }
            System.out.println("see  the item and enter the position");
            int nr=scan.nextInt();
            list.remove(nr);
            System.out.println("if you want remove another item press 1");
            int rei=scan.nextInt();
            if(rei==1)
            {
                removeGroceries(list);
            }
            else
            return;
        	
        }

		
}
