package com.capgemini.takehome.service;
import com.capgemini.takehome.bean.Product_nid;
import com.capgemini.takehome.dao.*;
import com.capgemini.takehome.exception.*;


public class ProductService_nid implements IProductService_nid {
	public class ProductService_nid() {
	 
   IProductDAO ipd=new Product	ProductDAOImpl();
//@ we are overriding and based on the conditions we are checking if quantity details which are given should not exceed the limit.

	@Override
	public Product_nid getQuantity(int qty) {
		if( Product_nid.qty()!=0)
		{
			System.out.println("Quantity should not be less than");
		}
		else if(Product_nid.qty()=0)
		{
			System.out.println("Quantity should not be equal to zero");
		}
		else
		{
			System.out.println("Quantity is accepted");
		}
	}
	}


	//private static final String Productcode_nid = null;
	

	@Override
	public boolean Productcode_nid(int code) throws Quantity_Mismatch_Exception {
		if((Productcode_nid "[0-9]" ).matches(Productcode_nid.code).find())
			{
			System.out.println("Not a valid Product code");
			return false;
		}
		else if(Productcode_nid findOne(getQuantity)=null)
		{
			throw Quantity_Mismatch_Exception();
		}
	}
}
	
		
		
		
		
	


