package com.cdgi.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="product")
public class Product {
	
	@Id
	@Column(name="pid")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int pid;
    String pname;
    double price;
    
	
	@Override
	public String toString() {
		return "Product [pid=" + pid +"\n"+ "pname=" + pname +"\n"+ "price=" + price + "]";
	}

	public Product( String pname, double price) {
		super();
	
		this.pname = pname;
		this.price = price;
	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
