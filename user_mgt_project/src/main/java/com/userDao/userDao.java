package com.userDao;

import java.sql.SQLException;

public interface userDao {
    int insertUser(String uname,String password) throws SQLException;
	
	//to display employee
	void displayUser(String uname) throws SQLException;
	
	//to display all employees
	void displayAllUsers() throws SQLException;
	
	//to update employee
	int updatePassword(String password,String name) throws SQLException;
	
	//to delete employee
	int deleteUser(String uname) throws SQLException;
}
