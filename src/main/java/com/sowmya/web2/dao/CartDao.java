package com.sowmya.web2.dao;

import java.math.BigInteger;
import java.util.List;

import com.sowmya.web2.model.Cart;

public interface CartDao 
{
boolean insertCart(int productId,int quantity,String username);
List getAllCartDetails(String cartUser);
BigInteger noOfrows(String cartUser);
}
