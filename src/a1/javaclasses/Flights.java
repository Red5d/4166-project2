package a1.javaclasses;

import java.sql.*;

public class Flights {
	DBClass d;
	private int flightNumber;
	private String flightSource;
	private String flightDestination;
	private String dateOfTravel;
	private String numSeats;
	private String typeOfClass;
	private int stops;
	private String arrival;
	private String departure;
	private double cost;
	
	
	public Flights(String source, String destination, String travelDate, String noOfSeats, String classType)
	{
		d = new DBClass();
		d.connectMeIn();
		this.flightSource = source;
		this.flightDestination = destination;
		this.dateOfTravel = travelDate;
		this.numSeats = noOfSeats;
		this.typeOfClass = classType;
	}
	
	public Flights()
	{
		d = new DBClass();
		d.connectMeIn();
	}
	
	public void setFlightSource(String source)
	{
		this.flightSource = source;
	}
	
	public String getFlightSource()
	{
		return flightSource;
	}

	public void setFlightDestination(String destination)
	{
		this.flightDestination = destination;
	}
	
	public String getFlightDestination()
	{
		return flightDestination;
	}

	public void setTravelDate(String travelDate)
	{
		this.dateOfTravel = travelDate;
	}
	
	public String getTravelDate()
	{
		return dateOfTravel;
	}

	public void setNumOfSeats(String noOfSeats)
	{
		this.numSeats = noOfSeats;
	}
	
	public String getnumOfSeats()
	{
		return numSeats;
	}

	public void setTypeOfClass(String classType)
	{
		this.typeOfClass = classType;
	}
	
	public String getTypeOfClass()
	{
		return typeOfClass;
	}
	
	public void setFlightNumber(int flightNum){
		this.flightNumber = flightNum;
	}
	
	public int getFlightNumber(){
		return flightNumber;
	}
	
	
	public void checkFlights(/*String source, String destination, String travelDate, String noOfSeats, String classType*/){
		/*
		flightSource = source;
		flightDestination = destination;
		dateOfTravel = travelDate;
		numSeats = noOfSeats;
		typeOfClass = classType;
		*/
		String SQL = "SELECT * FROM FLIGHTS WHERE SOURCE = " + flightSource;
		ResultSet rs = d.execute(SQL);
	    try {
			while (rs.next()) 
			{
				this.flightNumber = Integer.parseInt("FLIGHTNUMBER");
				this.cost = Integer.parseInt(rs.getString("COST"));
				this.dateOfTravel = rs.getString("FLIGHTDATE");
				this.arrival = rs.getString("ARRIVAL");
				this.departure = rs.getString("DEPARTURE");
				this.stops = Integer.parseInt(rs.getString("STOPS"));
			    
			      
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

