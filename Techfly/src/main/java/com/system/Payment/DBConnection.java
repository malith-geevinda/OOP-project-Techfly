package com.system.Payment;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBConnection {
	
	
	    private static String url = "jdbc:mysql://localhost:3306/techfly";
	    private static String user  = "root";
	    private static String pass  = "MBgh0830#$";
	    private static Connection con;
	    
	    public static Connection getConnection() {
	        
	        try {
	            
	            Class.forName("com.mysql.jdbc.Driver");
	            
	            con = DriverManager.getConnection(url,user,pass);
	            
	        }
	        catch(Exception e) {
	            System.out.println("Database connection is not successful !!!");
	        }
	        return con;

}
}





