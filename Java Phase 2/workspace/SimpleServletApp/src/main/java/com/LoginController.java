package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");    
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
	RequestDispatcher rd1 = request.getRequestDispatcher("Home");
	RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
	HttpSession hs = request.getSession();
		if(emailid.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login");
			//request.setAttribute("emailid", emailid);
			//rd1.forward(request, response);			// we can see the output of target page
			hs.setAttribute("emailid", emailid);
			Cookie cc = new Cookie("emailid", emailid);
			response.addCookie(cc);
			response.sendRedirect("Home");	
		}else {
			pw.println("failure try once again");
			rd2.include(request, response);		// we can see the output of source + target
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
