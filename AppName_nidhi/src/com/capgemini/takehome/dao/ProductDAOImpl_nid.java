package com.capgemini.takehome.dao;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import com.capgemini.takehome.bean.*;
import com.capgemini.takehome.bean.Product_nid;



public class ProductDAOImpl_nid implements IProductDAO_nid{
	
		HashMap<Integer,Product_nid> hm=new HashMap<>();
		
		public int getQuantity(int qty) 
		{
			Object e;
			if(qty!=0)
			hm.put(((Object) e).getId(), e);
			return (int) e;
		}
		

		@Override
		public boolean Productcode_nid(int id) 
		{
			return true;
			
		}

		@Override
		public boolean create(Product_nid pro) {
			// TODO Auto-generated method stub
			return false;
		}
		
		


		
		
		}

		


