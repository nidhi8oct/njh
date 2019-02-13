package com.capgemini.takehome.ui;
import java.util.Scanner;


public class Client {
	private static Scanner sc;

	public static void main(String[] args)
{
		IProductService_nid service=new ProductService_nid();
		
		sc = new Scanner(System.in);
		List<Product_nid> prod = prod.findAll();
		
		
		System.out.println("Enter 1 to generate bill by entering product code and quantity");
		System.out.println("Enter 2 to exit");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		    {
			int bill=productprice_nid* productquantity_nid;
			System.out.println("bill of the product are");
			break;
		    }
		case 2:
		       {
			      System.exit(0);
			      break;
	           	}
			
		   default:
		   System.out.println("Wrong Choice");
		
	     }

}
