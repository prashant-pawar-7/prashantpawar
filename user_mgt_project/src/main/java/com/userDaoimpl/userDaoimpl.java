package com.userDaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.userConnectionprovider.Connection_Provider;
import com.userDao.userDao;

public class userDaoimpl implements userDao{
 Connection con=Connection_Provider.getConnection();
	public int insertUser(String uname, String password)throws SQLException {
		String query="insert into user(uname,password) values((?),?)";
		
		int i;
		try {
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, uname);
			stmt.setString(2, password);
			i = stmt.executeUpdate();
			return i;
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("user alreday exist.Create a unique user name.");
			e.printStackTrace();
			return 0;
		}
		
	}

	public void displayUser(String uname) throws SQLException {
		String query="Select * from user where uname=?";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1, uname);
		ResultSet rs=stmt.executeQuery();
		rs.next();
			System.out.println("Username :"+rs.getString(1));
			System.out.println("Password :"+rs.getString(2));
			System.out.println("......................................................");
		
		
	}

	public void displayAllUsers() throws SQLException {
		String query="Select * from user";
		PreparedStatement stmt=con.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println("Username :"+rs.getString(1));
			System.out.println("Password:"+rs.getInt(2));
			System.out.println("......................................................");
		}
	}

	public int updatePassword(String password, String uname) throws SQLException {
		String query="update user set password=? where uname=?";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1, password);
		stmt.setString(2, uname);
		int i=stmt.executeUpdate();
		return i;
	}

	public int deleteUser(String uname) throws SQLException {
		String query="delete from  user where uname=?";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1,uname);
		int i=stmt.executeUpdate();
		return i;
	}
	
}
