package com.sowmya.web2.dao;

import java.util.List;

import com.sowmya.web2.model.Supplier;

public interface SupplierDao 
{
boolean insert(Supplier supplier);
List getAllSupplies();
boolean deleteSupplier(int supplierId);
Supplier editSupplier(int supplierId);
}
