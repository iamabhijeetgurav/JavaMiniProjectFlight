package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Feedback;
import com.cybage.services.UserServiceImpl;

/**
 * Servlet implementation class FeedbackController
 */
@WebServlet("/FeedbackController")
public class FeedbackController extends HttpServlet {
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rating=1;
		int userId = Integer.parseInt(request.getParameter("user-id"));
		int bookingId = Integer.parseInt(request.getParameter("booking-id"));
		String description = request.getParameter("description");
		Feedback feedback = new Feedback(userId,bookingId,rating,description);
		userServiceImpl.addFeedback(feedback);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
