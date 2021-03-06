package a1.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import a1.javaclasses.Flights;

/**
 * Servlet implementation class FlightSearchResultsServlet
 */
@WebServlet("/FlightSearchResultsServlet")
public class FlightSearchResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearchResultsServlet() {
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
		 HttpSession session = request.getSession();
		    Flights flight =
		      (Flights)session.getAttribute("Flight");
		    
		  /*  if (flight == null) {
		    	
				 
			     flight = new Flights();
			     session.setAttribute("Flights", flight);
			    }
		    */
		    RequestDispatcher dispatcher =
				      request.getRequestDispatcher("view-book.jsp");
				    dispatcher.forward(request, response);
		
	}

}
