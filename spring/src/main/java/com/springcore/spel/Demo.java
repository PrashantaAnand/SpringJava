package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("4444")
	private int x;
	@Value("#{2+3}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public Demo(int x, int y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	

}
