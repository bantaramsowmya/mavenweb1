package com.sowmya.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="pro")
public class Product 
{
	@Id
	@Column(name="proId")
int productId;
	@Column(name="proName")
String productName;
	@Column
	int productPrice;
	@Column
	String productDescription;
	@Column
String productCategory;
	@Column
	String productSupplierName;
	
	@Transient
	MultipartFile productImg;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

public MultipartFile getProductImg() {
	return productImg;
}
public void setProductImg(MultipartFile productImg) {
	this.productImg = productImg;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}


public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getProductSupplierName() {
	return productSupplierName;
}
public void setProductSupplierName(String productSupplierName) {
	this.productSupplierName = productSupplierName;
}

}
