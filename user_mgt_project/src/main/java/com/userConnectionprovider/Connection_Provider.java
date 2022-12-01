package com.userConnectionprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Provider {
public static Connection getConnection() {
	try {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe", "root", "D@rsh@n@@12345");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}

}      
}
