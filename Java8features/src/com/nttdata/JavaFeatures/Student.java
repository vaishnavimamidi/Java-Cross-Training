package com.nttdata.JavaFeatures;

public class Student {
	
private String name;
private String address;
private int id;
public Student(String name, String address, int id) {
	super();
	this.name = name;
	this.address = address;
	this.id = id;
}

@Override
public String toString() {
	return "Student [name=" + name + ", address=" + address + ", id=" + id + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
//
//@Override
//public int compareTo(Student o) {
//	
//	if(o.getId()>this.getId())
//	{
//		return -1;
//	}
//	else if(o.getId()<this.getId())
//	{
//		return 1;
//	}
//	else
//	{
//	return 0;
//	}
//}



}