package com.sowmya.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="cat")
public class Category 
{
	@Id
	@Column(name="catId")
private int categoryId;
	@Column(name="catName")
private String categoryName;
	@Column
private String categoryDesp;
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDesp() {
	return categoryDesp;
}
public void setCategoryDesp(String categoryDesp) {
	this.categoryDesp = categoryDesp;
}

}
