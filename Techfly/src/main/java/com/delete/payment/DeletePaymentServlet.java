package com.delete.payment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.Payment.payment;
import com.system.Payment.paymentDButil;


@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cardnumber = request.getParameter("cardnumber");
		
		
		boolean isTrue;
		
		isTrue = paymentDButil.deletepayment(cardnumber );
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("paymentlogin.jsp");
			dispatcher.forward(request, response);
		}
		
		else {
			String email = null;
			String password = null;
			List<payment> paymentprofileDetails = paymentDButil.loginpayment(email,password);
			request.setAttribute("paymentprofileDetails", paymentprofileDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("paymentprofile.jsp");
			dispatcher.forward(request, response);
		}
		
	}
	}


