package com.example.demo.Model;
@Entity
@Table(name="Product")
public class PageModel {
	@Id
private int id;
private String name;
private int price;
@Override
public String toString() {
	return "pageModel [id=" + id + ", name=" + name + ", price=" + price + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
