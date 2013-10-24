package a1.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*; 


import a1.javaclasses.Flights;

/**
 * Servlet implementation class FlightSearchQueryServlet
 */
@WebServlet("/FlightSearchQueryServlet")
public class FlightSearchQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearchQueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubHttpSession = new request.getSession();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String travelDate = request.getParameter("travelDate");
		String noOfSeats = request.getParameter("noOfSeats");
		String classType = request.getParameter("classType");
		
		
		Flights flight = new Flights(source,destination,travelDate,noOfSeats,classType);
		
		flight.checkFlights();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("Flight", flight);
	
		
		RequestDispatcher view = request.getRequestDispatcher("SearchResult.jsp");  
	    view.forward(request,response);  
		
		//response.sendRedirect("SearchResult.jsp");
		
	}

}
