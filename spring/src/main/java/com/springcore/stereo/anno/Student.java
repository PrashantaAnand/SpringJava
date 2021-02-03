package com.springcore.stereo.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object")
public class Student {
	
	@Value("ram")
	private String name;
	
	@Value("pune")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student(String name, String city, List<String> address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	

}
