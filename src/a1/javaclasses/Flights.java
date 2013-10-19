package a1.javaclasses;

import java.sql.*;

public class Flights {
	DBClass d;
	
	public Flights()
	{
		
		d = new DBClass();
		d.connectMeIn();
	}
	public void checkFlights(){
		
	}
}
