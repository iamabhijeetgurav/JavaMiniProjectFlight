package com.cybage.controller;

import java.io.IOException;
import java.sql.Time;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Flight;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AddFlightController extends HttpServlet {
	private AdminService adminService = new AdminServiceImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFlightController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// | id | flight_name | arrival_time | departure_time | source | destination |
		// flight_type | flight_fare | no_of_seats | is_available |
		String flightName =request.getParameter("flight-name");
		Time arrivalTime = Time.valueOf(request.getParameter("departureTime"));
		Time departureTime = Time.valueOf(request.getParameter("arrivalTime"));
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String flightType = request.getParameter("flightType");
		double flightFare = Double.parseDouble(request.getParameter("flightFare"));
		Flight flight = new Flight(flightName, arrivalTime, departureTime, source, destination, flightType, flightFare);
		adminService.addFlight(flight);
		request.getRequestDispatcher("admin.jsp").forward(request, response);

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
