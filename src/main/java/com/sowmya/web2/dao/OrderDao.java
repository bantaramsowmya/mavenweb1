package com.sowmya.web2.dao;

public interface OrderDao {
boolean deleteOrder(String cartUser);
String confirmorder(String userName);
}
