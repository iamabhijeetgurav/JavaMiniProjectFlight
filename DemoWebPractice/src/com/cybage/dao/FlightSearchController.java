package com.cybage.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Flight;

/**
 * Servlet implementation class FlightSearchController
 */
@WebServlet("/FlightSearchController")
public class FlightSearchController extends HttpServlet {
	private IUserDAO userDao= new UserDaoImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source=request.getParameter("input-from");
		String destination= request.getParameter("input-to");
		List<Flight> flightslist;
		try {
			flightslist = userDao.getAllFlightsBySourceAndDestination(source, destination);
			System.out.println(flightslist);
			if(flightslist!=null) {
				HttpSession session= request.getSession();
				session.setAttribute("flightslist", flightslist);
				session.setAttribute("flightId",flightslist.get(0));
				
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
