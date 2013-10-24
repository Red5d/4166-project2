package a1.servlets;

import a1.javaclasses.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		// TODO Auto-generated method stub
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		Users checkUser = new Users(userName,passWord);
		
		checkUser.check();
		
		Boolean loggedIn = checkUser.getLoggedIn();
		
		if(loggedIn == true){
			response.sendRedirect("FlightSearch.jsp");
		}
		else{
			response.sendRedirect("Login.jsp");
		}
		
		//response.sendRedirect("FlightSearch.jsp");
		
		
		//Users userStuff = new Users(userName,passWord,"hello@gmail.com", "date");
		
		//userStuff.Users();
		
		/*
		Properties p = new Properties();
		FileInputStream fis = null;
		try {
		    fis = new FileInputStream("/users.properties");
		    p.load(fis);
		    
		    String password = p.getProperty(userName);  
			
			
			if(password.equals(passWord))
			{
				response.sendRedirect("FlightSearch.jsp");
			}
			else
			{
				
				 response.setContentType("text/html;charset=UTF-8"); 
					PrintWriter out = response.getWriter(); 
					
					out.println( 
							"<html> \n" + 
							"<body> \n" + 
							"<p>Login Failed</p> \n" +
							"<p><a href='Login.jsp'>Try Again</a>" +
							"</body> \n" + 
							"</html>");
			}
		    
		} catch (FileNotFoundException e) {
		    System.out.println("FileNotFound");
		} catch (IOException e) {
		    System.out.println("IOEXCeption");
		} finally {
		    if (null != fis)
		    {
		        try
		        {
		            fis.close();
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		    }
		}*/
		
		
	}

}
