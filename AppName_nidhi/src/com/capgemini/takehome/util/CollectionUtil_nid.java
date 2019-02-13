package com.capgemini.takehome.util;
import com.capgemini.takehome.bean.Product_nid;
import com.capgemini.takehome.dao.IProductDAO_nid;
import com.capgemini.takehome.bean.Product_nid;
import com.capgemini.takehome.bean.Product_nid;


public class CollectionUtil_nid {
	private static Map<Integer,Product_nid> products=new HashMap<Integer,Product_nid>();
	static {
		products.put(1002,new Product_nid(1001,"iPhone","Electronics",35000));
		products.put(1001,new Product_nid(1002,"LEDTV","Electronics",45000));
		products.put(1003,new Product_nid(1003,"iPhone","Teddy","Toys",800));
		products.put(1004,new Product_nid(1004,"Telescope","Toys",5000));
		
	}
	

}
