package a1.javaclasses;

import java.sql.*;
import java.util.HashMap;




public class Flights {
	DBClass d;
	private int flightNumber;
	private String flightSource;
	private String flightDestination;
	private String travelDate;
	private String seatNumber;
	private int seatTotal;
	private int seatsTaken;
	private String typeOfClass;
	private String arrival;
	private String departure;
	private double cost;
	private String stops;
	private String aircraft;
	private String duration;
	
	
	public Flights(String source, String destination, String travelDate, String noOfSeats, String classType)
	{
		d = new DBClass();
		d.connectMeIn();
		this.flightSource = source;
		this.flightDestination = destination;
		this.travelDate = travelDate;
		this.seatNumber = noOfSeats;
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
		this.travelDate = travelDate;
	}
	
	public String getTravelDate()
	{
		return travelDate;
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
	
	public void setCost(double cost){
		this.cost = cost;
	}
	public double getCost(){
		return cost;
	}
	
	public void setArrival(String arrival){
		this.arrival = arrival;
	}
	public String getArrival(){
		return arrival;
	}
	
	public void setDeparture(String departure){
		this.departure = departure;
	}
	public String getDeparture(){
		return departure;
	}
	public void setStops(String stop){
		this.stops = stop;
	}
	public String getStops(){
		return stops;
	}
	
	public void setDurtion(String duration)
	{
		this.duration = duration;
	}
	
	public String getDuration()
	{
		return duration;
	}
	
	public void setAircraft(String aircraft)
	{
		this.aircraft = aircraft;
	}
	
	public String getAircraft()
	{
		return aircraft;
	}
	
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;
	}
	
	public String getSeatNumber()
	{
		return seatNumber;
	}
	
	public void setSeatTotal(int seatTotal)
	{
		this.seatTotal = seatTotal;
	}
	
	public int getSeatTotal()
	{
		return seatTotal;
	}
	
	public void setSeatsTaken(int seatsTaken)
	{
		this.seatsTaken = seatsTaken;
	}
	
	public int getSeatsTaken()
	{
		return seatsTaken;
	}
	
	
	public void checkFlights(){
		/*
		flightSource = source;
		flightDestination = destination;
		dateOfTravel = travelDate;
		numSeats = noOfSeats;
		typeOfClass = classType;
		*/
		String SQL = "SELECT * FROM FLIGHTS WHERE SOURCE = '" + flightSource +"'";
		ResultSet rs = d.execute(SQL);
	    try {
			while (rs.next()) 
			{
				flightNumber = Integer.parseInt(rs.getString("FLIGHTNUMBER"));
				travelDate = rs.getString("TRAVELDATE");
				cost = Integer.parseInt(rs.getString("COST"));
				arrival = rs.getString("ARRIVAL");
				departure = rs.getString("DEPARTURE");
				stops = rs.getString("STOPS");
				seatNumber = rs.getString("SEATS_TOTAL");
				duration = rs.getString("DURATION");
				aircraft = rs.getString("AIRCRAFT TYPE");
				seatTotal = Integer.parseInt(rs.getString("SEATS_TOTAL"));
				seatsTaken = Integer.parseInt(rs.getString("SEATS_TAKEN")); 
			      
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

