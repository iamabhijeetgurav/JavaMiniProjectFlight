package com.cybage.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.BookTicket;
import com.cybage.model.User;
import com.cybage.service.UserService;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class BookTicketController
 */
@WebServlet("/BookTicketController")
public class BookTicketController extends HttpServlet {
	private UserService userService= new UserServiceImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookTicketController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		if(request.getParameter("schedule-date")!=null) {
			Date scheduleDate=Date.valueOf(request.getParameter("schedule-date"));
			System.out.println(scheduleDate);
			int noOfPassengers=Integer.parseInt(request.getParameter("no-of-passenger"));
			int userId=(int) session.getAttribute("userId");
			int flightId=(int) session.getAttribute("flightId");
			BookTicket ticketToBeBooked= new BookTicket(scheduleDate, noOfPassengers, userId, flightId); 
			try {
				userService.bookATicket(ticketToBeBooked);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
