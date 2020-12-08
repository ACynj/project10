package com.ynj.beans;
public class Book {
private String id=null;
private String name=null;
private String price=null;
private String publish=null;
public String getId() {
	return id;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}
public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}

@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + ", publish=" + publish + "]";
}

}
