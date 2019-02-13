package com.capgemini.takehome.bean;

public class Product_nid {
	private int productid_nid;
	private String productname_nid;
	private String productcategory_nid;
	private double productprice_nid;
	private int productquantity_nid;
	
	public Product_nid() {   //default constructor
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterised constructor invoked by this keyword to differentiate between local and global variable.
	public Product_nid( int productid_nid, String productname_nid, String productcategory_nid, double productprice_nid)
	{
		this.productid_nid=productid_nid;
		this.productname_nid=productname_nid;
		this.productcategory_nid=productcategory_nid;
		this.productprice_nid=productprice_nid;
	      this.productquantity_nid=	productquantity_nid;
		
	}
//generating getters and setter
	public int getProductid_nid() {
		return productid_nid;
	}

	public void setProductid_nid(int productid_nid) {
		this.productid_nid = productid_nid;
	}

	public String getProductname_nid() {
		return productname_nid;
	}

	public void setProductname_nid(String productname_nid) {
		this.productname_nid = productname_nid;
	}

	public String getProductcategory_nid() {
		return productcategory_nid;
	}

	public void setProductcategory_nid(String productcategory_nid) {
		this.productcategory_nid = productcategory_nid;
	}

	public double getProductprice_nid() {
		return productprice_nid;
	}

	public void setProductprice_nid(double productprice_nid) {
		this.productprice_nid = productprice_nid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (productid_nid+" "+productname_nid+" "+productcategory_nid+" "+productprice_nid+productquantity_nid);
		
	}
	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setCategory(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
