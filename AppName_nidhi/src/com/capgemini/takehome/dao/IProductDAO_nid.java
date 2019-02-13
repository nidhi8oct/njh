package com.capgemini.takehome.dao;
import com.capgemini.takehome.bean.*;

import java.util.List;

import com.capgemini.takehome.bean.Product_nid;




public interface IProductDAO_nid {
	public int getQuantity(int qty);
	public boolean Productcode_nid(int id);
	public boolean create(Product_nid pro);
}


	
