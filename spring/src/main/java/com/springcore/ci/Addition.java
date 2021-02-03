package com.springcore.ci;

public class Addition {
  private int a;
  private int b;
  
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("constructor is int,int ");
	
}

void sum() {
	System.out.println("value of a :"+this.a);
	System.out.println("value of b : "+this.b);
	System.out.println("sum is :"+ (this.a + this.b));
}
 
}
