package com.Controller.utilities;

//import com.sun.corba.se.pept.transport.Connection;
import java.sql.*;
public class ConnectionManager {
	
	private static Connection connection;
	private ConnectionManager()
	{
	}
public static Connection getConnection()
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
	}
	catch(SQLException  e)
	{
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	return connection;
}
/*public static void main(String args[]) throws ClassNotFoundException
{
	System.out.println(getConnection());
	
}*/
}
