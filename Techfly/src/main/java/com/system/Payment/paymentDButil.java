package com.system.Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.system.Payment.DBConnection;
import com.system.Payment.payment;


public class paymentDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	


	public static List<payment> validate(String email, String password) {
		
		ArrayList<payment> usr = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/techfly";
		String user = "root";
		String pass = "MBgh0830#$";
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from paymentregistration where email='"+email+"' and password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String cardnumber = rs.getString(1);
				String cardtype = rs.getString(2);
				String exmonth = rs.getString(3);
				String exyear= rs.getString(4);
				String cvv = rs.getString(5);
				String Email = rs.getString(6);
				String name = rs.getString(7);
				String passU = rs.getString(8);
				
				payment p = new payment(cardnumber,cardtype,exmonth,exyear,cvv,Email,name,passU);
				usr.add(p);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return usr;			
	}
	
	public static List<payment> loginpayment(String email, String password) {
		ArrayList<payment> paymentProfileDetails = new ArrayList<payment>();

		try {

			con = DBConnection.getConnection();

			stmt = con.createStatement();

			String query = "SELECT * FROM paymentregistration WHERE email = '" + email + "' AND password = '" + password + "'";

			rs = stmt.executeQuery(query);

			if (rs.next()) {

				String cardnumber = rs.getString(1);
				String cardtype = rs.getString(2);
				String exmonth = rs.getString(3);
				String exyear= rs.getString(4);
				String cvv = rs.getString(5);
				String Email = rs.getString(6);
				String name = rs.getString(7);
				String passU = rs.getString(8);
				
				payment c = new payment(cardnumber,cardtype,exmonth,exyear,cvv,Email,name,passU);
				//pass to array list
				paymentProfileDetails.add(c);
			} 

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				con.close();// close the connection
			} catch (SQLException e) {

				e.printStackTrace();// if connection close failed then print stacktrace
			}
		}

		return paymentProfileDetails;
	}
	
	public static boolean insertpayment(String cardnumber, String cardtype, String exmonth, String exyear, String cvv, String email,
			String name, String password) {
		
		boolean isSuccess = false;
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/techfly";
		String user = "root";
		String pass = "MBgh0830#$";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "insert into paymentregistration values ('"+cardnumber+"','"+cardtype+"','"+exmonth+"','"+exyear+"','"+cvv+"','"+email+"','"+name +"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false; 
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean Updatepayment(String cardnumber, String cardtype, String exmonth, String exyear, String cvv, String email,
			String name, String password) {
		
		boolean isUpdated = false;
	
		try {
			
			Connection con = DBConnection.getConnection();
			Statement stmt = con.createStatement();
			String sql = "update paymentregistration  set cardnumber='"+cardnumber+"',cardtype='"+cardtype+"',exmonth='"+exmonth+"',exyear='"+exyear+"', cvv='"+ cvv+"',email='"+email+"',name='"+name+"' ,password='"+password +"' where cardnumber ='"+cardnumber+"' ";
			
			int rs = stmt.executeUpdate(sql);
			
			if( rs > 0) {
				isUpdated = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	public static boolean deletepayment(String cardnumber) {
		
		//int intId = Integer.parseInt(cardnumber);
		
		boolean isSuccess = false;
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM paymentregistration WHERE cardnumber ='"+cardnumber+"'";
			int rs =stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false; 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
		
	}

}




