package com.sowmya.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
	@Id
private int supplierId;
	@Column(name="supName")
private String supplierName;
	@Column(name="supDesp")
private String supplierDesp;
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getSupplierDesp() {
	return supplierDesp;
}
public void setSupplierDesp(String supplierDesp) {
	this.supplierDesp = supplierDesp;
}

}
