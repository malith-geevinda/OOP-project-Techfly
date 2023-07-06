package com.registration.Payment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PaymentRegistrationServlet")
public class PaymentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cardnumber = request.getParameter("cardnumber");
		String cardtype = request.getParameter("cardtype");
		String exmonth = request.getParameter("exmonth");
		String exyear = request.getParameter("exyear");
		String cvv  = request.getParameter("cvv");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String passU = request.getParameter("password");
		
		RequestDispatcher dispatcher = null;
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techfly","root","MBgh0830#$");
			PreparedStatement pst = con.prepareStatement("insert into paymentregistration(cardnumber,cardtype,exmonth,exyear,cvv,email,name,password)values(?,?,?,?,?,?,?,?)");
			pst.setString(1, cardnumber);
			pst.setString(2, cardtype);
			pst.setString(3, exmonth);
			pst.setString(4, exyear);
			pst.setString(5, cvv);
			pst.setString(6, email);
			pst.setString(7, name);
			pst.setString(8, passU);
		
			
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("paymentregistration.jsp");
			if(rowCount > 0) {
				request.setAttribute("status", "sucess");
				
			}else {
				request.setAttribute("status", "failed");
			}
			
			dispatcher.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
		}
			catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}

}
