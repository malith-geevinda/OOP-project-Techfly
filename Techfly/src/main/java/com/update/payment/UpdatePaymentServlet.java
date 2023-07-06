package com.update.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.Payment.paymentDButil;


@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cardnumber = request.getParameter("cardnumber");
		String cardtype = request.getParameter("cardtype");
		String exmonth = request.getParameter("exmonth");
		String exyear = request.getParameter("exyear");
		String cvv  = request.getParameter("cvv");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		int intId = Integer.parseInt(cardnumber);
		
		boolean isTrue;
		
		isTrue = paymentDButil.Updatepayment(cardnumber,cardtype, exmonth,exyear,cvv, email, name , password);
		
		if(isTrue ==  true) {
			RequestDispatcher dis = request.getRequestDispatcher("paymentprofile.jsp");
			dis.forward(request , response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("paymentprofile.jsp");
			dis.forward(request , response);
		}
		
	}
		
		
		
	}


