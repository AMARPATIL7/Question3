package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	String productid;
	String productname;
	String productdesc;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productid, String productname, String productdesc) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdesc = productdesc;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
}
