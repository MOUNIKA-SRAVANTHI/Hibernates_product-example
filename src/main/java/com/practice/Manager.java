package com.practice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Manager 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private int id;
private String name;
private String dept;
private int exp;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Manager [id=" + id + ", name=" + name + ", dept=" + dept + ", exp=" + exp + "]";
}

}
