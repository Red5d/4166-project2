package a1.javaclasses;

import java.sql.*;

public class DBClass {
	String connName;
	String userName;
	String password;
	String hostName;
	int port;
	String SID;
	Connection connection;
    Statement stat;
//wut
   
//wut
	public ResultSet execute(String SQL)
	{
	    ResultSet rs;
		try {
			rs = stat.executeQuery(SQL);
		    return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void insert(String SQL)
	{
	    Statement stat;
		try {
			stat = connection.createStatement();
			stat.executeQuery(SQL);
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}   
	}

	public void closeConnection()
	{
		try {
			stat.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}