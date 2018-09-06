package com.sowmya.web2.dao;

import java.util.List;

import com.sowmya.web2.model.Product;

public interface ProductDao 
{
boolean insert(Product product);
List getAllProducts();
boolean deleteProduct(int productId);
Product editProduct(int productId);
Product showMoreDetails(int productId);
}
