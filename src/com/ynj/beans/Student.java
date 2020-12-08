package com.ynj.beans;

public class Student {
private String id=null;
private String name=null;
private String age=null;
public String getId() {
	return id;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}
public void setId(String students) {
	this.id = students;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String students) {
	this.age = students;
}
}
