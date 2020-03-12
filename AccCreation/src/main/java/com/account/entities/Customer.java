package com.account.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String address;
	private String phoneno;
	private boolean isEligible;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public boolean isEligible() {
		return isEligible;
	}
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String email, String address, String phoneno, boolean isEligible) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
		this.isEligible = isEligible;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", phoneno=" + phoneno
				+ ", isEligible=" + isEligible + "]";
	}
	
	
	
	

}
