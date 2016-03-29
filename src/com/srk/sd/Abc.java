package com.srk.sd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Abc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
        Statement statement = connection.createStatement();
	    String ddl = "create table STUDENT ( "
      + "   id INT PRIMARY KEY, firstName VARCHAR(20), lastName VARCHAR(20), "
      + "   title VARCHAR(20), salary INT )";
		statement.execute(ddl);
	     System.out.println("table created successfully");
		}
	}
	}
