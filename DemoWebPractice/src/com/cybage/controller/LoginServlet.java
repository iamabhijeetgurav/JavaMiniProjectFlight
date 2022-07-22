package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.dao.UserDao;
import com.cybage.model.User;
import com.cybage.services.UserService;
import com.cybage.services.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService= new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			User user = new User();
			
			
			String email = request.getParameter("user-email");
	        String password = request.getParameter("user-password");
	        // To verify whether entered data is printing correctly or not
	        System.out.println("emailId.." + email);
	        System.out.println("password.." + password);
	        
	        if (email != null  && password != null ) {
	            // We can redirect the page to a welcome page
	            // Need to pass the values in session in order
	              // to carry forward that one to next pages
	            HttpSession httpSession = request.getSession();
	            // By setting the variable in session, it can be forwarded
	            httpSession.setAttribute("emailId", email);
	            userService.findUser();
	            request.getRequestDispatcher("index.jsp").forward(request, response);
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
