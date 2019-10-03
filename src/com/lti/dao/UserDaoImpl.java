package com.lti.dao;

import com.Controller.model.User;
import com.Controller.utilities.ConnectionManager;
import java.sql.*;

public class UserDaoImpl implements UserDao{
	
private Connection connection = ConnectionManager.getConnection();
private String query="Select * from users where id=? and pass=?";
private PreparedStatement ps = null;
private ResultSet rs=null;

@Override
public boolean validateUser(User user) {
	try 
	{
		ps = connection.prepareStatement(query);
		ps.setString(1,user.getUserid());
		ps.setString(2,  user.getPass());
		
		rs= ps.executeQuery();
		
	while(rs.next())
	{
		return true;
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return false;
}



}
