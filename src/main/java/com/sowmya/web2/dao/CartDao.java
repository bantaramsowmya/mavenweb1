package com.sowmya.web2.dao;

import java.util.List;

import com.sowmya.web2.model.Cart;

public interface CartDao 
{
boolean insertCart(int producId,int quantity,String username);
List getAllCartDetails(String cartUser);
}
