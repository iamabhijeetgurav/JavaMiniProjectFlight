package com.cybage.controller;

import java.io.IOException;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.User;
import com.cybage.services.UserService;
import com.cybage.services.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private UserService userService= new UserServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<User> userlist= userService.getAllUsers();
//		System.out.println(userlist);
		
		if(request.getParameter("user-email")!=null) {
			String firstName=request.getParameter("first-name");
			System.out.println(firstName);
			String lastName=request.getParameter("last-name");
			String email=request.getParameter("user-email");
			String password=request.getParameter("user-password");
			String mobile=request.getParameter("user-mobile");
			String role = request.getParameter("user-role");
			User user= new User(0, firstName, lastName, email, password, mobile,role);
			userService.addUser(user);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
