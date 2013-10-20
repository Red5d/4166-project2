package a1.servlets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a1.javaclasses.Users;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private String userName;
	//private String passWord;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		
		 String userName = request.getParameter("userName");
		 String passWord = request.getParameter("passWord");
		 String email = request.getParameter("email");
		 String bDate = request.getParameter("bDate");
		 
		 Users userD = new Users(userName,passWord,email,bDate);
		 
		 userD.insert();
		 
		 
		 
		
		 //userD.User(userName,passWord,email,bDate);
		 
		/* 
		 Properties p = new Properties();
			FileInputStream fis = null;
			try {
			    fis = new FileInputStream("/users.properties");
			    p.load(fis);
			    p.setProperty(userName, passWord);
			    p.store(new FileOutputStream("/users.properties"), null);
			    response.sendRedirect("Login.jsp");
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
