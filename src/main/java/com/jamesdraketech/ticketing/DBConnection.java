package com.jamesdraketech.ticketing;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/");
		} catch (Exception e) {
			
		}
	}

}
