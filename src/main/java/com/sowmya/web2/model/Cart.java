package com.sowmya.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Cart 
{
	@Id
private int cartId;
	@Column
private String productName;
	@Column
private int quantity;
	@Column
private int productPrice;
	@Column
private int totalPrice;
	@Column
private String cartUser;	
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}


public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}
public String getCartUser() {
	return cartUser;
}
public void setCartUser(String cartUser) {
	this.cartUser = cartUser;
}

}
