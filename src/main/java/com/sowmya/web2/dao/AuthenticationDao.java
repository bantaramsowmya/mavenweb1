package com.sowmya.web2.dao;
import com.sowmya.web2.model.Register;

public interface AuthenticationDao 
{
boolean insertRegisterDetails(Register register);
boolean login(String email,String passWord );
Register getUser(String userId);

}
