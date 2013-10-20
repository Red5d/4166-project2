package a1.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
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
		
		response.sendRedirect("SearchResult.jsp");
		
	}

}
