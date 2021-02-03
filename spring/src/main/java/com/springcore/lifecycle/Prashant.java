package com.springcore.lifecycle;

public class Prashant {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Prashant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Prashant [price=" + price + "]";
	}
	 
public void init() {
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method ");
}

}
