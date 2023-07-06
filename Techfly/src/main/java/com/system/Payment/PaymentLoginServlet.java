package com.system.Payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentLoginServlet
 */
@WebServlet("/PaymentLoginServlet")
public class PaymentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		RequestDispatcher dispatcher = null;
		
		List<payment> userProfileDetails = paymentDButil.loginpayment(email, password);
		
		if( userProfileDetails.isEmpty()) {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("cardnumber", userProfileDetails.get(0).getCardnumber());
			request.setAttribute("details", userProfileDetails);
			dispatcher = request.getRequestDispatcher("paymentprofile.jsp");
			dispatcher.forward(request,response);
		}

	}

}
