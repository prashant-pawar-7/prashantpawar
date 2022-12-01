package com.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.userDaoimpl.userDaoimpl;

public class User{ 

    public static void main( String[] args ) throws SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	userDaoimpl usimpl=new userDaoimpl();
    	 name();
    	 System.out.println("Enter choice");
    	int i=sc.nextInt();
    	
   
    int j;
    String uname;
    String  password;
    switch (i) {
	case 1:
		System.out.println("Enter username");
		uname=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		j=usimpl.insertUser(uname,password);
		System.out.println(j + " record inserted..");
		break;
	case 2:
		System.out.println("Enter username");
		uname=sc.next();
		System.out.println("Set new password");
		password=sc.next();
		j=usimpl.updatePassword(password, uname);
		System.out.println(j + " record updated..");
		break;
	case 3:
		System.out.println("Enter username");
		uname=sc.next();
		j=usimpl.deleteUser(uname);
		System.out.println(j +" record deleted..");
		break;
	case 4:
		System.out.println("Enter username");
		uname=sc.next();
        usimpl.displayUser(uname);
		break;
	case 5:
        usimpl.displayAllUsers();
		break;
	case 6:
        System.exit(0);
		break;

	default:
		System.out.println("Enter proper choice");
		break;
	}
    sc.close();
    }
    public static void name() {
		System.out.println("1.Create a User");
		System.out.println("2.Update password");
		System.out.println("3.Delete a User");
		System.out.println("4.Retrieve a User");
		System.out.println("5.List of all User");
		System.out.println("6.Exit");
		
	}
   
}
