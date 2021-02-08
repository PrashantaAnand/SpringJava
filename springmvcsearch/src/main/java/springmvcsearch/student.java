package springmvcsearch;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
public class student {
	
	private String name;
	private String password;
	private String email;
	private String contact;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	private String type;
	
	private  Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", date=" + date + ", type=" + type + ", address=" + address + "]";
	}
	
	
	

}
