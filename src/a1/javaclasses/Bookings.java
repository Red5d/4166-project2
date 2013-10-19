package a1.javaclasses;

import java.sql.*;

public class Bookings {
	private int bookingId;
	private String username;
	private String flightId;
	private String date;
	private int numberOfSeats;
	private String accountId;
	private double totalCost;
	DBClass d;
	
	public Bookings(String username, String flightId, String date, int numberOfSeats, String accountId, double totalCost)
	{
		d = new DBClass();
		d.connectMeIn();
		//this.bookingId = bookingId;
		this.username = username;
		this.date = date;
		this.flightId = flightId;
		this.numberOfSeats = numberOfSeats;
		this.accountId = accountId;
		this.totalCost = totalCost;
	}
	
	public Bookings()
	{
		d = new DBClass();
		d.connectMeIn();
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}

	public void setBookingId(int bookingId)
	{
		this.bookingId = bookingId;
	}
	
	public int getBookingId()
	{
		return bookingId;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getDate()
	{
		return date;
	}

	public void setFlightId(String flightId)
	{
		this.flightId = flightId;
	}
	
	public String getFlightId()
	{
		return flightId;
	}

	public void setNumberOfSeats(int numberOfSeats)
	{
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getAccountId()
	{
		return accountId;
	}

	public void setTotalCost(double totalCost)
	{
		this.totalCost = totalCost;
	}
	
	public double getTotalCost()
	{
		return totalCost;
	}
	
	public void insert()
	{
		int id=0;
		ResultSet rs = d.execute("select max(bookingid)+1 from bookings");
		try {
			while(rs.next())
				id = Integer.parseInt(rs.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String SQL = "INSERT INTO bookings VALUES ("+id+", '" + username + "', '" + flightId + "', '" + date + "', "+ numberOfSeats+ ", '"+accountId+"', "+totalCost+")";
	    d.insert(SQL);
	}
	
	public void getData(int i)
	{
		this.bookingId = i;
		String SQL = "SELECT * FROM bookings WHERE bookingid = "+i;
		ResultSet rs = d.execute(SQL);
	    try {
			while (rs.next()) 
			{
			    username = rs.getString("username");
			    flightId = rs.getString("flightid");
			    date = rs.getString("date");
			    numberOfSeats = Integer.parseInt(rs.getString("numberofseats"));
			    accountId = rs.getString("accountid");
			    totalCost = Double.parseDouble(rs.getString("totalcost"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		d.closeConnection();
	}
}
