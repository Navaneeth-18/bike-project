package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bikeaccessories {
	@Override
	public String toString() {
		return "Bikeaccessories [name=" + name + ", product=" + product + ", mobilenumber=" + mobilenumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Id
	private String name;
	private String product;
	private int mobilenumber;
	

}
