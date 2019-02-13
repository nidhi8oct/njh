package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product_nid;
import com.capgemini.takehome.exception.Quantity_Mismatch_Exception;

public interface IProductService_nid {
	public Product_nid getQuantity(int qty);
	public boolean Productcode_nid(int id) throws Quantity_Mismatch_Exception;
}




